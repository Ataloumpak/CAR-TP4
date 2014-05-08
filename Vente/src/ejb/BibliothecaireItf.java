package ejb;

import java.util.Date;
import java.util.List;

public interface BibliothecaireItf {
	public List<String> getAuteur();
	public void ajouterLivre(String titre, String auteur, Date date);
}
