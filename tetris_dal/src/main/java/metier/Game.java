package metier;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="game")
public class Game {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GAM_ID")
	private int id;
	
	@Column(name="GAM_DATE")
	private Date dateGame;

	//Potentiel problème ?
	@OneToMany(mappedBy="coup")
	private List<Coup> coups;	
	
	@ManyToOne
	@JoinColumn(name="GAM_PLAYER_ID")
	private Game game;
}
