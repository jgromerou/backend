package com.portfolio.backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600,methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/api/test")
public class TestController {
  @GetMapping("/publico")
  public String allAccess() {
    return "Contenido Público";
  }

  @GetMapping("/usuario")
  @PreAuthorize("hasRole('USUARIO') or hasRole('ADMIN')")
  public String userAccess() {
    return "Contenido de Usuario.";
  }

  @GetMapping("/mod")
  @PreAuthorize("hasRole('MODERADOR')")
  public String moderatorAccess() {
    return "Contenido de moderador.";
  }

  @GetMapping("/admin")
   @PreAuthorize("hasRole('ADMIN')")
  public String adminAccess() {
    return "Contenido de admin.";
  }
}
