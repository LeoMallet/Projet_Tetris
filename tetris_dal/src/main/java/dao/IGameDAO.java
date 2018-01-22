package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.Game;

public interface IGameDAO extends JpaRepository<Game, Integer> {

}
