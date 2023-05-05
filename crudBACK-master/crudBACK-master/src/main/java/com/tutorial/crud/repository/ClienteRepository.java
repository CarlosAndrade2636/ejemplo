package com.tutorial.crud.repository;


import com.tutorial.crud.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Integer> {
    Optional<Cliente> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
