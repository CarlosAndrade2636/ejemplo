package ec.edu.ups.est.examen.repository;

import ec.edu.ups.est.examen.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface ClienteRepository  extends JpaRepository<Cliente,Integer> {
    Optional<Cliente> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
