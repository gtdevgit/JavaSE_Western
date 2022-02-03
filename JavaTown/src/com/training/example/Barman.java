package com.training.example;

public class Barman extends Humain{

    private String nomBar;

    public Barman(String nom){
        super(nom);
        this.nomBar = "Chez " + nom;
        this.boissonFavorite = "vin";
    }

    public Barman(String nom, String nomBar){
        super(nom);
        this.nomBar = nomBar;
    }

    public void parler(String texte){
        super.parler(texte + " Coco.");
    };

    public void sePresenter() {
        super.sePresenter();
        parler("Je suis le patron du bar " + nomBar);
    }

    public void servir(Humain humain){
        parler("Voila votre " + humain.boissonFavorite);
    }
}
