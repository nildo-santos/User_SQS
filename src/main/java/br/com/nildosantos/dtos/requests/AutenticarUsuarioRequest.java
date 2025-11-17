package br.com.nildosantos.dtos.requests;

public record AutenticarUsuarioRequest(

        String email,
        String senha
) {
}
