package metier;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="admin")
@PrimaryKeyJoinColumn(name="ADM_ID", referencedColumnName="USE_ID")
public class Admin extends User {
	
	@OneToOne(mappedBy="admin")
	@JoinColumn(name="ADM_FAQ")
	private Faq faq;


	public Faq getFaq() {
		return faq;
	}

	public void setFaq(Faq faq) {
		this.faq = faq;
	}
	
	
	
}
