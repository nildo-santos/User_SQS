package br.com.nildosantos.dtos.responses;

import java.time.LocalDateTime;
import java.util.UUID;

public record CriarUsuarioResponse(

        UUID id,
        String nome,
        String email,
        LocalDateTime dataHoraCriacao
) {
}
