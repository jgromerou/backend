package com.portfolio.backend.model;
/**
 *
 * @author gerardo romero uro
 */
import javax.persistence.*;

@Entity
@Table(name = "Roles")
public class Rol {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idRol;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole rol;

  public Rol() {

  }

  public Rol(ERole rol) {
    this.rol = rol;
  }

  public Integer getIdRol() {
    return idRol;
  }

  public void setId(Integer idRol) {
    this.idRol = idRol;
  }

  public ERole getRol() {
    return rol;
  }

  public void setRol(ERole rol) {
    this.rol = rol;
  }
}
