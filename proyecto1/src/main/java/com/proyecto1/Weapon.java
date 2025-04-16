package com.proyecto1;

public class Weapon extends Item implements Equipable {

    private int damage;
    private boolean equiped;


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
        if(equiped){
            System.out.println("Atacking  with " + getName() + ", Damage: " + damage);
        }else{
            System.out.println("equip weapon first.");
        }
    }

    public void use(int bonus){
        System.out.println("Atacking with " + getName() + ", Damage + bonus: " + (damage + bonus));
    }



    @Override
    public void Equip(){
        equiped = true;
        System.out.println(getName() + " equiped.");

    }

    @Override
    public void Unequip(){
        equiped = false;
        System.out.println(getName() + " unequiped.");
    }
}
