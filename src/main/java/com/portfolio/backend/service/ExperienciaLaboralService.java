package com.portfolio.backend.service;

import com.portfolio.backend.model.ExperienciaLaboral;
import com.portfolio.backend.repository.ExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author gerardo romero uro
 */
public class ExperienciaLaboralService implements IExperienciaLaboralService{
    @Autowired
    private ExperienciaLaboralRepository experienciaLaboralRepository;

    @Override
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
    }
}


