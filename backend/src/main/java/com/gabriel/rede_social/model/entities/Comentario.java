package com.gabriel.rede_social.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Comentario {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String autor;

  @ManyToOne
  @JoinColumn(name = "postagem_id")
  @JsonBackReference
  private Postagem postagem;
  private String conteudo;

  public Comentario() {}

  public Comentario(int id, Postagem postagem, String conteudo) {
    this.id = id;
    this.autor = postagem.getAutor().getNome();
    this.postagem = postagem;
    this.conteudo = conteudo;
  }

  public int getId() {
    return id;
  }

  public String getAutor() {
    return autor;
  }

  public Postagem getPostagem() {
    return postagem;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }
}

