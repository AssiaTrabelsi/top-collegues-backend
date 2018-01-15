package dev.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dev.entitie.Collegue;
import dev.repository.CollegueRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/collegues")
public class CollegueController {

	@Autowired
	CollegueRepository collegueRepository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Collegue> listAll() {
		return collegueRepository.findAll();
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity addCollegues(@RequestBody Collegue collegue) {
		collegueRepository.save(collegue);
		return new ResponseEntity(collegue, HttpStatus.CREATED);
	}

//	@RequestMapping(path = "/{pseudo}", method = RequestMethod.PATCH)
//	public Collegue patch(@PathVariable String pseudo, @RequestBody Map<String, String> act) {
//
//		Optional<Collegue> collegOpt = this.collegueRepository.findByPseudo(pseudo);
//
//		if (collegOpt.isPresent()) {
//
//			Collegue collegue = collegOpt.get();
//			if (act.get("action").equals("jaime")) {
//				collegue.score += 10;
//			} else if (act.get("action").equals("deteste")) {
//				collegue.score -= 5;
//			}
//			collegueRepository.save(collegue);
//			return collegue;
//		}
//		return null;
//	}

}