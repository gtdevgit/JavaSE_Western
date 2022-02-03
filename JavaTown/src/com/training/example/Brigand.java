package com.training.example;

import java.util.*;

/**
 * 
 */
public class Brigand extends Humain {

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

    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + this.look + ".";
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

    /**
     * @param dame
     */
    public void kidnapper(Dame dame) {
        parler("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne désormais.");
        dame.Enlever();
    }

    /**
     * 
     */
    public void emprisonner(Cowboy cowboy) {
        parler("Dammed, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m'as eu !" );
    }

    /**
     * @return
     */
    public int getRecompense() {
        // TODO implement here
        return recompense;
    }

}