/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import Entite.Produit;
import GestionEmploye.*;
import GestionEmploye.Employe;
import GestionEmploye.Responsable;
import GestionException.MagasinPleinException;
import GestionException.PrixNegatifException;

/**
 *
 * @author sanabenfadhel
 */
public class Magasin {

    private int identifiant;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] tabprod = new Produit[CAPACITE];
    private int compP;
    private static int nbTotalP;

    private final int CAPACITE_EMP = 20;

    private Employe[] tabEmp = new Employe[CAPACITE_EMP];

    private int compE;

    public Magasin(int id, String ad) {
        identifiant = id;
        adresse = ad;
    }

    public void ajouter(Employe e) {
        if (compE < CAPACITE_EMP) {
            tabEmp[compE] = e;
            compE++;
        } else {

            System.out.println("Magasin plein");
        }

    }

    public void afficheSalaire() {

        for (int i = 0; i < compE; i++) {
            System.out.println("Salaire :" + tabEmp[i].calculSalaire());
        }
    }

    public void affichePrime() {

        for (int i = 0; i < compE; i++) {
            if (tabEmp[i] instanceof Responsable) {
                Responsable res = (Responsable) tabEmp[i];
                System.out.println("Prime :" + res.getPrime());

            } else {
                System.out.println("la case d'indice i"
                        + i + "ce n'est pas un responsable");
            }
        }
    }

    public void afficheNbEmpParType() {
        int nbC = 0, nbR = 0, nbV = 0;

        for (int i = 0; i < compE; i++) {
            if (tabEmp[i] instanceof Caissier) {
                nbC++;
            }

            if (tabEmp[i] instanceof Responsable) {
                nbR++;
            }

            if (tabEmp[i] instanceof Vendeur) {
                nbV++;
            }

        }

        System.out.println("le nombre des vendeurs :" + nbV);
        System.out.println("le nombre des responsables :" + nbR);
        System.out.println("le nombre des caissiers :" + nbC);

    }

    public void afficherEmploye() {
        for (int i = 0; i < compE; i++) {
            System.out.println(tabEmp[i]);
        }

    }

    public void ajouter(Produit p)
            throws MagasinPleinException,PrixNegatifException{
        if (compP < CAPACITE) {
            if (!chercher(p)) {
                if(p.getPrix()>0){
                tabprod[compP] = p;
                compP++;
                nbTotalP++;}
                else{
                throw new PrixNegatifException("le prix est négatif");
                }
            } else {
                System.out.println("le produit existe");
            }
        } else {
           throw new MagasinPleinException("la magasin est plein");
        }
    }

    public static int nbTotal() {
        return nbTotalP;
    }

    public void afficherMarquePro() {
        for (int i = 0; i < compP; i++) {
            System.out.println(tabprod[i].getMarque());
        }

    }

    public String toString() {
        String str = "l'ensemble des produits :\n";
        String str2="les employés :\n";
        for (int i = 0; i < compP; i++) {
            str += tabprod[i] + "\n";
        }
        
        for(int i=0;i<compE;i++)
        {
        str2+=tabEmp[i]+"\n";
        }

        return "identifiant :" + identifiant
                + "adrese" + adresse + str+str2;
    }

    public boolean chercher(Produit p) {
        for (int i = 0; i < compP; i++) {
            //if(Produit.comparer(p, tabprod[i]))
            if (p.comparer(tabprod[i])) {
                return true;
            }
        }
        return false;
    }

    public int chercherP(Produit p) {
        int pos = -1;

        for (int i = 0; i < compP; i++) {
            if (tabprod[i].comparer(p)) {
                pos = i;
            }
        }
        return pos;
    }

    public boolean supprimer(Produit p) {
        int index = chercherP(p);
        boolean test = false;

        if (index == -1) {
            test = false;
        } else {
            for (int i = index; i < compP - 1; i++) {
                tabprod[index] = tabprod[i + 1];
            }
            test = true;
            compP--;
            nbTotalP--;
        }
        return test;
    }

    public Magasin PlusProdut(Magasin m) {
        if (this.compP > m.compP) {
            return this;
        } else {
            return m;
        }
    }

    public static Magasin PlusProdut(Magasin m1, Magasin m2) {
        if (m1.compP > m2.compP) {
            return m1;
        } else {
            return m2;
        }
    }
}
