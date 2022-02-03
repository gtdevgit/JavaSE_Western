package com.training.example;

import java.util.*;

/**
 * 
 */
public class Dame extends Humain {

    public static final boolean LIBRE = true;
    public static final boolean ENLEVE = false;

    /**
     * Default constructor
     */
    public Dame(String nom) {
        super(nom);
        this.etat = LIBRE;
        this.couleurRobe = "blanche";
        this.boissonFavorite = "lait";
    }


    public String quelEstTonNom() {
        return "Miss " + super.quelEstTonNom();
    }

    public void sePresenter() {
        super.sePresenter();
        parler("J'ai une robe " + couleurRobe + ".");
    }
    /**
     * 
     */
    private boolean etat;

    /**
     * 
     */
    public String couleurRobe;

    /**
     * 
     */
    public void Enlever() {
        parler("AU SECOUR !");
        etat = ENLEVE;
    }

    /**
     * 
     */
    public void Liberer(Cowboy cowboy) {
        etat = LIBRE;
        parler("Merci " + cowboy.quelEstTonNom() + ".");
    }

    /**
     * @return
     */
    public boolean getEtat() {
        return this.etat;
    }

    /**
     * @param couleurRobe
     */
    public void changerRobe(String couleurRobe) {
        parler("Regardez ma nouvelle robe " + couleurRobe);
        this.couleurRobe = couleurRobe;
    }

}