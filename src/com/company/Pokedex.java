package com.company;

javac Pokemon.java

public class Pokedex {
    //default constructor
    public Pokedex() {

    }

    //methods
    public String[] listPokemon() {
        //return all the names of the Pokemon species in the Pokedex
        return FIXME;
    }

    public boolean addPokemon(String species) {
        //add a pokemon to the pokedex and return true if it can
        //actually be added to the Pokedex
        return true;
        //If not, return false.
        return false;
    }

    public int[] checkStats(String species) {
        //return the stats of a certain Pokemon that you are
        //searching for
    }

    public void sortPokedex() {
        //sort pokedex in alphabetical order
    }

    public boolean evolvePokemon(String species) {
        //evolve a certain Pokemon that you are searching for on the
        //Pokedex and return true if the Pokemon is actually in
        //the Pokedex.
        return true;
        // If not, return false.
        return false;
    }


}
