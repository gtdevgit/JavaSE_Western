package com.training.example;

import java.util.*;

/**
 * 
 */
public class Cowboy extends Humain {

    /**
     * Default constructor
     */
    public Cowboy(String nom) {
        super(nom);
        this.popularite = 0;
        caracteristique = "vaillant";
    }

    private int popularite;

    private String caracteristique;
    /**
     * @param dame
     */
    public void liberer(Dame dame) {
        dame.Liberer(this);
    }

    public void exclamer(){
        System.out.println("Prends ça rascal ! ");
    }

    public void tirer(Brigand brigand){
        System.out.println( "Le " + caracteristique + " " + quelEstTonNom() + " tire sur " + brigand.quelEstTonNom() + ". PAN !");
    }




}