package test.usermanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import test.usermanager.model.Perfil;
import test.usermanager.repository.PerfilRepository;

@Service
public class PerfilService {

    private final PerfilRepository perfilRepository;

    public PerfilService(PerfilRepository perfilRepository) {
        this.perfilRepository = perfilRepository;
    }

    public List<Perfil> getAll() {
        return perfilRepository.findAllByOrderByNomeAsc();
    }

    public Perfil save(Perfil perfil) throws Exception {
        Optional<Perfil> perfilJaExiste = perfilRepository.findByNome(perfil.getNome());

        if (perfilJaExiste.isPresent()) {
            throw new Exception("Este perfil já está cadastrado");
        }

        return perfilRepository.save(perfil);
    }

    public Perfil update(Perfil perfil) throws Exception {
        Optional<Perfil> perfilJaExiste = perfilRepository.findByNome(perfil.getNome());

        if (perfilJaExiste.isPresent()) {
            throw new Exception("Este perfil já está cadastrado");
        }

        return perfilRepository.save(perfil);
    }

    public void delete(Long id) {
        perfilRepository.deleteById(id);
    }

}
