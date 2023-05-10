package br.com.gamesProject.CRUDGames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gamesProject.CRUDGames.dto.GameMinDTO;
import br.com.gamesProject.CRUDGames.entities.Game;
import br.com.gamesProject.CRUDGames.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		var result = service.findAll();		
		return result;
	}

}
