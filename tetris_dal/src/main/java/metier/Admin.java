package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ADM_ID")
	private int id;
	
	@Column(name="ADM_LOGIN")
	private String login;
	
	@Column(name="ADM_PASSWORD")
	private String password;
	
	@OneToOne(mappedBy="admin")
	private Faq faq;

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

	public Faq getFaq() {
		return faq;
	}

	public void setFaq(Faq faq) {
		this.faq = faq;
	}
	
	
	
}
