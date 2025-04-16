package com.proyecto1;

public abstract class LivingEntity implements IDamagable{

    private int maxHealth;
    private int currentHealth;


    public LivingEntity(int maxHealth){
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public int getCurrentHEalth(){
        return currentHealth;
    }

    @Override
    public void reciveDamage(int damage){
        currentHealth -= damage;
        System.out.println("You havce recived " + damage + " points of damage, now your current health is: " + currentHealth);
    }



    public abstract void attack(LivingEntity enemEntity);




}
