package com.gabriel.rede_social.repository;

import com.gabriel.rede_social.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

  public Usuario findByNome(String nome);
}
