/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 *
 * @author gerardo
 */
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
    }


    @Override
    public void deletePersona(Long id) {
       persoRepository.deleteById(id);
    }

    @Override
    public Persona getPersoById(Long id) {
        Persona listaPerso = persoRepository.getPersoById(id);
        return listaPerso;
    }

    @Override
    public Persona getPersoByName(String nombre) {
        Persona listaPerso = persoRepository.getPersoByName(nombre);
        return listaPerso;
    }

    @Override
    public List<Persona> getPer() {
        List<Persona> listaPersona = persoRepository.getPerso();
        return listaPersona;
    }

   
}
