package com.portfolio.backend.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author gerardo romero uro
 */
@Entity
@Table(name = "personas",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "idPersona"),
           @UniqueConstraint(columnNames = "email")
       })
public class Persona {
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idPersona;
    
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
  
  public Persona() {
  }
  public Persona(Long idPersona) {
        super();
        this.idPersona = idPersona;
    }
  

  public Persona(String email, String nombres,
          String apellidos, String telefono, String domicilio, String nacionalidad,
          String fotoPerfil) {
   
    this.email = email;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.domicilio = domicilio;
    this.nacionalidad = nacionalidad;
    this.fotoPerfil = fotoPerfil;
  }

  public Long getIdPersona() {
    return idPersona;
  }

  public void setId(Long idPersona) {
    this.idPersona = idPersona;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
