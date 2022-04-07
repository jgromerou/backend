package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import java.util.List;

/**
 *
 * @author gerardo romero uro
 */
public interface IProyectoService {
    
    //método para traer todas las proyectos
    public List<Proyecto> getProyectos();

    //método para crear un proyecto
    public void saveProyecto (Proyecto proyecto);
   
    //método para eliminar una proyecto por id
    public void deleteProyecto(Long id);

    //método para buscar una proyecto por id
    public Proyecto getProyectoById(Long id);
    
    //método para buscar una proyecto por nombre de proyecto
    public List<Proyecto> getProyectoByNombre(String proyecto);

    public List<Proyecto> getProyecto();
}

