package com.portfolio.backend.repository;
/**
 *
 * @author gerardo
 */
import com.portfolio.backend.model.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface HabilidadRepository extends JpaRepository<Habilidad, Long> {
    @Query(value= "SELECT * FROM habilidades where id_habilidad=?1", nativeQuery = true)
    Habilidad getHabilidadById(Long id);

    @Query(value= "SELECT * FROM habilidades", nativeQuery = true)
    List<Habilidad> getHabilidad();
    
    @Query(value= "SELECT * FROM habilidades where habilidad like %?1%", nativeQuery = true)
    List<Habilidad> getHabilidadByNombre(String habilidad);

  
}

