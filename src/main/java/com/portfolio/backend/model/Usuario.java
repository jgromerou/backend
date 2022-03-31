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

  //@OneToMany(mappedBy="usuario")
   // private Set<Habilidad> usuario;
  //@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
   // private  Set<Habilidad> usuario;
  
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
  
  @Size(max = 100)
  private String fotoPerfil;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(name = "Usuarios_Roles", 
             joinColumns = @JoinColumn(name = "idUsuario"),
             inverseJoinColumns = @JoinColumn(name = "idRol"))
  private Set<Rol> roles = new HashSet<>();

  public Usuario() {
  }
  public Usuario(Long idUsuario) {
        super();
        this.idUsuario = idUsuario;
    }
  

  public Usuario(String username, String email, String password, String nombres,
          String apellidos, String telefono, String domicilio, String nacionalidad,
          String fotoPerfil) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.domicilio = domicilio;
    this.nacionalidad = nacionalidad;
    this.fotoPerfil = fotoPerfil;
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
  
  public String getNombres() {
    return nombres;
  }

  public void setNombres(String nombres) {
    this.nombres = nombres;
  }
  
  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }
  
  public String getTelefono() {
    return telefono;
  }
  
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getDomicilio() {
    return domicilio;
  }
  
  public void setDomicilio(String domicilio) {
    this.domicilio = domicilio;
  }
  
  public String getNacionalidad() {
    return nacionalidad;
  }
  
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  
  public String getFotoPerfil() {
    return fotoPerfil;
  }
  
  public void setFotoPerfil(String fotoPerfil) {
    this.fotoPerfil = fotoPerfil;
  }
}

