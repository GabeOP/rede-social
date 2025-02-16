package com.gabriel.rede_social.controller;

import com.gabriel.rede_social.model.entities.Comentario;
import com.gabriel.rede_social.service.ComentarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comentario")
public class ComentarioController {

  private ComentarioService service;

  public ComentarioController(ComentarioService service) {
    this.service = service;
  }

  @PostMapping
  public String criarComentario(Comentario comentario) {
    return service.criarComentario(comentario);
  }
}
