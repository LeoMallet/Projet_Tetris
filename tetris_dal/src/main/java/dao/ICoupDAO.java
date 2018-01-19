package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import metier.Coup;



public interface ICoupDAO extends JpaRepository <Coup, Integer> {

}
