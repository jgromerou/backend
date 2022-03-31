package com.portfolio.backend.service;

import com.portfolio.backend.model.Habilidad;
import com.portfolio.backend.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author gerardo romero uro
 */
public class HabilidadService implements IHabilidadService{
    @Autowired
    private HabilidadRepository habilidadRepository;

    @Override
    public List<Habilidad> getHabilidades() {
        List<Habilidad> listaHabilidades = habilidadRepository.findAll();
        return listaHabilidades;
    }

    @Override
    public void saveHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }

    @Override
    public void deleteHabilidad(Long id) {
        habilidadRepository.deleteById(id);
    }
    
    @Override
    public Habilidad getHabilidadById(Long id) {
        Habilidad listaHabilidades = habilidadRepository.getHabilidadById(id);
        return listaHabilidades;
    }

    @Override
    public Habilidad getHabilidadByHabilidad(String habilidad) {
        Habilidad listaHabilidades = habilidadRepository.getHabilidadByHablidad(habilidad);
        return listaHabilidades;
    }

    @Override
    public List<Habilidad> getHabilidad() {
        List<Habilidad> listaHabilidad = habilidadRepository.getHabilidad();
        return listaHabilidad;
    } 
}
