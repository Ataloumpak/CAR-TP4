package users;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class Authenticateur
 */
@Stateless
@LocalBean
public class Authentificateur implements AuthentificateurItf {

	@PersistenceContext
	private EntityManager em;

	
	
	@Override
	public boolean connexion(String login, String pwd) {
		return false;
 	}



	@Override
	public void ajouterUtilisateur(String login, String pwd) {
		Utilisateur u = new Utilisateur(login, pwd);
		em.persist(u);
	}


}
