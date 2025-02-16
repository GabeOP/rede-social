package com.gabriel.rede_social.service;

import com.gabriel.rede_social.model.entities.Comentario;
import com.gabriel.rede_social.repository.ComentarioRepository;
import org.springframework.stereotype.Service;

@Service
public class ComentarioService {

  private ComentarioRepository repository;

  public ComentarioService(ComentarioRepository repository) {
    this.repository = repository;
  }

  public String criarComentario(Comentario comentario) {
    repository.save(comentario);
    return "Comentário criado com sucesso!";
  }
}
