package com.training.example;

public class Sherif extends Cowboy{

    public Sherif(String nom) {
        super(nom);
    }

    private int nbBrigandCoffre;

    public int getNbBrigandCoffre() {
        return nbBrigandCoffre;
    }

    public String quelEstTonNom() {
        return "Shérif * " + super.quelEstTonNom();
    }

    public void coffrer(Brigand brigand){
        parler("Au nom de la loi, je vous arrête " + brigand.quelEstTonNom() + " !");
        nbBrigandCoffre++;
    }

    public void chercher(Brigand brigand){
        System.out.println("Le sherif recherche " + brigand.quelEstTonNom() + ".");
        parler("OYEZ OYEZ BRAVE GENS !! " + brigand.getRecompense() + "$ a qui arrétera " + brigand.quelEstTonNom() + ", mort ou vif !!");
    }
}
