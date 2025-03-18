package br.com.fiap.api_rest.dto;

public record FilialResponse(Long id, String nome, Endereco endereco, org.springframework.hateoas.Link link) {
}