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
@Table(name = "Perfil")
public class Perfil implements Serializable {

    private static final long serialVersionUID = 197991492884005033L;

    public Perfil() {}


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPerfil;

    @NotBlank
    @Column(unique = true)
    private String nome;


    public Long getIdPerfil() {
        return this.idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Perfil idPerfil(Long idPerfil) {
        setIdPerfil(idPerfil);
        return this;
    }

    public Perfil nome(String nome) {
        setNome(nome);
        return this;
    }

}
