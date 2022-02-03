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

    private String boissonFavorite;

    public String getBoissonFavorite() {
        return this.boissonFavorite;
    }

    public void sePresenter() {
        System.out.println("Bonjour, je suis " + quelEstTonNom() + ". Ma boisson favorite est " + getBoissonFavorite() + ".");// TODO implement here
    }

    public void boire() {
        System.out.println("Ah ! Un bon verre de " + getBoissonFavorite() + " ! GLOUPS !");
    }

    public String quelEstTonNom() {
        return this.nom;
    }

}