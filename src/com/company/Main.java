package com.company;

import java.util.Scanner;

public class Main {

    //javac Pokemon.java Pokedex.java Main.java
    //java Main

    public static void menu() {
        System.out.println("1. List Pokemon (List all the Pokemon species in the Pokedex)");
        System.out.println("2. Add Pokemon (Adds a Pokemon to the Pokedex)");
        System.out.println("3. Check Pokemon Stats (Checks the stats of a certain Pokemon)");
        System.out.println("4. Evolve Pokemon (Evolves a certain Pokemon)");
        System.out.println("5. Sort Pokemon (Sorts Pokemon in alphabetical order)");
        System.out.println("6. Exit (Exits the program)");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numPokemon = 0;
        //exit loop boolean
        boolean done = false;
        //input validation boolean
        boolean isInt;
        int option;
        String userInput = "";

        System.out.println("Welcome to your new PokeDex!");
        System.out.println("How many Pokemon are in your region: ");
        numPokemon = scnr.nextInt();
        System.out.println("Your new Pokedex can hold " + numPokemon + " Pokemon. Let’s start using it!");

        //begin loop

        while (done != true) {

            //validate input
            do {
                //user inputs their option choice
                System.out.println("\n" + "What would you like to do?" + "\n");
                //call method to display menu options
                menu();
                if (scnr.hasNextInt()) {
                    option = scnr.nextInt();
                    isInt = true;
                } else {
                    System.out.print("\n" + "That is not a valid choice. Try again." + "\n");
                    isInt = false;
                    scnr.next();
                }
            }
            while (!(isInt));


            //call respective menu option method
            if (option == 1) {
                alphabeticalSort(userInput);
            } else if (option == 2) {
                frequencySort(userInput);
            } else if (option == 3) {
                charTypes(userInput);
            } else if (option == 4) {
                done = true;
                exit();
            } else {
                System.out.print("Error, bad input, please enter a number 1-4");
            }

        }



        Pokemon pokemon = new Pokemon();




    }
}
