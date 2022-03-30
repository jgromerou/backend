package com.portfolio.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.backend.model.ERole;
import com.portfolio.backend.model.Rol;

@Repository
public interface RoleRepository extends JpaRepository<Rol, Long> {
  Optional<Rol> findByRol(ERole rol);
}

