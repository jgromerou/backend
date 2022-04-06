package com.portfolio.backend.repository;
/**
 *
 * @author gerardo
 */
import com.portfolio.backend.model.ExperienciaLaboral;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface ExperienciaLaboralRepository extends JpaRepository<ExperienciaLaboral, Long> {
    @Query(value= "SELECT * FROM exp... where id_experiencia...=?1", nativeQuery = true)
     ExperienciaLaboral getExperienciasLaboralesById(Long id);

    @Query(value= "SELECT * FROM experie....", nativeQuery = true)
    List<ExperienciaLaboral> getExperienciasLaborales();
    
    @Query(value= "SELECT * FROM exp... where exp.. like %?1%", nativeQuery = true)
    ExperienciaLaboral getExperienciasLaboralesByExperienciaLaboral(String experiencialaboral);
}
