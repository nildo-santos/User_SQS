package br.com.nildosantos.controllers;

import br.com.nildosantos.dtos.requests.AutenticarUsuarioRequest;
import br.com.nildosantos.dtos.requests.CriarUsuarioRequest;
import br.com.nildosantos.dtos.responses.AutenticarUsuarioResponse;
import br.com.nildosantos.dtos.responses.CriarUsuarioResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuariosController {

    /*
        Serviço para criar usuário
     */
    @PostMapping("criar")
    public CriarUsuarioResponse criar(@RequestBody CriarUsuarioRequest request) {
        //TODO Implementar
        return null;
    }

    /*
        Serviço para autenticar usuário
     */
    @PostMapping("autenticar")
    public AutenticarUsuarioResponse autenticar(@RequestBody AutenticarUsuarioRequest request) {
        //TODO Implementar
        return null;
    }
}
