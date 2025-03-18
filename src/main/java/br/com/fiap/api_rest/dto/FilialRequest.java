package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Endereco;
import jakarta.validation.constraints.*;

public class FilialRequest {
    @NotBlank(message = "O nome é obrigatório")
    @Size(min=3, max=150, message = "O nome deve ter entre 3 e 150 caracteres")
    private String nome;
    @NotNull(message = "Endereço é obrigatório")
    private Endereco endereco;

    public ClienteRequest() {
    }

    public ClienteRequest(String nome, Endereco endereco) {
        this.nome = nome;
	this.endereco = endereco
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }    
}
