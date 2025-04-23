package com.proyecto1;

public class Npc extends LivingEntity{
    
    private String name;
    
    public Npc(int maxHealth, String name){
        super(maxHealth);
        this.name = name;
    }



    @Override
    public void attack(LivingEntity enemEntity){
        enemEntity.reciveDamage(10);
    }
}
