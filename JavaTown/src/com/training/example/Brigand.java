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
    }

    public String quelEstTonNom() {
        return super.quelEstTonNom() + " le " + this.look;
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
        System.out.println("Ah ah ! " + dame.quelEstTonNom() + ", tu es mienne désormais.");
        dame.Enlever();
    }

    /**
     * 
     */
    public void emprisonner(Cowboy cowboy) {
        System.out.println("Dammed, je suis fait ! " + cowboy.quelEstTonNom() + ", tu m'as eu !" );
    }

    /**
     * @return
     */
    public int getRecompense() {
        // TODO implement here
        return 0;
    }

}