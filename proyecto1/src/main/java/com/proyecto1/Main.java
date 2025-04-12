package com.proyecto1;

public class Main {
    public static void main(String[] args) {
        
        
        Item sword = new Item("Sword", 20);

        Item validar = new Item("Validar", 0);

        Weapon axe = new Weapon("noob killer", 10, 50);

        Potion juiuce = new Potion("Juguito", 5, 20);
        
        axe.use();
        juiuce.use();
        axe.use(25);

        Inventory bag = new Inventory();

        bag.addItem(axe);
        bag.addItem(juiuce);
        
    
        bag.useItem(1);

        bag.showInventory();
    }

}