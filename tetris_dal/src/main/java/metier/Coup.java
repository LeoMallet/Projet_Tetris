package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY	)
@Table(name="coup")
public class Coup {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="COU_ID")
	private int id;
	
	

//	@ManyToOne
//	@JoinColumn(name="TET_ID")
//	private Tetrimino tetrimino;
//	
//	@ManyToOne
//	@JoinColumn(name="GAM_ID")
//	private Game game;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


//	public Tetrimino getTetrimino() {
//		return tetrimino;
//	}
//
//	public void setTetrimino(Tetrimino tetrimino) {
//		this.tetrimino = tetrimino;
//	}
//
//	public Game getGame() {
//		return game;
//	}
//
//	public void setGame(Game game) {
//		this.game = game;
//	}

	
	
}
