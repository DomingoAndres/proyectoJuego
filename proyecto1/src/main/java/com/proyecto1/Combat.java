package com.proyecto1;

public class Combat {

    private Character playerCharacter;
    private Npc enemyCharacter;

    public Combat(Character playerCharacter, Npc enemyCharacter){
        this.playerCharacter = playerCharacter;
        this.enemyCharacter = enemyCharacter;
    }

    public void combatStart(){
        System.out.println("you have encontered an enemy: " + enemyCharacter.getName());

        while(isThereCombat()){
            
        }

    }


    public boolean isThereCombat(){
        if(playerCharacter.getCurrentHEalth() <0){
            playerCharacter.setIsDead(true);
            return playerCharacter.getIsDead();
        }else if(enemyCharacter.getCurrentHEalth() <0){
            enemyCharacter.setIsDead(true);
            return enemyCharacter.getIsDead();
        }
        return true;
    }


}
