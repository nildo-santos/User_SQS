package br.com.nildosantos.dtos.responses;

import java.time.LocalDateTime;
import java.util.UUID;

public record AutenticarUsuarioResponse(

        UUID id,
        String nome,
        String email,
        LocalDateTime dataHoraAcesso,
        LocalDateTime dataHoraExpiracao,
        String accessToken
) {
}
