package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import metier.Admin;
import metier.Player;
import metier.User;

public interface IUserDAO extends JpaRepository <User, Integer> {

	@Query("select a from Admin a where a.login=:login and a.password =:password")
    public Admin authA(@Param("login") String login,  @Param("password") String password);
	
	@Query("select p from Player p where p.login=:login and p.password =:password")
    public Player authP(@Param("login") String login,  @Param("password") String password);
	
	
	
}
