package com.portfolio.backend.security.services;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.portfolio.backend.model.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UsuarioDetallesImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private Long idUsuario;

  private String username;

  @JsonIgnore
  private String password;

  private Collection<? extends GrantedAuthority> authorities;

  public UsuarioDetallesImpl(Long idUsuario, String username, String password,
      Collection<? extends GrantedAuthority> authorities) {
    this.idUsuario = idUsuario;
    this.username = username;
    this.password = password;
    this.authorities = authorities;
  }

  public static UsuarioDetallesImpl build(Usuario usuario) {
    List<GrantedAuthority> authorities = usuario.getRoles().stream()
        .map(rol -> new SimpleGrantedAuthority(rol.getRol().name()))
        .collect(Collectors.toList());

    return new UsuarioDetallesImpl(
        usuario.getIdUsuario(), 
        usuario.getusername(), 
        usuario.getPassword(), 
        authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public Long getIdUsuario() {
    return idUsuario;
  }
  
   @Override
    public String getUsername() {
        return username;
    }

 
   @Override
    public String getPassword() {
        return password;
    }

   
  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UsuarioDetallesImpl usuario = (UsuarioDetallesImpl) o;
    return Objects.equals(idUsuario, usuario.idUsuario);
  }
}

