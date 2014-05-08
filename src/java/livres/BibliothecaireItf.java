package livres;

import java.util.Calendar;
import java.util.List;

public interface BibliothecaireItf {
public List<String> getAuteurs();
public void ajouterLivre(String titre, String auteur, Calendar date);
}