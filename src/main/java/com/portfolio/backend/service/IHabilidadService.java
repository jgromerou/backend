package com.portfolio.backend.service;

import com.portfolio.backend.model.Habilidad;
import java.util.List;

/**
 *
 * @author gerardo romero uro
 */
public interface IHabilidadService {
    
    //método para traer todas las habilidades
    public List<Habilidad> getHabilidades();

    //método para dar de alta una habilidad
    public void saveHabilidad (Habilidad habilidad);
   
    //método para eliminar una habilidad por id
    public void deleteHabilidad(Long id);

    //método para buscar una habilidad por id
    public Habilidad getHabilidadById(Long id);
    
    //método para buscar una habilidad por nombre de habilidad
    public List<Habilidad> getHabilidadByNombre(String habilidad);

    public List<Habilidad> getHabilidad();
}
