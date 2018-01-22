package metier;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="score")
public class Score {

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
