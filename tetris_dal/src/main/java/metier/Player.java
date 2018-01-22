package metier;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="player")
@PrimaryKeyJoinColumn(name="PLA_ID", referencedColumnName="USE_ID")
public class Player extends User {

	
	@OneToMany(mappedBy="player")
	private List<Game> games;

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

}
