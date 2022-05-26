package com.portfolio.backend.controller;
/**
 *
 * @author gerardo romero uro
 */
import com.portfolio.backend.model.Educacion;
import com.portfolio.backend.service.IEducacionService;
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
@RequestMapping("/api/educacion")
public class EducacionController {
    @Autowired
    private IEducacionService interEducacion;
    @GetMapping ("/traer")
    /*@PreAuthorize("hasRole('ADMIN')")*/
    public List<Educacion> getEducacions(){
        return interEducacion.getEducaciones();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/crear")
    public String createEducacion(@RequestBody Educacion educacion){
        interEducacion.saveEducacion(educacion);
        return "La educación fue creado correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/borrar/{id}")
    public String deleteEducacion (@PathVariable Long id){
        interEducacion.deleteEducacion(id);
        return "La Educación fue eliminada correctamente";
    }
    
    @GetMapping ("/buscarid/{id}")
    public Educacion getEducacionById (@PathVariable Long id){
        return interEducacion.getEducacionById(id);
    }
    
    @GetMapping ("/buscarid")
    public List<Educacion> getEducacion (){
        return interEducacion.getEducacion();
    }
    
    @GetMapping ("/buscarinstitucion/{instituto}")
    public List<Educacion> getEducacionById (@PathVariable String instituto){
    return interEducacion.getEducacionByInstituto(instituto);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/editar/{id}")
    public Educacion editEducacion (@PathVariable Long id,
                                @RequestBody Educacion edu){
        //busca la educación por id
        Educacion educacion = interEducacion.getEducacionById(id);
        
        //setter
        educacion.setInstitucion(edu.getInstitucion());
        educacion.setTitulo(edu.getTitulo());
        educacion.setFechaInicio(edu.getFechaInicio());
        educacion.setFechaFin(edu.getFechaFin());
        educacion.setPorcentaje_carrera(edu.getPorcentaje_carrera());
        educacion.setLinkimagen(edu.getLinkimagen());
        educacion.setPersona(edu.getPersona());       
        interEducacion.saveEducacion(educacion);
        
        //retorna la educación con sus nuevas modificaciones.
        return educacion;
        
    }
}
