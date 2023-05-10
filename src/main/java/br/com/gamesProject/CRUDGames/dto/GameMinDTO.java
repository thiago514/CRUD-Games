package br.com.gamesProject.CRUDGames.dto;

import br.com.gamesProject.CRUDGames.entities.Game;

public record GameMinDTO(
		Long id,
		String title,
		Integer year,
		String imgUrl,
		String shortDescription){
	
	public GameMinDTO(Game entity) {
		this(entity.getId(), entity.getTitle(), entity.getYear(), entity.getImgUrl(), entity.getShortDescription());
	}
}
