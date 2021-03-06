package test.usermanager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;

@MappedSuperclass
public abstract class Pessoa {

    public Pessoa() {}

    @NotBlank
    @Column
    private String nome;
    
    @NotBlank
    @Column(unique = true)
    private String cpf;

    @Column
    private Date dataNascimento;

    @Column
    private String sexo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa nome(String nome) {
        setNome(nome);
        return this;
    }

    public Pessoa cpf(String cpf) {
        setCpf(cpf);
        return this;
    }

    public Pessoa dataNascimento(Date dataNascimento) {
        setDataNascimento(dataNascimento);
        return this;
    }

    public Pessoa sexo(String sexo) {
        setSexo(sexo);
        return this;
    }

}