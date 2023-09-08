/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package personnages;

import java.util.Random;

/**
 *
 * @author 201530970
 */
public class Mirmillon extends Personnage {
    //*******************************************************************************
    // <editor-fold desc="ATTRIBUTS">
    

    // </editor-fold>

    //*******************************************************************************
    // <editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS et INITIALISATION">
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    public  Mirmillon() {
        super();
    }

    // </editor-fold>

    //*******************************************************************************
    // <editor-fold desc="MÉTHODES">
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);
        System.out.println();
        if (personnageCible.getPointsDeVie() == 0) {
            System.out.println(this.getNom() + " décapite son adversaire !!!");
        }
        else {
            System.out.println(this.getNom() + " attaque de nouveau !!!");
            super.frapperPersonnage(personnageCible);
        }
        
    }
    
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
    }
    
    @Override
    public void setNewInitiativeRandom() {
        Random rand = new Random();
        this.setInitiative(rand.nextInt(30 - 0));
    }
    // </editor-fold>

    //*******************************************************************************
    // <editor-fold defaultstate="collapsed" desc="GETTERS et SETTERS">


    // </editor-fold>
}
