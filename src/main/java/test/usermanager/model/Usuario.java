package test.usermanager.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Usuario")
public class Usuario extends Pessoa implements Serializable {

    private static final long serialVersionUID = 199991492884005033L;

    public Usuario() {}


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idUsuario;

    @NotNull
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idCargo", referencedColumnName = "idCargo")
    private Cargo cargo;

    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Perfil> perfis;

    @Column
    private Date dataCadastro;


    public Long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Perfil> getPerfis() {
        return this.perfis;
    }

    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }

    public Date getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Usuario idUsuario(Long idUsuario) {
        setIdUsuario(idUsuario);
        return this;
    }

    public Usuario cargo(Cargo cargo) {
        setCargo(cargo);
        return this;
    }

    public Usuario perfis(List<Perfil> perfis) {
        setPerfis(perfis);
        return this;
    }

    public Usuario dataCadastro(Date dataCadastro) {
        setDataCadastro(dataCadastro);
        return this;
    }

}
