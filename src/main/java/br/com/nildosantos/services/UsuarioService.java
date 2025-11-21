package br.com.nildosantos.services;

import br.com.nildosantos.components.CryptoComponent;
import br.com.nildosantos.dtos.requests.AutenticarUsuarioRequest;
import br.com.nildosantos.dtos.requests.CriarUsuarioRequest;
import br.com.nildosantos.dtos.responses.AutenticarUsuarioResponse;
import br.com.nildosantos.dtos.responses.CriarUsuarioResponse;
import br.com.nildosantos.entities.Usuario;
import br.com.nildosantos.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CryptoComponent cryptoComponent;
    /*
        Método para implementar a criação do usuário
     */
    public CriarUsuarioResponse criarUsuario(CriarUsuarioRequest request) {
        //Verificar se já existe um usuário com o email informado
        if(usuarioRepository.findByEmail(request.email()) != null) {
            //Retornar um erro informando que o email já está em uso
            throw new IllegalArgumentException("Email já está em uso");
        }
        //Preencher os dados do usuário
        var usuario = new Usuario();
        usuario.setNome(request.nome());
        usuario.setEmail(request.email());
        usuario.setSenha(cryptoComponent.sha256(request.senha()));
        usuario.setDataHoraCriacao(LocalDateTime.now());

        //Salvar no banco de dados
        usuarioRepository.save(usuario);

        return new CriarUsuarioResponse(
                usuario.getId(), //Id do usuário
                usuario.getNome(), //Nome do usuário
                usuario.getEmail(), //Email do usuário
                usuario.getDataHoraCriacao()//Data e hora de criação
        );
    }

    /*
        Método para implementar a autenticação do usuário
     */
    public AutenticarUsuarioResponse autenticarUsuario(AutenticarUsuarioRequest request) {
        //TODO
        return null;
    }
}
