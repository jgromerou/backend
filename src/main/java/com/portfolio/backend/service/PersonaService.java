package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
/**
 *
 * @author gerardo romero uro
 */
public class PersonaService implements IPersonaService{

     @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> listaPersonas = personaRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona getPersonaById(Long id) {
        Persona listaPersonas = personaRepository.getPersonaById(id);
        return listaPersonas;
    }

    @Override
    public List<Persona> getPersonaByNombre(String persona) {
         List<Persona> listaPersona = personaRepository.getPersonaByNombre(persona);
        return listaPersona;
    }
   
}
