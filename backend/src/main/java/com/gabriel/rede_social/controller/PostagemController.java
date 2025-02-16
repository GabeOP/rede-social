package com.gabriel.rede_social.controller;

import com.gabriel.rede_social.model.entities.Postagem;
import com.gabriel.rede_social.service.PostagemService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/postagem")
public class PostagemController {

  private PostagemService service;

  public PostagemController(PostagemService service) {
    this.service = service;
  }

  @PostMapping
  public String criarPostagem(@RequestBody Postagem postagem) {
    return service.criarPostagem(postagem);
  }
}
