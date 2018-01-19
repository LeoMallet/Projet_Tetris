package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.Player;

public interface IAuthentificationDAO extends JpaRepository <Player, Integer> {

}
