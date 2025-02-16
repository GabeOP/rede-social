package com.gabriel.rede_social.controller;

import com.gabriel.rede_social.model.dto.UsuarioDTO;
import com.gabriel.rede_social.model.entities.Usuario;
import com.gabriel.rede_social.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

  private UsuarioService service;

  public UsuarioController(UsuarioService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<Optional<UsuarioDTO>> buscarUsuario(@RequestParam String nome) {
    Optional<UsuarioDTO> usuario = service.buscarUsuario(nome);
    return ResponseEntity.ok().body(usuario);
  }

  @PostMapping
  public ResponseEntity<String> criarUsuario(@RequestBody Usuario usuario) {
    String res = service.criarUsuario(usuario);
    return ResponseEntity.status(201).body(res);
  }
}
