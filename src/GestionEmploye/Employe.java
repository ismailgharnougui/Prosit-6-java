/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEmploye;

/**
 *
 * @author sanabenfadhel
 */
public abstract class Employe {

    protected int id, nbHeure;
    protected String nom, adresse;
//

    public Employe(int id, String n) {
        this.id = id;
        nom = n;
    }

    public Employe(int id, int nbHeure, String nom, String adresse) {
        this.id = id;
        this.nbHeure = nbHeure;
        this.nom = nom;
        this.adresse = adresse;
    }

    public Employe() {

        System.out.println("je suis le constructeur par défaut");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(int nbHeure) {
        this.nbHeure = nbHeure;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String toString() {
        return "id :" + id + "nom :" + nom
                + "adresse :" + adresse + "nombre heure :" + nbHeure;
    }

    public void test() {

        System.out.println("je suis employe");
    }

    public abstract float calculSalaire();

    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != this.getClass()) {
            return false;
        }

        Employe e = (Employe) o;
        if (e.id == this.id && e.nom.equals(nom)) {
            return true;

        }
        return false;
    }
}
