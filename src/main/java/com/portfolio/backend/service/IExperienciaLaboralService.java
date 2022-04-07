package com.portfolio.backend.service;

import com.portfolio.backend.model.ExperienciaLaboral;
import java.util.List;

/**
 *
 * @author gerardo romero uro
 */
public interface IExperienciaLaboralService {
    
    //método para traer todas las experiencias laborales
    public List<ExperienciaLaboral> getExperienciasLaborales();

    //método para crear una experiencia laboral
    public void saveExperienciaLaboral (ExperienciaLaboral experienciaLaboral);
   
    //método para eliminar una experiencia laboral por id
    public void deleteExperienciaLaboral(Long id);

    //método para buscar una ExperienciaLaboral por id
    public ExperienciaLaboral getExperienciaLaboralById(Long id);
    
    //método para buscar una habilidad por nombre de empresa
    public List<ExperienciaLaboral> getExperienciaLaboralByEmpresa(String empresa);

    public List<ExperienciaLaboral> getExperienciaLaboral();
}
