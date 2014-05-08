package livres;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Local;

@Local
public interface BibliothecaireLocal {

    public List<String> getAuteurs();

    public void ajouterLivre(String titre, String auteur, Calendar date);
    
    public void supprimerLivre(String titre);
    
    public Livre rechercherLivre(String titre);

    public void ajouterLivres();

}
