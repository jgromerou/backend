package com.portfolio.backend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
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
  
  @NotNull
  @JsonFormat(pattern="dd-MM-yyyy")
    private Date fechanacimiento;
  
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
  @Size(max = 40)
  @NotNull
  private String estadocivil;
  
  @NotBlank
  @Size(max = 255)
  @NotNull
  private String acercade;
  
  @Size(max = 100)
  private String fotoPerfil;
  
  public Persona() {
  }
  public Persona(Long idPersona) {
        super();
        this.idPersona = idPersona;
    }
  

  public Persona( String nombres,String apellidos, String email,
           Date fechanacimiento, String telefono, String domicilio, String nacionalidad,
          String estadocivil, String acercade, String fotoPerfil) {
   
    
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.email = email;
    this.fechanacimiento = fechanacimiento;
    this.telefono = telefono;
    this.domicilio = domicilio;
    this.nacionalidad = nacionalidad;
    this.estadocivil = estadocivil;
    this.acercade = acercade;
    this.fotoPerfil = fotoPerfil;
  }

  public Long getIdPersona() {
    return idPersona;
  }

  public void setIdPersona(Long idPersona) {
    this.idPersona = idPersona;
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
  
   public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
   public Date getFechanacimiento() {
    return fechanacimiento;
  }

  public void setFechanacimiento(Date fechanacimiento) {
    this.fechanacimiento = fechanacimiento;
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
  
   public String getEstadocivil() {
    return estadocivil;
  }
  
  public void setEstadocivil(String estadocivil) {
    this.estadocivil = estadocivil;
  }
  
  public String getAcercade() {
    return acercade;
  }
  
  public void setAcercade(String acercade) {
    this.acercade = acercade;
  }
  
  public String getFotoPerfil() {
    return fotoPerfil;
  }
  
  public void setFotoPerfil(String fotoPerfil) {
    this.fotoPerfil = fotoPerfil;
  }
}
