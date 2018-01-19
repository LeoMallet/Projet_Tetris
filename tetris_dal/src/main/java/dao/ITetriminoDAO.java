package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.Tetrimino;

public interface ITetriminoDAO extends JpaRepository <Tetrimino, Integer> {

}
