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
public class Responsable extends Employe{
    private int prime;

    public Responsable(int prime,int id, int nbHeure, String nom, String adresse)
    {
    
    super(id,nbHeure,nom,adresse);
    this.prime=prime;
    } 
    public Responsable()
    {
    super();
    }
    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }
    
    
    public String toString()
    {
    
    return "Responsable :"+super.toString()+"Prime :"+prime;
    }
    
public float calculSalaire()
  {
          float Salaire = 0;
        if (this.nbHeure > 160) {

            int Heure_Supp = this.nbHeure - 160;
            float Prix_Supp = (float) (Heure_Supp * (10 + (10 * 0.2)));
            Salaire = (160 * 10) + Prix_Supp + prime;

        } else {
            Salaire = (this.nbHeure * 10) + prime;
        }

        return Salaire;

  
  }

}
