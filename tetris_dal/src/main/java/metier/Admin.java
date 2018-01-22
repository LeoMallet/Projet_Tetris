package metier;

import javax.persistence.OneToOne;

public class Admin extends User {

	@OneToOne(mappedBy="faq")
	private Faq faq;
}
