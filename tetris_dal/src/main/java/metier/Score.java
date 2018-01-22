package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="score")
public class Score {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SCO_ID")
	private int id;
	
	@Column(name="SCO_SCORE")
	private int score;
	
	@OneToOne(mappedBy="score")
	private Game game;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
	
	
}
