package livres;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Livre {
	@Id
	private String titre;
	private String auteur;
	@Temporal(TemporalType.DATE)
	private Calendar date;

	public Livre() {
	}

	public Livre(String titre, String auteur, Calendar date) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.date = date;
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

}
