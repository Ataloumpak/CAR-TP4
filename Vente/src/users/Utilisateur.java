package users;

import javax.persistence.Id;

public class Utilisateur {
	String login;
	String pwd;

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
	
	
}
