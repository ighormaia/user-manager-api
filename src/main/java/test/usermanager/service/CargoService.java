package test.usermanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import test.usermanager.model.Cargo;
import test.usermanager.repository.CargoRepository;

@Service
public class CargoService {

    private final CargoRepository cargoRepository;

    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<Cargo> getAll() {
        return cargoRepository.findAllByOrderByNomeAsc();
    }

    public Cargo save(Cargo cargo) throws Exception {
        Optional<Cargo> cargoJaExiste = cargoRepository.findByNome(cargo.getNome());

        if (cargoJaExiste.isPresent()) {
            throw new Exception("Este cargo já está cadastrado");
        }

        return cargoRepository.save(cargo);
    }

    public Cargo update(Cargo cargo) throws Exception {
        Optional<Cargo> cargoJaExiste = cargoRepository.findByNome(cargo.getNome());

        if (cargoJaExiste.isPresent() && cargoJaExiste.get().getIdCargo() != cargo.getIdCargo()) {
            throw new Exception("Este cargo já está cadastrado");
        }

        return cargoRepository.save(cargo);
    }

    public void delete(Long id) {
        cargoRepository.deleteById(id);
    }

}
