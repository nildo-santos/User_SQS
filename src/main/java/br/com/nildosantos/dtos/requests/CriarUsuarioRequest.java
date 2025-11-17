package br.com.nildosantos.dtos.requests;

public record CriarUsuarioRequest(
        String nome,
        String email,
        String senha

) {
}
