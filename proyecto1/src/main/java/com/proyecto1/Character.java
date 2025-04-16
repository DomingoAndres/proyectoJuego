package com.proyecto1;

public class Character extends LivingEntity {

    //Atributos

    private String name;
    private Inventory inventory;
    private boolean equipped;

    //Constructor
    public Character (int maxHealth, String name, Inventory inventory){
        super(maxHealth);
        this.name = name; 
        this.inventory = inventory;
    }

    public void equipWeapon(Weapon weapon){
        equipped = true;
        System.out.println(name + " ha equipado la siguiente arma: " + weapon.getName());
    }

    @Override
    public void attack(LivingEntity enemEntity) {
        enemEntity.reciveDamage(10);
    }

}
