package com.portfolio.backend.service;

import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author gerardo romero uro
 */
public class EducacionService implements IEducacionService{
    @Autowired
    private EducacionRepository educacionRepository;

    /*@Override
    public List<ExperienciaLaboral> getExperienciasLaborales() {
        List<ExperienciaLaboral> listaExperienciasLaborales = experienciaLaboralRepository.findAll();
        return listaExperienciasLaborales;
    }

    @Override
    public void saveExperienciaLaboral(ExperienciaLaboral experienciaLaboral) {
       experienciaLaboralRepository.save(experienciaLaboral);
    }

    @Override
    public void deleteExperienciaLaboral(Long id) {
        experienciaLaboralRepository.deleteById(id);
    }

    @Override
    public ExperienciaLaboral getExperienciasLaboralesById(Long id) {
        ExperienciaLaboral listaExperienciasLaborales = experienciaLaboralRepository.getExperienciasLaboralesById(id);
        return listaExperienciasLaborales;
    }

    @Override
    public ExperienciaLaboral getExperienciasLaboralesByExperienciaLaboral(String experiencialaboral) {
        ExperienciaLaboral listaExperienciaLaborales = experienciaLaboralRepository.getExperienciasLaboralesByExperienciaLaboral(experiencialaboral);
        return listaExperienciaLaborales;
    }

    @Override
    public List<ExperienciaLaboral> getExperienciaLaboral() {
        List<ExperienciaLaboral> listaExperienciaLaboral = experienciaLaboralRepository.getExperienciasLaborales();
        return listaExperienciaLaboral;
    }*/

    @Override
    public List<Educacion> getEducaciones() {
        List<Educacion> listaEducacion = educacionRepository.findAll();
        return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion educacion) {
        educacionRepository.save(educacion);
    }

    @Override
    public void deleteEducacion(Long id) {
        educacionRepository.deleteById(id);
    }

    @Override
    public Educacion getEducacionById(Long id) {
         Educacion listaEducacion = educacionRepository.getEducacionById(id);
        return listaEducacion;
    }

    @Override
    public Educacion getEducacionByEducacion(String educacion) {
        Educacion listaEducacion = educacionRepository.getEducacionByEducacion(educacion);
        return listaEducacion;
    }

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion = educacionRepository.getEducaciones();
        return listaEducacion;
    }
    
}




