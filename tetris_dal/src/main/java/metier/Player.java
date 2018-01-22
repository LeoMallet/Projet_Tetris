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
	@Column(name="PLA_ID")
	private int id;
	
	@Column(name="PLA_LOGIN")
	private String login;
	
	@Column(name="PLA_PASSWORD")
	private String password;
	
	@OneToMany(mappedBy="player")
	private List<Game> games;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return password;
	}

	public void setMdp(String password) {
		this.password = password;
	}

}
