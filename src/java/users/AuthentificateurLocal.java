package users;

import javax.ejb.Local;

@Local
public interface AuthentificateurLocal {

    public boolean connexion(String login, String pwd);

    public void ajouterUtilisateur(String login, String pwd);
}
