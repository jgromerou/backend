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
    @Query(value= "SELECT * FROM experienciaslaborales where id_experiencia_laboral=?1", nativeQuery = true)
     ExperienciaLaboral getExperienciaLaboralById(Long id);

    @Query(value= "SELECT * FROM experienciaslaborales", nativeQuery = true)
    List<ExperienciaLaboral> getExperienciasLaborales();
    
    @Query(value= "SELECT * FROM experienciaslaborales where empresa like %?1%", nativeQuery = true)
    List<ExperienciaLaboral> getExperienciaLaboralByEmpresa(String empresa);
}
