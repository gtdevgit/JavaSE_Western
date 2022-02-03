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
        System.out.println("Il était une fois...");

        Dame daisy = new Dame("Daisy");
        Brigand dalton = new Brigand("Joe Dalton");
        Cowboy luke = new Cowboy("Lucky Luke");

        daisy.sePresenter();
        dalton.sePresenter();
        luke.sePresenter();

        dalton.kidnapper(daisy);
        luke.tirer(dalton);
        dalton.emprisonner(luke);
        luke.liberer(daisy);



    }

}