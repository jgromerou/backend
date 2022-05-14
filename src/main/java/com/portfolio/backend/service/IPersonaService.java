package com.portfolio.backend.service;


import com.portfolio.backend.model.Persona;
import java.util.List;

/**
 *
 * @author gerardoromero uro
 */
public interface IPersonaService {
    public List<Persona> getPersona();

    public void savePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona getPersonaById(Long id);

    public List<Persona> getPersonaByNombre(String persona);
    
    public void editFotoperfilByPersona(Long id, String foto);
}
