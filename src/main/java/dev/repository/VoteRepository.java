package dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entitie.Vote;

public interface VoteRepository extends JpaRepository<Vote, Integer> {

	List<Vote> findTop3ByOrderByIdDesc(); 
}
