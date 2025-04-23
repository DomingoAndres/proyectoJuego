package com.proyecto1;

public abstract class LivingEntity implements IDamagable{

    private int maxHealth;
    private int currentHealth;
    private boolean isDead = false;


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

    public boolean getIsDead(){
        return isDead;
    }

    public void setIsDead(boolean isDead){
        this.isDead = isDead;
    }

    @Override
    public void reciveDamage(int damage){
        currentHealth -= damage;
        System.out.println("You havce recived " + damage + " points of damage, now your current health is: " + currentHealth);
    }



    public abstract void attack(LivingEntity enemEntity);




}
