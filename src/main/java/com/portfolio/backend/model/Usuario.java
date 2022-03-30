package com.portfolio.backend.model;
/**
 *
 * @author gerardo romero uro
 */
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/*import lombok.Getter;
import lombok.Setter;
@Getter
@Setter*/
@Entity
@Table(name = "usuarios",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "idUsuario"),
           @UniqueConstraint(columnNames = "username"),
           @UniqueConstraint(columnNames = "email")
       })

public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idUsuario;

  @NotBlank
  @NotNull
  @Size(max = 40)
  private String username;

  @NotBlank
  @NotNull
  @Size(max = 100)
  private String password;
  
  @NotBlank
  @Size(max = 40)
  @NotNull
  private String nombres;
  
  @NotBlank
  @Size(max = 40)
  @NotNull
  private String apellidos;
  
  @NotBlank
  @Size(max = 100)
  @Email
  @NotNull
  private String email;
  
  @NotBlank
  @Size(max = 15)
  @NotNull
  private String telefono;
  
  @NotBlank
  @Size(max = 60)
  @NotNull
  private String domicilio;
  
  @NotBlank
  @Size(max = 40)
  @NotNull
  private String nacionalidad;
  
  @NotBlank
  @Size(max = 100)
  private String fotoPerfil;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "Usuarios_Roles", 
             joinColumns = @JoinColumn(name = "idUsuario"),
             inverseJoinColumns = @JoinColumn(name = "idRol"))
  private Set<Rol> roles = new HashSet<>();

  public Usuario() {
  }

  public Usuario(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public Long getIdUsuario() {
    return idUsuario;
  }

  public void setId(Long idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getusername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Rol> getRoles() {
    return roles;
  }

  public void setRoles(Set<Rol> roles) {
    this.roles = roles;
  }
}

