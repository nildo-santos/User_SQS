package br.com.nildosantos.controllers;

import br.com.nildosantos.dtos.requests.AutenticarUsuarioRequest;
import br.com.nildosantos.dtos.requests.CriarUsuarioRequest;
import br.com.nildosantos.dtos.responses.AutenticarUsuarioResponse;
import br.com.nildosantos.dtos.responses.CriarUsuarioResponse;
import br.com.nildosantos.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuariosController {

    @Autowired
    private UsuarioService usuarioService;

    /*
        Serviço para criar usuário
     */
    @PostMapping("criar")
    public ResponseEntity<?> criar(@RequestBody CriarUsuarioRequest request) {
        try {
            //Executar o cadastro do usuário e obter a resposta
            var response = usuarioService.criarUsuario(request);

            //SUCCESS: HTTP 201 (CREATED)
            return ResponseEntity.status(201).body(response);
        }
        catch(IllegalArgumentException e) {

            //ERRO: HTTP 409 (Conflict)
            return ResponseEntity.status(409).body(e.getMessage());
        }
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