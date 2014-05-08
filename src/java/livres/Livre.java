package livres;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Livre {

    private String titre;
    private String auteur;
    private Calendar date;

    public Livre() {
    }

    public Livre(String titre, String auteur, Calendar date) {
        super();
        this.titre = titre;
        this.auteur = auteur;
        this.date = date;
    }

    @Id
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

    @Temporal(javax.persistence.TemporalType.DATE)
    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

}
