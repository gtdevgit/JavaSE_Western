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
        System.out.println("AU SECOUR !");
        etat = ENLEVE;
    }

    /**
     * 
     */
    public void Liberer(Cowboy cowboy) {
        etat = LIBRE;
        System.out.println("Merci " + cowboy.quelEstTonNom() + ".");
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
        System.out.println("Regardez ma nouvelle robe " + couleurRobe);
        this.couleurRobe = couleurRobe;
    }

}