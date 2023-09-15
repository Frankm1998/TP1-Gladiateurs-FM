package personnages;

import java.util.Random;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.pointsDeVie = pvs;
        this.initiative = ini;
    }

    public Personnage() {
        this.nom = "";
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public String getNom() {
        return nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    //Setters 
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println();
        System.out.println(this.getNom());
        System.out.println("\t Attaque : " + this.getValeurMaxAttaque());
        System.out.println("\t Défense : " + this.getValeurDefense());
        System.out.println("\t Points de vie : " + this.getPointsDeVie());
        System.out.println("\t Initiative : " + this.getInitiative());
        System.out.println("\t Statut : " + this.estVivant());
    }

    public String estVivant() {
        String statut;
        if (this.getPointsDeVie() > 0) {
            statut = "Vivant";
        } else {
            statut = "Mort";
        }
        return statut;
    }

    private int attaqueCalcul() {
        Random rand = new Random();
        int degatsAttaque = rand.nextInt(this.getValeurMaxAttaque() - 0);
        return degatsAttaque;
        
    }

    public void frapperPersonnage(Personnage personnageCible) {
        int forceDeFrappe = this.attaqueCalcul();
        int valeurDefense = personnageCible.getValeurDefense();
        int dommages = forceDeFrappe - valeurDefense;
        if (dommages < 0) {
            dommages = 0;
        }
        personnageCible.setPointsDeVie((personnageCible.getPointsDeVie() - dommages));
        if (personnageCible.getPointsDeVie() < 0) {
            personnageCible.setPointsDeVie(0);
        }

        System.out.println();
        System.out.println(this.getNom() + " attaque avec une puissance de : " + forceDeFrappe);
        System.out.println(personnageCible.getNom() + " a une défense de : " + valeurDefense);
        System.out.println("Les dommages sont donc de : " + dommages);

    }

    public void setNewInitiativeRandom() {
        Random rand = new Random();
        this.setInitiative(rand.nextInt(100 - 0));
    }
    // </editor-fold>
}
