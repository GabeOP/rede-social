package com.gabriel.rede_social.service;

import com.gabriel.rede_social.model.entities.Postagem;
import com.gabriel.rede_social.repository.PostagemRepository;
import org.springframework.stereotype.Service;

@Service
public class PostagemService {

  private PostagemRepository repository;

  public PostagemService(PostagemRepository repository) {
    this.repository = repository;
  }

  public String criarPostagem(Postagem postagem) {
    repository.save(postagem);
    return "Postagem criada com sucesso!";
  }
}
