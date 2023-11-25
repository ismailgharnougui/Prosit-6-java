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
public class Caissier  extends Employe{
    private int numCais;
//    public Caissier()
//    {
//    super();
//    }
    
    public Caissier(int num,int id,String n)
    { //super();
    super(id,n);
    this.numCais=num;
    }
    public Caissier()
    {
        System.out.println("je suis le constructeur par defaut du caissier");
    }

    public int getNumCais() {
        return numCais;
    }

    public void setNumCais(int numCais) {
        this.numCais = numCais;
    }
    
    
    public void affi()
    {
        System.out.println("this :"+this.toString());
        System.out.println("super :"+super.toString());
    }
    public String toString()
    {
    
    return "Caissier :"+super.toString()+"num caisse :"+numCais;
    }

    @Override
    public void test() {
        
        System.out.println("je suis caissier");
        super.test();
        System.out.println("test");
    }
    public float calculSalaire()
    {
      float Salaire=0;
        if (this.nbHeure > 180){
            
         int Heure_Supp = this.nbHeure - 180 ;
         float Prix_Supp= (float) (Heure_Supp *(5+(5*0.15)));
         Salaire= (180 * 5 )+Prix_Supp ;

        } else
        Salaire= (this.nbHeure * 5 );
       
return Salaire;

    }

}
