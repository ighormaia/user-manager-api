package test.usermanager.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.usermanager.model.Perfil;
import test.usermanager.service.PerfilService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class PerfilController {

    private final PerfilService perfilService;

    public PerfilController(PerfilService perfilService) {
        this.perfilService = perfilService;
    }

    @GetMapping("/perfis")
    public List<Perfil> listarPerfis() {
        return perfilService.getAll();
    }

    @PostMapping("/perfis")
    public Perfil criarPerfil(@Valid @RequestBody Perfil perfil) {
        return perfilService.save(perfil);
    }

    @PutMapping("/perfis")
    public Perfil atualizarPerfil(@Valid @RequestBody Perfil perfil) {
        return perfilService.update(perfil);
    }

    @DeleteMapping("/perfis/{id}")
    public void apagarPerfil(@PathVariable("id") Long id) {
        perfilService.delete(id);
    }

}
