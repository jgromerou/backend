/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.controller;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.service.IPersonaService;
import java.util.HashSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gerardo
 */
@RestController
@RequestMapping("/api")
public class PersonaController {
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping("/hola")
    @ResponseStatus(HttpStatus.OK)
    public String decirHola(){
        return "Bienvenido Hola Mundo";
    }
    
    @GetMapping ("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    
    @PostMapping ("/personas/crear")
    public String createPersona(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @GetMapping ("personas/buscarid/{id}")
    public Persona getPersoById (@PathVariable Long id){
    return interPersona.getPersoById(id);
    }
    
    @GetMapping ("personas/buscar/{nombre}")
    public Persona getPersoById (@PathVariable String nombre){
    return interPersona.getPersoByName(nombre);
    }
    
    @PutMapping ("personas/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                //@RequestParam ("nombre") String nuevoNombre,
                                //@RequestParam ("apellido") String nuevoApellido,
                                //@RequestParam ("edad") int nuevaEdad
                                @RequestBody Persona per){
        //busco la persona por id
        Persona perso = interPersona.getPersoById(id);
        
        //setter
        perso.setApellido(per.getApellido());
        perso.setNombre(per.getNombre());
        perso.setEdad(per.getEdad());
        
        interPersona.savePersona(perso);
        
        //retorna la nueva persona
        return perso;
        
    }
}
