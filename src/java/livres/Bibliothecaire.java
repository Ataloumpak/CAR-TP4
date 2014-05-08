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

    @Override
    public void ajouterLivres() {
        em.persist(new Livre("20 miles au lieu de la mer", "Charlie",
                new GregorianCalendar(2014, 5, 12)));
        em.persist(new Livre("Le retour du Jeudi", "Quentin",
                new GregorianCalendar(2014, 5, 12)));
        em.persist(new Livre("Comment que dota c'est mieux que tout!",
                "Michael", new GregorianCalendar(2014, 5, 12)));
        em.flush();
    }

    @Override
    public void ajouterLivre(String titre, String auteur, Calendar date) {
        Livre l = new Livre(titre, auteur, date);
        em.persist(l);
    }
    
    @Override
    public void supprimerLivre(String titre)
    {
        em.remove(em.find(Livre.class, titre));
    }
    
    @Override
    public Livre rechercherLivre(String titre)
    {
        return em.find(Livre.class, titre);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<String> getAuteurs() {
        Query query = em.createQuery("SELECT auteur FROM Livre");
        List<String> list = (List<String>) query.getResultList();
        return list;
    }

    @PreDestroy
    public void destruct() {
        em.close();
    }
}
