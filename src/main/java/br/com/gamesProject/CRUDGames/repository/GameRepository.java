package br.com.gamesProject.CRUDGames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gamesProject.CRUDGames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
