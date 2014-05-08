package users;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Authenticateur
 */
@Stateless
@LocalBean
public class Authentificateur implements AuthentificateurItf {

    /**
     * Default constructor. 
     */
    public Authentificateur() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean connexion(String login, String pwd) {
		// TODO Auto-generated method stub
		return false;
	}


}
