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
public class Vendeur  extends Employe{
    private int tauxDeVente;

    
    public Vendeur(int taux,int id, int nbHeure, String nom, String adresse)
    {
    super(id,nbHeure,nom,adresse);
    
    tauxDeVente=taux;
    
    
    }
    public int getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(int tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }
    
    public String toString()
    {
    return "Vendeur :"+super.toString()+"Taux de vente :"+tauxDeVente;
    
    }
        public float calculSalaire() {
            return (450*tauxDeVente)/100;
    }

    
}
