package com.portfolio.backend.repository;
/**
 *
 * @author gerardo
 */
import com.portfolio.backend.model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    @Query(value= "SELECT * FROM exp... where id_experiencia...=?1", nativeQuery = true)
     Educacion getEducacionById(Long id);

    @Query(value= "SELECT * FROM experie....", nativeQuery = true)
    List<Educacion> getEducaciones();
    
    @Query(value= "SELECT * FROM exp... where exp.. like %?1%", nativeQuery = true)
    Educacion getEducacionByEducacion(String educacion);
}

