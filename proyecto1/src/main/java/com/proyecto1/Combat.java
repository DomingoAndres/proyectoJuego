package com.proyecto1;

import java.util.Scanner;

public class Combat {

    private Character playerCharacter;
    private Npc enemyCharacter;
    Scanner scanner = new Scanner(System.in);

    public Combat(Character playerCharacter, Npc enemyCharacter){
        this.playerCharacter = playerCharacter;
        this.enemyCharacter = enemyCharacter;
    }

    public void combatStart(){
        int opcion = 0;
        System.out.println("you have encontered an enemy: " + enemyCharacter.getName());

        while(isThereCombat()){
            System.out.println("---MENU DE COMBATE---");
            System.out.println("1. Atacar");
            System.out.println("2.Usar Item");
            System.out.println("3. Pasar");
            System.out.println("Elige una opcion:");
            opcion = scanner.nextInt();
            

            switch(opcion){
                case 1:
                playerCharacter.attack(enemyCharacter);
                break;
                case 2:
                System.out.println("no se");
                break;
                case 3:
                System.out.println("El jugador ha elgido pasar.");
                break;
                default:
                System.out.println("Opcion invalida.");
            }

            if(!enemyCharacter.getIsDead()){
                enemyCharacter.attack(playerCharacter);
            }
        }

        if(playerCharacter.getIsDead()){
            System.out.println("perdiste bobo");
        }else{
            System.out.println("ganaste crack");
        }

    }


    public boolean isThereCombat(){
       if(playerCharacter.getCurrentHEalth() <= 0){
        playerCharacter.setIsDead(true);
        return false;
       }
       else if(enemyCharacter.getCurrentHEalth() <= 0){
        enemyCharacter.setIsDead(true);
        return false;
       }

       return true;

    }


}
