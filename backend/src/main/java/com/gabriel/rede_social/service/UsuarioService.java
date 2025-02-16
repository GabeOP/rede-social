package com.gabriel.rede_social.service;

import com.gabriel.rede_social.model.dto.UsuarioDTO;
import com.gabriel.rede_social.model.entities.Usuario;
import com.gabriel.rede_social.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
  private UsuarioRepository repository;

  public UsuarioService(UsuarioRepository repository) {
    this.repository = repository;
  }

  public Optional<UsuarioDTO> buscarUsuario(String nome) {
    return Optional.ofNullable(repository.findByNome(nome))
            .map(usuario -> new UsuarioDTO(
                    usuario.getId(),
                    usuario.getNome(),
                    usuario.getEmail(),
                    usuario.getPostagens()
            ));
  }

  public String criarUsuario(Usuario usuario) {
    repository.save(usuario);
    return "Usuário cadastrado com sucesso.";
  }
}
