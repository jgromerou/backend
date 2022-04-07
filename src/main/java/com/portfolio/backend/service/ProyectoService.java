package com.portfolio.backend.service;

import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author gerardo romero uro
 */
public class ProyectoService implements IProyectoService{
    @Autowired
    private ProyectoRepository proyectoRepository;

   /* @Override
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
    } */

    @Override
    public List<Proyecto> getProyectos() {
        List<Proyecto> listaProyectos = proyectoRepository.findAll();
        return listaProyectos;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
       proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto getProyectoById(Long id) {
         Proyecto listaProyectos = proyectoRepository.getProyectoById(id);
        return listaProyectos;
    }

    @Override
    public List<Proyecto> getProyectoByNombre(String proyecto) {
        List<Proyecto> listaProyectos = proyectoRepository.getProyectoByNombre(proyecto);
        return listaProyectos;
    }

    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> listaProyecto = proyectoRepository.getProyecto();
        return listaProyecto;
    }
}

