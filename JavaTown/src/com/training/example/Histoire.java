package com.training.example;

import java.util.*;

/**
 * 
 */
public class Histoire {

    /**
     * Default constructor
     */
    public Histoire() {
    }

    /**
     * @param args 
     * @return
     */
    public static void main(String[] args) {
        // TODO implement here
        System.out.println("");
        System.out.println("ACTE I");
        System.out.println("");

        System.out.println("Il était une fois...");

        Dame daisy = new Dame("Daisy");
        Brigand dalton = new Brigand("Joe Dalton");
        Cowboy luke = new Cowboy("Lucky Luke");

        daisy.sePresenter();
        dalton.sePresenter();
        luke.sePresenter();

        dalton.kidnappe(daisy);
        luke.tirer(dalton);
        dalton.emprisonne(luke);
        luke.liberer(daisy);

        Barman john = new Barman("John");
        john.servir(luke);
        john.servir(dalton);

        System.out.println("");
        System.out.println("ACTE II");
        System.out.println("");

        System.out.println("Il était une deuxième fois...");

        Dame lola = new Dame("Lola");
        Brigand chapo = new Brigand("Chapo");
        Sherif bill = new Sherif("Wild Bill Hickock");
        lola.sePresenter();
        chapo.sePresenter();
        bill.sePresenter();

        lola.changerRobe("bleu");
        chapo.kidnappe(lola);
        bill.chercher(chapo);
        bill.tirer(chapo);
        bill.coffrer(chapo);
        chapo.emprisonne(bill);
        bill.liberer(lola);

        System.out.println("");
        System.out.println("ACTE III - Les Ripoux");
        System.out.println("");

        System.out.println("Il était encore une fois...");

        Ripoux rene = new Ripoux("René Boisrond");
        Dame simone = new Dame("Simone");
        Sherif lesbuche = new Sherif("Lesbuche");

        lesbuche.tirer(rene);
        lesbuche.coffrer(rene);
        rene.emprisonne(lesbuche);

        lesbuche.liberer(simone);

        System.out.println("");
        System.out.println("ACTE IV");
        System.out.println("");

        FemmeBrigand anabelle = new FemmeBrigand("Anabelle");
        anabelle.sePresenter();
        anabelle.changerRobe("rose");
        anabelle.kidnappe(lola);
        bill.liberer(lola);
        bill.coffrer(anabelle);
        anabelle.emprisonne(bill);
        anabelle.changerRobe("orange");

/*        System.out.println("");
        System.out.println("*** THE END *** ");
        System.out.println("");
        System.out.println("Par ordre d'apparition");
        System.out.println("");

        daisy.sePresenter();
        dalton.sePresenter();
        luke.sePresenter();
        lola.sePresenter();
        chapo.sePresenter();
        bill.sePresenter();*/
    }
}