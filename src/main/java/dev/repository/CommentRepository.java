package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entitie.Commentaire;

public interface CommentRepository extends JpaRepository<Commentaire, Integer> {

}
