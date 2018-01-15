package dev.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.entitie.Collegue;
import dev.entitie.Vote;
import dev.repository.VoteRepository;
@RestController
@RequestMapping("/api/votes")
public class VoteController {
	
	
	@Autowired
	VoteRepository voteRepository;
	
	
//	public List<Vote> getAllVote() {
//		return voteRepository.findAll();
//	}
	
//	@RequestMapping(method = RequestMethod.GET, params = { "since" })
	@GetMapping
	public List<Vote> getVotes(@RequestParam(value = "since", required = false) Optional<Integer> since) {

		if(since.isPresent())
		{
		return voteRepository.findAll().stream().filter(v->v.getId().equals(since.get())).collect(Collectors.toList()) ;
		}
		else
			{
			return voteRepository.findTop3ByOrderByIdDesc();
			
			}
		
	}
	
	@RequestMapping(method = RequestMethod.PATCH)
	public Collegue patch(@RequestBody Vote vote) {

//		Optional<Collegue> collegOpt = this.collegueRepository.findByPseudo(pseudo);
		Collegue collegue = vote.getCollegue();
		
			
			if (vote.getAction().equals("jaime")) {
				collegue.score += 10;
			} else if (vote.getAction().equals("deteste")) {
				collegue.score -= 5;
			}
			voteRepository.save(vote);
			return collegue;

	}
}
	
