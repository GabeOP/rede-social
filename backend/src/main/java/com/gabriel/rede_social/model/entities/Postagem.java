package com.gabriel.rede_social.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Postagem {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String titulo;
  private String conteudo;

  @Column(name = "data_criacao", updatable = false)
  @JsonFormat(pattern = "dd/MM/yyyy'T'HH:mm")
  private LocalDateTime data_criacao;

  @ManyToOne
  @JoinColumn(name = "usuario_id")
  @JsonBackReference
  private Usuario autor;

  @OneToMany(mappedBy = "postagem", cascade = CascadeType.ALL)
  @JsonManagedReference
  private List<Comentario> comentarios;

  public Postagem() {}

  public Postagem(int id, String titulo, String conteudo, Usuario autor) {
    this.id = id;
    this.titulo = titulo;
    this.conteudo = conteudo;
    this.autor = autor;
  }

  @PrePersist
  public void prePersist() {
    if (this.data_criacao == null) {
      this.data_criacao = LocalDateTime.now();
    }
  }

  public int getId() {
    return id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public LocalDateTime getData_criacao() {
    return data_criacao;
  }

  public Usuario getAutor() {
    return autor;
  }
}
