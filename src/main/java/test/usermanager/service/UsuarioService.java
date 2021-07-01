package test.usermanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import test.usermanager.model.Usuario;
import test.usermanager.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario) throws Exception {
        Optional<Usuario> usuarioJaExiste = usuarioRepository.findByCpf(usuario.getCpf());

        if (usuarioJaExiste.isPresent()) {
            throw new Exception("Este cpf já está cadastrado");
        }

        return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario) throws Exception {
        Optional<Usuario> usuarioJaExiste = usuarioRepository.findByCpf(usuario.getCpf());

        if (usuarioJaExiste.isPresent()) {
            throw new Exception("Este cpf já está cadastrado");
        }

        return usuarioRepository.save(usuario);
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}
