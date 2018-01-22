package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private Admin admin;
	
}
