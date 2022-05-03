package com.portfolio.backend.repository;
/**
 *
 * @author gerardo romero uro
 */
import com.portfolio.backend.model.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    @Query(value= "SELECT * FROM proyectos where id_proyecto=?1", nativeQuery = true)
    Proyecto getProyectoById(Long id);

    @Query(value= "SELECT * FROM proyectos", nativeQuery = true)
    List<Proyecto> getProyecto();
    
    @Query(value= "SELECT * FROM proyectos where proyecto like %?1%", nativeQuery = true)
    List<Proyecto> getProyectoByNombre(String proyecto);
}

