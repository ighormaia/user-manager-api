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

import test.usermanager.model.Cargo;
import test.usermanager.service.CargoService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1")
public class CargoController {

    private final CargoService cargoService;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping(value = "/cargos")
    public List<Cargo> listarCargos() {
        return cargoService.getAll();
    }

    @PostMapping("/cargos")
    public Cargo criarCargo(@Valid @RequestBody Cargo cargo) throws Exception {
        return cargoService.save(cargo);
    }

    @PutMapping("/cargos")
    public Cargo atualizarCargo(@Valid @RequestBody Cargo cargo) throws Exception {
        return cargoService.update(cargo);
    }

    @DeleteMapping("/cargos/{id}")
    public void apagarCargo(@PathVariable("id") Long id) {
        cargoService.delete(id);
    }

}
