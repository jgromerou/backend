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
@Table(name = "proyectos",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "idProyecto")
       })
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idProyecto;
    
    @NotBlank
    @NotNull
    @Size(max = 40)
    private String proyecto;
   
    
    @NotBlank
    @NotNull
    @Size(max = 40)
    private String tecnologia;
    
    @ManyToOne
    @JoinColumn(name ="idUsuario", insertable = true,
                 updatable = true, referencedColumnName = "idUsuario")
    private Usuario usuario;
}

