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

    public void coffrer(HorsLaloi horsLaLoi){
        parler("Au nom de la loi, je vous arrête " + horsLaLoi.quelEstTonNom() + " !");
        nbBrigandCoffre++;
    }

    public void chercher(HorsLaloi horsLaLoi){
        System.out.println("Le sherif recherche " + horsLaLoi.quelEstTonNom() + ".");
        parler("OYEZ OYEZ BRAVE GENS !! " + horsLaLoi.getMiseAPrix() + "$ a qui arrétera " + horsLaLoi.quelEstTonNom() + ", mort ou vif !!");
    }
}
