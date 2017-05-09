/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebClasses;

/**
 *
 * @author user
 */
public class Agent {
   //Attributs 

    /**
     *
     */
    static String Acces;
    static String Username;
    static String Pass;
    String Matricule;
    String Role;
    String Password;
    String Bpr;
    String Succursal;
    String Agence;
    String Nom;
    String Prenom;
    String Fonction;
    String Email;
    String Version;
    boolean Actif;
    public boolean Valide;

    public static String getAcces() {
        return Acces;
    }

    public static void setAcces(String Acces) {
        Agent.Acces = Acces;
    }
     
    public static String getUsername() {
        return Username;
    }

    public static void setUsername(String Username) {
        Agent.Username = Username;
    }

    public static String getPass() {
        return Pass;
    }

//Méthodes
    public static void setPass(String Pass) {
        Agent.Pass = Pass;
    }

    public String getMatricule() {
        return Matricule;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getBpr() {
        return Bpr;
    }

    public String getSuccursal() {
        return Succursal;
    }

    public String getAgence() {
        return Agence;
    }

    public String getFonction() {
        return Fonction;
    }

    public String getRole() {
        return Role;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public String getVersion() {
        return Version;
    }
    public boolean getActif() {
        return Actif;
    } 
// setters
    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setBpr(String Bpr) {
        this.Bpr = Bpr;
    }

    public void setSuccursal(String Succursal) {
        this.Succursal = Succursal;
    }

    public void setAgence(String Agence) {
        this.Agence = Agence;
    }

    public void setFonction(String Fonction) {
        this.Fonction = Fonction;
    }

    public void setValide(boolean Valide) {
        this.Valide = Valide;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public void setActif(boolean Actif) {
        this.Actif = Actif;
    }
   
    public boolean EstValide() {
        return Valide;
    }
    

}
