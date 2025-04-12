package com.proyecto1;

public class Weapon extends Item {

    private int damage;


    //Constructor

    public Weapon (String name, int value, int damage){
        super(name, value);
        this.damage = damage;
    }

    //Getters
    public int getDamage(){
        return damage;
    }

    //Setters
    public void setDamage(int damage){
        this.damage = damage;
    }

    @Override
    public void use(){
        System.out.println("Atacking  with " + getName() + ", Damage: " + damage);
    }

    public void use(int bonus){
        System.out.println("Atacking with " + getName() + ", Damage + bonus: " + (damage + bonus));
    }

}
