package ejb;

import java.util.Date;

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
		
	}
	
	public void ajouterLivre(String titre, String auteur, Date date)
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
