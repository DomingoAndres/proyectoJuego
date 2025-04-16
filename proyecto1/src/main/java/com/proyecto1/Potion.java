package com.proyecto1;

public class Potion extends Item implements Consumable{

    private int healing;


    //Constructor

    public Potion(String name, int value, int healing){
        super(name, value);
        this.healing = healing;
    }

    //Getters

    public int getHealing(){
        return healing;
    }

    //Setters


    @Override
    public void use(){
        System.out.println("Healing with " + getName() + ", points recovered: " + healing);
    }

    @Override
    public void consume(){
        System.out.println("Consumiendo pocion, recuperando vida.");
    }
}
