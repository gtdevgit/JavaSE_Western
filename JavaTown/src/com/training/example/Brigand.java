package com.training.example;

import java.util.*;

/**
 * 
 */
public class Brigand extends Humain implements HorsLaloi, VisagePale {

    public static final boolean LIBRE = true;
    public static final boolean EN_PRISON = false;

    /**
     * Default constructor
     */
    public Brigand(String nom) {
        super(nom);
        this.look = "méchant";
        this. nbDameEnlevees = 0;
        this.recompense = 100;
        this.etat = LIBRE;
        this.boissonFavorite = "tord-boyaux";
    }

    public void sePresenter() {
        super.sePresenter();
        parler("J'ai enlevé " + nbDameEnlevees + " dame(s). La récompense pour ma capture est de " + recompense + "$.");
    }

    /**
     * 
     */
    public String look ;

    /**
     * 
     */
    public int nbDameEnlevees;

    /**
     * 
     */
    private int recompense;

    /**
     * 
     */
    public boolean etat;

    @Override
    public void emprisonne(Cowboy c) {
        parler("Dammed, je suis fait ! " + c.quelEstTonNom() + ", tu m'as eu !" );
    }

    @Override
    public void kidnappe(Dame dame) {
        parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne désormais.");
        dame.Enlever();
        nbDameEnlevees++;
    }

    @Override
    public int getMiseAPrix() {
        return recompense;
    }

    @Override
    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + this.look + ".";
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !");
    }
}