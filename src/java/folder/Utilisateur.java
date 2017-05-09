/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author user
 */
public class Utilisateur {
//Attributs
String Nom;
String Password;
boolean Valide;
//Méthodes

    public String getNom() {
        return Nom;
    }

    public String getPassword() {
        return Password;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public boolean EstValide() {
        return Valide;
    }

    public void setValide(boolean Valide) {
        this.Valide = Valide;
    }
    
}
