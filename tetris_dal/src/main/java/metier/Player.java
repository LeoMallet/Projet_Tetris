package metier;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GAM_ID")
	private int id;
	
	@Column(name="GAM_LOGIN")
	private String login;
	
	@Column(name="GAM_MDP")
	private String mdp;
	
//	@OneToMany(mappedBy="game")
//	private List<Game> games;
}
