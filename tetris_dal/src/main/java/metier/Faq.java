package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="faq")
public class Faq {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FAQ_ID")
	private int id;
	
	@Column(name="FAQ_QUESTION")
	private String question;
	
	@Column(name="FAQ_REPONSE")
	private String reponse;
	
	@OneToOne
	@JoinColumn(name="FAQ_ADM")
	private Admin admin;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
}
