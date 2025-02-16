package com.gabriel.rede_social.model.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  @Column(unique = true)
  private String nome;
  @Column(unique = true)
  private String email;
  private String senha;
  @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
  @JsonManagedReference
  private List<Postagem> postagens;

  public Usuario() {}

  public Usuario(int id, String nome, String email, String senha) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.postagens = new ArrayList<>();
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public List<Postagem> getPostagens() {
    return postagens;
  }
}
