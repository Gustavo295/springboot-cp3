package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private Date dataNascimento;
    private String email;
    private String senha;
    private String cpf;
    private Categoria categoria;
    private boolean vip;
    @ManyToOne
    @JoinColumn(name = "id_filial")
    private Filial filial;
    @ManyToMany
    @JoinTable(name = "grupo_cliente",
    joinColumns = @JoinColumn(name = "id_grupo", referencedColumnName="id"),
    inverseJoinColumns = @JoinColumn(name = "id_cliente", referencedColumnName="id"))
    private List<Grupo> grupos;

    public Cliente(Object o, String nome, int idade, String email, String senha, String cpf, Categoria categoria) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Filial getFilial(){
    	return filial;
    }
	
    public void setFilial(Filial filial) {
    	this.filial = filial;
    }

    public List<Grupo> getGrupos(){
    	return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
    	this.grupos = grupos;
    }


    public Cliente(Long id, String nome, int idade, Date dataNascimento, String email, String senha, String cpf, Categoria categoria, boolean vip, Filial filial) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.categoria = categoria;
        this.vip = vip;
	this.filial = filial;
    }
}
