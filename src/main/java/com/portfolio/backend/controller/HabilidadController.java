package com.portfolio.backend.controller;
/**
 *
 * @author gerardo romero uro
 */
import com.portfolio.backend.model.Habilidad;
import com.portfolio.backend.service.IHabilidadService;
import java.util.HashSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/habilidad")
public class HabilidadController {
    @Autowired
    private IHabilidadService interHabilidad;
    
    @GetMapping ("/traer")
    /*@PreAuthorize("hasRole('ADMIN')")*/
    public List<Habilidad> getHabibilidades(){
        return interHabilidad.getHabilidades();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/crear")
    public String createHabilidad(@RequestBody Habilidad habilidad){
        interHabilidad.saveHabilidad(habilidad);
        return "La Habilidad fue creada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/borrar/{id}")
    public String deleteHabilidad (@PathVariable Long id){
        interHabilidad.deleteHabilidad(id);
        return "La Habilidad fue eliminada correctamente";
    }
    
    @GetMapping ("/buscarid/{id}")
    public Habilidad getHabilidadById (@PathVariable Long id){
        return interHabilidad.getHabilidadById(id);
    }
    
    @GetMapping ("/buscarid")
    public List<Habilidad> getHabilidad (){
        return interHabilidad.getHabilidad();
    }
    
    @GetMapping ("/buscarnombre/{habilidad}")
    public List<Habilidad> getHabilidadByNombre (@PathVariable String habilidad){
    return interHabilidad.getHabilidadByNombre(habilidad);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/editar/{id}")
    public Habilidad editHabilidad (@PathVariable Long id,
                                //@RequestParam ("nombre") String nuevoNombre,
                                //@RequestParam ("apellido") String nuevoApellido,
                                //@RequestParam ("edad") int nuevaEdad
                                @RequestBody Habilidad hab){
        //busco la persona por id
        Habilidad habilidad = interHabilidad.getHabilidadById(id);
        
        //setter
        habilidad.setHabilidad(hab.getHabilidad());
        habilidad.setPorcentaje_habilidad(hab.getPorcentaje_habilidad());
        habilidad.setPersona(hab.getPersona());
        
        interHabilidad.saveHabilidad(habilidad);
        
        //retorna la nueva habilidad
        return habilidad;
        
    }
}
