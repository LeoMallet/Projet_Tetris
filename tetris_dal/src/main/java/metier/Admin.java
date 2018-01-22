package metier;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends User {

	@OneToOne(mappedBy="admin")
	private Faq faq;
}
