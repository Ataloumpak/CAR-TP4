package users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	String login;
	String pwd;
	boolean admin;

	public Utilisateur(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
	}

	
	
	public Utilisateur() {
		super();
	}

	@Id
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
}
