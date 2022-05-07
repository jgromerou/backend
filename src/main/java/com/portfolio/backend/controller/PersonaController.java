package com.portfolio.backend.controller;

import com.portfolio.backend.model.Persona;
import com.portfolio.backend.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gerardo romero uro
 */

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/persona")
public class PersonaController {
     @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/traer")
    /*@PreAuthorize("hasRole('ADMIN')")*/
    public List<Persona> getPersonas(){
        return interPersona.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/crear")
    public String createPersona(@RequestBody Persona persona){
        interPersona.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @GetMapping ("/buscarid/{id}")
    public Persona getPersonaById (@PathVariable Long id){
        return interPersona.getPersonaById(id);
    }
    
    @GetMapping ("/buscarid")
    public List<Persona> getPersona (){
        return interPersona.getPersona();
    }
    
    @GetMapping ("/buscarnombre/{persona}")
    public List<Persona> getPersonaById (@PathVariable String persona){
    return interPersona.getPersonaByNombre(persona);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/editar/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestBody Persona pers){
        //busco la persona por id
        Persona persona = interPersona.getPersonaById(id);
        
        //setter
        persona.setNombres(pers.getNombres());
        persona.setApellidos(pers.getApellidos());
        persona.setEmail(pers.getEmail());
        persona.setFechanacimiento(pers.getFechanacimiento());
        persona.setTelefono(pers.getTelefono());
        persona.setDomicilio(pers.getDomicilio());
        persona.setNacionalidad(pers.getNacionalidad());
        persona.setEstadocivil(pers.getEstadocivil());
        persona.setAcercade(pers.getAcercade());
        persona.setFotoPerfil(pers.getFotoPerfil());
        interPersona.savePersona(persona);
        
        //retorna el nuevo persona
        return persona;
        
    }
}
