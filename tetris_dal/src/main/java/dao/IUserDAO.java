package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import metier.User;

public interface IUserDAO extends JpaRepository <User, Integer> {

}
