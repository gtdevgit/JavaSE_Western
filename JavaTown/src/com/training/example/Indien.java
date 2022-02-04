package com.training.example;

public class Indien extends Humain{
    private int nbPlumes;
    private String totem = "Coyote";

    public Indien(String nom) {
        super(nom);
        boissonFavorite = "jue de racine";
    }

    public void scalper(VisagePale visagePale){
        visagePale.scalp();
        nbPlumes++;
    }

    public void parler(String texte){
        super.parler(texte + " Ugh !");
    };
}
