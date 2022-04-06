package com.portfolio.backend.controller;
/**
 *
 * @author gerardo romero uro
 */
import com.portfolio.backend.model.Proyecto;
import com.portfolio.backend.service.IProyectoService;
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
@RequestMapping("/api/proyecto")
public class ProyectoController {
    @GetMapping("/hola")
    /*@ResponseStatus(HttpStatus.OK)*/
    public String decirHola(){
        return "Bienvenido a Proyecto";
    }
    @Autowired
    private IProyectoService interProyecto;
    
    @GetMapping ("/traer")
    /*@PreAuthorize("hasRole('ADMIN')")*/
    public List<Proyecto> getProyectos(){
        return interProyecto.getProyectos();
    }
    
    @PostMapping ("/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        interProyecto.saveProyecto(proyecto);
        return "El Proyecto fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteProyecto (@PathVariable Long id){
        interProyecto.deleteProyecto(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @GetMapping ("/buscarid/{id}")
    public Proyecto getProyectoById (@PathVariable Long id){
        return interProyecto.getProyectoById(id);
    }
    
    @GetMapping ("/buscarid")
    public List<Proyecto> getProyecto (){
        return interProyecto.getProyecto();
    }
    
    @GetMapping ("/buscar/{proyecto}")
    public Proyecto getProyectoById (@PathVariable String proyecto){
    return interProyecto.getProyectoByProyecto(proyecto);
    }
    
    @PutMapping ("/editar/{id}")
    public Proyecto editProyecto (@PathVariable Long id,
                                //@RequestParam ("nombre") String nuevoNombre,
                                //@RequestParam ("apellido") String nuevoApellido,
                                //@RequestParam ("edad") int nuevaEdad
                                @RequestBody Proyecto hab){
        //busco la persona por id
        Proyecto proyecto = interProyecto.getProyectoById(id);
        
        //setter
     //habilidad.setProyecto(hab.getProyecto());
       // habilidad.setPorcentaje_habilidad(hab.getPorcentaje_habilidad());
        
        interProyecto.saveProyecto(proyecto);
        
        //retorna el nuevo proyecto
        return proyecto;
        
    }
}

