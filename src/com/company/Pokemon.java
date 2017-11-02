package com.company;

public class Pokemon {

    //declare data types
    int attack;
    int defense;
    int speed;

    //initialize data types in default constructor
    public Pokemon() {
        attack = species.length() * 4 + 2;
        defense = species.length() * 2 + 7;
        speed = species.length() * 3 + 5;
    }

    //create getter and setter method for each data type
    public void setattack(int ) {
        attack = 0;
    }

    public void setdefense(int ) {
        defense = 0;
    }

    public void setspeed(int ) {
        speed = 0;
    }

    public int getattack() {
        return attack;
    }

    public int getdefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    //create evolve method
    public void evolve() {
        //double the speed stat
        //triple the attack stat
        //multiply the defense stat by 5
    }

}
