package com.training.example;

import java.util.*;

/**
 * 
 */
public class Cowboy extends Humain implements VisagePale {

    /**
     * Default constructor
     */
    public Cowboy(String nom) {
        super(nom);
        this.popularite = 0;
        this.caracteristique = "vaillant";
        this.boissonFavorite = "whisky";
    }

    public void sePresenter() {
        super.sePresenter();
        parler("Je suis " + caracteristique + " J' ai une popularite de " + popularite + ".");
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
        parler("Prends ça rascal ! ");
    }

    public void tirer(HorsLaloi horsLaloi){
        parler( "Le " + caracteristique + " " + quelEstTonNom() + " tire sur " + horsLaloi.quelEstTonNom() + ". PAN !");
    }

    @Override
    public void scalp() {
        parler("Aïe ma tête !");
    }
}