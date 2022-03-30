package com.portfolio.backend.model;
/**
 *
 * @author gerardo romero uro
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private int edad;
}
