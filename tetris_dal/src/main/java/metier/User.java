package metier;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="user")
public class User  implements Serializable {

		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="USE_ID")
		private int id;
		
		@Column(name="USE_LOGIN")
		private String login;
		
		@Column(name="USE_PASSWORD")
		private String password;
		
		public User (int id, String login, String password) {
			
			this.id = id;
			this.login = login;
			this.password = password;
		}
		
		public User() {
			
		}

		@Override
		public String toString() {
			return "Personne [id=" + id + ", login=" + login + ", Password=" + password + "]";
		}

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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	

	}


