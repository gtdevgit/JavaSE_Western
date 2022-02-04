package com.training.example;

public class Ripoux extends Sherif implements HorsLaloi{

    private int nbDameEnlevees;
    private int recompense = 1000;

    public Ripoux(String nom) {
        super(nom);
    }

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
}
