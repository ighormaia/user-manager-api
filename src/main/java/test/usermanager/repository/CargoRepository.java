package test.usermanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.usermanager.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

    // o nome do método indica para o framework a ordenação por nome crescente
    List<Cargo> findAllByOrderByNomeAsc();

}
