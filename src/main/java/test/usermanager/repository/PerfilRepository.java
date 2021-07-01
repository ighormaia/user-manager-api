package test.usermanager.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.usermanager.model.Perfil;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Long> {

    // o nome do método indica para o framework a ordenação por nome crescente
    List<Perfil> findAllByOrderByNomeAsc();

    Optional<Perfil> findByNome(String nome);

}
