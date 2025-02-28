package br.com.fiap.api_rest.dto;

public record ClienteResponse(Long id, String nome, org.springframework.hateoas.Link link) {
}
