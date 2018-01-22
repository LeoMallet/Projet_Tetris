package metier;

public class Admin extends User {

	@OneToOne
	private Faq faq
}
