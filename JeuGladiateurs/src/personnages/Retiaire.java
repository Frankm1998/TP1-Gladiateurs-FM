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
public class Retiaire extends Personnage {

    //*******************************************************************************
    // <editor-fold desc="ATTRIBUTS">
    boolean possedeFilet;
    String classe;

    // </editor-fold>
    //*******************************************************************************
    // <editor-fold defaultstate="collapsed" desc="CONSTRUCTEURS et INITIALISATION">
    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
        this.possedeFilet = true;
        this.classe = "Retiaire";
    }

    public Retiaire() {
        super();
        this.possedeFilet = true;
        this.classe = "Retiaire";
    }

    // </editor-fold>
    //*******************************************************************************
    // <editor-fold desc="MÉTHODES">
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        System.out.println();
        if (this.possedeFilet) {
            System.out.println(this.getNom() + " lance son filet");
        }
        Random rand = new Random();
        if (rand.nextInt(100 - 0) >= 90 && this.possedeFilet) {
            personnageCible.setPointsDeVie(0);
            System.out.println("Son filet attrape " + personnageCible.getNom() + " et il l'empale sauvagement avec sa lance");
        } else if (this.possedeFilet) {
            this.possedeFilet = false;
            System.out.println("Le filet n'atteint pas sa cible");
        } else {
            System.out.println(this.getNom() + " ramasse son filet et en profite pour attaquer");
            this.possedeFilet = true;
            super.frapperPersonnage(personnageCible);
        }
    }

    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("\t Classe : " + this.classe);
    }

    // </editor-fold>
    //*******************************************************************************
    // <editor-fold defaultstate="collapsed" desc="GETTERS et SETTERS">
    // </editor-fold>
}
