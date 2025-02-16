package com.gabriel.rede_social.model.dto;

import com.gabriel.rede_social.model.entities.Postagem;

import java.util.List;

public record UsuarioDTO(int id, String nome, String email, List<Postagem> postagens) {
}
