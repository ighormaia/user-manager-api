package test.usermanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Cargo")
public class Cargo implements Serializable {

    private static final long serialVersionUID = 687991492884005033L;

    public Cargo() {}


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCargo;

    @NotBlank
    @Column(unique = true)
    private String nome;


    public Long getIdCargo() {
        return this.idCargo;
    }

    public void setIdCargo(Long idCargo) {
        this.idCargo = idCargo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo idCargo(Long idCargo) {
        setIdCargo(idCargo);
        return this;
    }

    public Cargo nome(String nome) {
        setNome(nome);
        return this;
    }

}
