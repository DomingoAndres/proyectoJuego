package com.proyecto1;

public class Main {
    public static void main(String[] args) {
        
        

        Weapon axe = new Weapon("noob killer", 10, 50);

        Potion juice = new Potion("Juguito", 5, 20);
        
        axe.use();
        juice.use();
        axe.use(25);

        Inventory bag = new Inventory(5);

        bag.addItem(axe);
        bag.addItem(juice);
        
    
        bag.useItem(1);

        bag.showInventory();

        bag.deleteItem(0);

        Npc monster = new Npc(100, "Rodolfo");
        Character warrior = new Character(100, "Dom", bag);

        warrior.attack(monster);
        monster.attack(warrior);

    }

}