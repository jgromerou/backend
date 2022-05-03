package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import java.util.List;

/**
 *
 * @author gerardo romero uro
 */
public interface IEducacionService {
    
    //método para traer todas las educaciones
    public List<Educacion> getEducaciones();

    //método para crear una educacion
    public void saveEducacion (Educacion educacion);
   
    //método para eliminar una educacion por id
    public void deleteEducacion(Long id);

    //método para buscar una educacion por id
    public Educacion getEducacionById(Long id);
    
    //método para buscar una educacion por instituto 
    public List<Educacion> getEducacionByInstituto(String educacion);

    public List<Educacion> getEducacion();
}

