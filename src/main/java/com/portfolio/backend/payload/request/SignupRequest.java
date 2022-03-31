package com.portfolio.backend.payload.request;

import java.util.Set;

import javax.validation.constraints.*;
 
public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
 
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    
    private Set<String> rol;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
    
    @NotBlank
    @Size(min = 3, max = 20)
    private String nombres;
    
    @NotBlank
    @Size(min = 3, max = 20)
    private String apellidos;
    
    @NotBlank
    @Size(min = 3, max = 20)
    private String telefono;
    
    @NotBlank
    @Size(min = 3, max = 20)
    private String domicilio;
    
    @NotBlank
    @Size(min = 3, max = 20)
    private String nacionalidad;
    
    private String fotoperfil;
  
    public String getUsername() {
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
    
    public Set<String> getRol() {
      return this.rol;
    }
    
    public void setRol(Set<String> rol) {
      this.rol = rol;
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
    
     public String getFotoperfil() {
        return fotoperfil;
    }
 
    public void setFotoperfil(String fotoperfil) {
        this.fotoperfil = fotoperfil;
    }
}
