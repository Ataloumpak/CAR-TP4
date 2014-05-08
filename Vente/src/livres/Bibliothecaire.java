package livres;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import java.util.List;

@Stateless
public class Bibliothecaire implements BibliothecaireItf {
	@PersistenceContext
	private EntityManager em;

	public void init() {
		ajouterLivres();
	}
	
	public void ajouterLivres()
	{
		em.persist(new Livre("20 miles au lieu de la mer", "Charlie", new GregorianCalendar(2014,5,12)));
		em.persist(new Livre("Jurrassic ta race", "Quentin", new GregorianCalendar(2014,5,12)));
		em.persist(new Livre("Comment que dota c'est mieux que tout!", "Michael", new GregorianCalendar(2014,5,12)));
		
	}
	
	public void ajouterLivre(String titre, String auteur, Calendar date)
	{
		Livre l = new Livre(titre, auteur, date);
		em.persist(l);
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getAuteur(){
		Query q = em.createQuery("SELECT auteur from Livre l");
		List<String> list = (List<String>) q.getResultList();
		return list;
	}
}
