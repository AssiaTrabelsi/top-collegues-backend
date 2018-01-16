package dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.entitie.Collegue;
import dev.entitie.Commentaire;
import dev.repository.CollegueRepository;
import dev.repository.CommentRepository;


@RestController
@RequestMapping("commentaires")
public class CommentController {
	
	
	@Autowired
	CommentRepository commentRepository;
	@Autowired
	CollegueRepository collegueRepository ;

	@RequestMapping(method = RequestMethod.GET)
	public List<Commentaire> getAllComment() {
	return commentRepository.findAll();
}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity addComment(@RequestBody Commentaire commentaire) {
		commentRepository.save(commentaire) ;
		return new ResponseEntity(commentaire, HttpStatus.CREATED);
	}
}
