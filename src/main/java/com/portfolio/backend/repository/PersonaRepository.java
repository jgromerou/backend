/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.backend.repository;

import com.portfolio.backend.model.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
/**
 *
 * @author gerardo
 */
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    @Query(value= "SELECT * FROM persona where id_persona=?1", nativeQuery = true)
    Persona getPersoById(Long id);

    @Query(value= "SELECT * FROM persona", nativeQuery = true)
    List<Persona> getPerso();
    
    @Query(value= "SELECT * FROM persona where nombre like %?1%", nativeQuery = true)
    Persona getPersoByName(String nombre);
}
