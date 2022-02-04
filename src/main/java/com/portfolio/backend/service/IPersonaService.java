/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.service;

import com.portfolio.backend.model.Persona;
import java.util.List;

/**
 *
 * @author gerardo
 */
public interface IPersonaService {
    
    //método para traer todas las personas
    public List<Persona> getPersonas();

    //método para dar de alita una persona
    public void savePersona (Persona perso);
   
    //método para eliminar una persona por id
    public void deletePersona(Long id);

    //método para buscar una persona por id
    public Persona getPersoById(Long id);
    
    //método para buscar una persona por nombre
    public Persona getPersoByName(String nombre);
}
