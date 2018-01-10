package dev.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entitie.Collegue;


public interface CollegueRepository extends JpaRepository<Collegue, Integer> {
	
	Optional <Collegue>findByPseudo(String pseudo) ;
}
