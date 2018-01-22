package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.Score;

public interface IScoreDAO extends JpaRepository<Score, Integer> {

}
