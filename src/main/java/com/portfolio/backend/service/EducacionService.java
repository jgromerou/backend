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
    public List<Educacion> getEducacionByInstituto(String instituto) {
        List<Educacion> listaInstitutos = educacionRepository.getEducacionByInstitucion(instituto);
        return listaInstitutos;
    }

    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion = educacionRepository.getEducaciones();
        return listaEducacion;
    }
    
}




