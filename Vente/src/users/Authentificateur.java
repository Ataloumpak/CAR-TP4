package users;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class Authenticateur
 */
@Stateless
@LocalBean
public class Authentificateur implements AuthentificateurLocal {

	@PersistenceContext
	private EntityManager em;

	
	
	@Override
	public boolean connexion(String login, String pwd) {
		Query q = em.createQuery("SELECT admin from Utilisateur u where u.login=:login AND u.pwd=:pwd");
		q.setParameter("login", login);
		q.setParameter("pwd", pwd);
		
		try
		{
			return (boolean) q.getSingleResult();
		}
		catch(Exception e){
			throw new RuntimeException("Le login n'a pas retourné un seul résultat");
		}
		
		
 	}



	@Override
	public void ajouterUtilisateur(String login, String pwd) {
		Utilisateur u = new Utilisateur(login, pwd);
		em.persist(u);
	}


}
