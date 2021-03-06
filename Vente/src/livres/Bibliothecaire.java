package livres;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class Bibliothecaire implements BibliothecaireLocal,
		BibliothecaireRemote {
	@PersistenceContext
	private EntityManager em;

	public void init() {
		ajouterLivres();
	}

	public void ajouterLivres() {
		try{
			em.persist(new Livre("20 miles au lieu de la mer", "Charlie",
					new GregorianCalendar(2014, 5, 12)));
			em.persist(new Livre("Jurrassic ta race", "Quentin",
					new GregorianCalendar(2014, 5, 12)));
			em.persist(new Livre("Comment que dota c'est mieux que tout!",
					"Michael", new GregorianCalendar(2014, 5, 12)));
		} catch (Exception e) {
			
		}

	}

	public void ajouterLivre(String titre, String auteur, Calendar date) {
		Livre l = new Livre(titre, auteur, date);
		em.persist(l);
	}

	@SuppressWarnings("unchecked")
	public List<String> getAuteur() {
		Query q = em.createQuery("SELECT auteur from Livre l");
		List<String> list = (List<String>) q.getResultList();
		return list;
	}

	@PreDestroy
	public void destruct() {
		em.close();
	}
}
