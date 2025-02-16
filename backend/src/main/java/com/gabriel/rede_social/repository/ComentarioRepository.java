package com.gabriel.rede_social.repository;

import com.gabriel.rede_social.model.entities.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
}
