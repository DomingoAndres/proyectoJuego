package com.proyecto1;

public class Npc extends LivingEntity{
    public Npc(int maxHealth){
        super(maxHealth);
    }



    @Override
    public void attack(LivingEntity enemEntity){
        enemEntity.reciveDamage(10);
    }
}
