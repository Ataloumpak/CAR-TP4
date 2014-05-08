package users;

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
        Query query = em.createQuery("SELECT admin from Utilisateur u where u.login=:login AND u.pwd=:pwd");
        query.setParameter("login", login);
        query.setParameter("pwd", pwd);

        try {
            return (boolean) query.getSingleResult();
        } catch (Exception e) {
            throw new RuntimeException("Le login n'a pas retourné un seul résultat");
        }

    }

    @Override
    public void ajouterUtilisateur(String login, String pwd) {
        Utilisateur u = new Utilisateur(login, pwd);
        em.persist(u);
    }

}
