/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionEmploye;

import Gestion.Magasin;

/**
 *
 * @author sanabenfadhel
 */
public class TestEmploye {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //  Employe e1=new Employe(1,"nom");
        System.out.println("test ");
        Caissier c1 = new Caissier(12, 2, "nom");

        System.out.println("id c1:" + c1.getId());
        System.out.println("num Cais :" + c1.getNumCais());

        System.out.println("nom de c1 :" + c1.getNom());

        Caissier c2 = new Caissier(12, 2, "nom");

        
        

        System.out.println(c1.toString());
        System.out.println(c1);

        c1.affi();
        c1.test();

        Responsable res1 = new Responsable(500, 2, 20, "sana", "tunis");
        Vendeur v1 = new Vendeur(1000, 3, 40, "n", "ariana");

        Magasin m1 = new Magasin(1, "ariana");
        c1.setNbHeure(20);
        m1.ajouter(c1);
        //  m1.ajouter(e1);

        m1.ajouter(res1);
        m1.ajouter(v1);

        m1.afficherEmploye();

        m1.afficheSalaire();

        Employe e1 = new Caissier(1, 2, "nn");

        System.out.println(e1.toString());

        if (e1 instanceof Caissier) {
            Caissier c3 = (Caissier) e1;

            System.out.println("num Caiss :" + c3.getNumCais());

        } else {
            System.out.println("ce n'est pas un caissier");
        }
        
        if(e1 instanceof Responsable)
        {
        //Responsable res2 = (Responsable) e1;

        System.out.println("Prime :" + ((Responsable)e1).getPrime());
        }
        else{
            System.out.println("ce n'est pas un responsable");
        }
        
        
        m1.affichePrime();
        
        
        System.out.println(m1);
        
        
        String str1="abc";
        String str4="abc";
        
        
        String  str2=new String("abc");
        String str3=new String("abc");
        
        System.out.println("test string");
        System.out.println(str1==str4);
        System.out.println(str1==str3);
        
        
        System.out.println(str1.equals(str3));
        
        
        m1.afficheNbEmpParType();
        
        
        
        System.out.println(c1.equals(c2));
        
        
        System.out.println(str1.equals(e1)); //false
   
        
        Caissier c3=new Caissier(1, 4, "nom");
        
        Responsable res3=new Responsable();
        res3.setId(4);
        res3.setNom("nom");
        
        
        System.out.println(e1.equals(str1));
        
        System.out.println(c3.equals(res3));
        
        
        System.out.println(c3.getClass());
         System.out.println(res3.getClass());
    }

}
