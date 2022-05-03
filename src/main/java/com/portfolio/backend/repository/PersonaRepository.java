package com.portfolio.backend.repository;
/**
 *
 * @author gerardo romero uro
 */
import com.portfolio.backend.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author gerardo romero uro
 */
public interface PersonaRepository extends JpaRepository<Persona, Long>{
     @Query(value= "SELECT * FROM personas where id_persona=?1", nativeQuery = true)
    Persona getPersonaById(Long id);

    @Query(value= "SELECT * FROM  personas", nativeQuery = true)
    List<Persona> getPersona();
    
    @Query(value= "SELECT * FROM persona where nombres like %?1%", nativeQuery = true)
    List<Persona> getPersonaByNombre(String persona);
}
