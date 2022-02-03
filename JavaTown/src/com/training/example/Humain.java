package com.training.example;

import java.util.*;

/**
 * 
 */
public class Humain {

    public Humain(String nom) {
        this.nom = nom;
        this.boissonFavorite = "eau";
    }

    private String nom;

    protected String boissonFavorite;

    public String getBoissonFavorite() {
        return this.boissonFavorite;
    }

    public void parler(String texte){
        System.out.println("(" + nom + ") - << " + texte + " >>" );
    }

    public void sePresenter() {
        parler("Bonjour, je suis " + quelEstTonNom() + ". Ma boisson favorite est le " + getBoissonFavorite() + ".");
    }

    public void boire() {
        parler("Ah ! Un bon verre de " + getBoissonFavorite() + " ! GLOUPS !");
    }

    public String quelEstTonNom() {
        return this.nom;
    }

}