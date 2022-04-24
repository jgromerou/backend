package com.portfolio.backend.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.backend.model.ERole;
import com.portfolio.backend.model.Rol;
import com.portfolio.backend.model.Usuario;
import com.portfolio.backend.payload.request.LoginRequest;
import com.portfolio.backend.payload.request.SignupRequest;
import com.portfolio.backend.payload.response.JwtResponse;
import com.portfolio.backend.payload.response.UserInfoResponse;
import com.portfolio.backend.payload.response.MessageResponse;
import com.portfolio.backend.repository.RoleRepository;
import com.portfolio.backend.repository.UserRepository;
import com.portfolio.backend.security.jwt.JwtUtils;
import com.portfolio.backend.security.services.UsuarioDetallesImpl;
import org.springframework.security.access.prepost.PreAuthorize;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class UsuarioController {
  @Autowired
  AuthenticationManager authenticationManager;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;

  @Autowired
  PasswordEncoder encoder;

  @Autowired
  JwtUtils jwtUtils;

  @PostMapping("/login")
  public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

    Authentication authentication = authenticationManager
        .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

    SecurityContextHolder.getContext().setAuthentication(authentication);

    UsuarioDetallesImpl userDetails = (UsuarioDetallesImpl) authentication.getPrincipal();

    //ResponseCookie jwt = jwtUtils.generateJwtCookie(userDetails);
    String jwt = jwtUtils.generateJwtToken(authentication);

    List<String> roles = userDetails.getAuthorities().stream()
        .map(item -> item.getAuthority())
        .collect(Collectors.toList());

    return ResponseEntity.ok(new JwtResponse(jwt, 
                         userDetails.getIdUsuario(), 
                         userDetails.getUsername(),            
                         roles));
  }

  
  @PostMapping("/registrar")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
    if (userRepository.existsByUsername(signUpRequest.getUsername())) {
      return ResponseEntity.badRequest().body(new MessageResponse("Error: Este nombre de usuario ya está en uso."));
    }

    // Crear nueva cuenta de usuario
    Usuario user = new Usuario(signUpRequest.getUsername(),        
                         encoder.encode(signUpRequest.getPassword()));
                         
    Set<String> strRoles = signUpRequest.getRol();
    Set<Rol> roles = new HashSet<>();

    if (strRoles == null) {
      Rol userRole = roleRepository.findByRol(ERole.ROLE_USUARIO)
          .orElseThrow(() -> new RuntimeException("Error: Rol no está funcionando."));
      roles.add(userRole);
    } else {
      strRoles.forEach(role -> {
        switch (role) {
        case "ADMIN":
          Rol adminRole = roleRepository.findByRol(ERole.ROLE_ADMIN)
              .orElseThrow(() -> new RuntimeException("Error: Rol no está funcionando."));
          roles.add(adminRole);

          break;
        default:
          Rol userRole = roleRepository.findByRol(ERole.ROLE_USUARIO)
              .orElseThrow(() -> new RuntimeException("Error: Rol no está funcionando."));
          roles.add(userRole);
        }
      });
    }

    user.setRoles(roles);
    userRepository.save(user);

    return ResponseEntity.ok(new MessageResponse("Usuario registrado correctamente"));
  }

  @PostMapping("/logout")
  public ResponseEntity<?> logoutUser() {
    ResponseCookie cookie = jwtUtils.getCleanJwtCookie();
    return ResponseEntity.ok().header(HttpHeaders.SET_COOKIE, cookie.toString())
        .body(new MessageResponse("Has sido desconectado."));
  }
}


