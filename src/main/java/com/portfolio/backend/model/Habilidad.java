package com.portfolio.backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "habilidades",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "idHabilidad"),
           @UniqueConstraint(columnNames = "habilidad")
       })
public class Habilidad {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idHabilidad;
    
    @NotBlank
    @NotNull
    @Size(max = 40)
    private String habilidad;
   
    
    private int porcentaje_habilidad;
    
    @ManyToOne
    @JoinColumn(name ="idPersona", insertable = true,
                 updatable = true, referencedColumnName = "idPersona")
    private Persona persona;
}
