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

