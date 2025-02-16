package com.gabriel.rede_social.repository;

import com.gabriel.rede_social.model.entities.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Integer> {
}
