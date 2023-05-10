package br.com.gamesProject.CRUDGames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gamesProject.CRUDGames.dto.GameMinDTO;
import br.com.gamesProject.CRUDGames.entities.Game;
import br.com.gamesProject.CRUDGames.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	
	public List<GameMinDTO> findAll(){
		
		return repository.findAll().stream().map(GameMinDTO::new).toList();
		
	}
}
