package com.portfolio.backend.controller;
/**
 *
 * @author gerardo romero uro
 */
import com.portfolio.backend.model.ExperienciaLaboral;
import com.portfolio.backend.service.ExperienciaLaboralService;
import com.portfolio.backend.service.IExperienciaLaboralService;
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
@RequestMapping("/api/experiencialab")
public class ExperienciaLaboralController {
    @GetMapping("/hola")
    /*@ResponseStatus(HttpStatus.OK)*/
    public String decirHola(){
        return "Bienvenido a ExperienciaLaboral";
    }
    @Autowired
    private IExperienciaLaboralService interExperienciaLaboral;
    
    @GetMapping ("/traer")
    /*@PreAuthorize("hasRole('ADMIN')")*/
    public List<ExperienciaLaboral> getHabibilidades(){
        return interExperienciaLaboral.getExperienciasLaborales();
    }
    
    @PostMapping ("/crear")
    public String createExperienciaLaboral(@RequestBody ExperienciaLaboral experienciaLaboral){
        interExperienciaLaboral.saveExperienciaLaboral(experienciaLaboral);
        return "La experienciaLaboral fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/{id}")
    public String deleteExperienciaLaboral (@PathVariable Long id){
        interExperienciaLaboral.deleteExperienciaLaboral(id);
        return "La experienciaLaboral fue eliminada correctamente";
    }
    
    @GetMapping ("/buscarid/{id}")
    public ExperienciaLaboral getExperienciasLaboralesById (@PathVariable Long id){
        return interExperienciaLaboral.getExperienciasLaboralesById(id);
    }
    
    @GetMapping ("/buscarid")
    public List<ExperienciaLaboral> getExperienciaLaboral (){
        return interExperienciaLaboral.getExperienciaLaboral();
    }
    
    @GetMapping ("/buscar/{experienciaLaboral}")
    public ExperienciaLaboral getExperienciaLaboralById (@PathVariable String experienciaLaboral){
    return interExperienciaLaboral.getExperienciasLaboralesByExperienciaLaboral(experienciaLaboral);
    }
    
    @PutMapping ("/editar/{id}")
    public ExperienciaLaboral editExperienciaLaboral (@PathVariable Long id,
                                //@RequestParam ("nombre") String nuevoNombre,
                                //@RequestParam ("apellido") String nuevoApellido,
                                //@RequestParam ("edad") int nuevaEdad
                                @RequestBody ExperienciaLaboral experiencialab){
        //busco la persona por id
        ExperienciaLaboral experienciaLaboral = interExperienciaLaboral.getExperienciasLaboralesById(id);
        
        //setter
        //experienciaLaboral.setExperienciaLaboral(experiencialabaLaboral());
        //experienciaLaboral..getPorcentaje_experienciaLaboral());
        
        interExperienciaLaboral.saveExperienciaLaboral(experienciaLaboral);
        
        //retorna la nueva experienciaLaboral
        return experienciaLaboral;
        
    }
}