package com.proyecto1;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;
    


    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
        System.out.println("Item added: " + item.getName());
    }


    public void showInventory(){
        System.out.println("Inventory:");

        for(int i = 0; i< items.size(); i++){
            System.out.println(i + ": " + items.get(i).getName());
        }
    }


    public void useItem(int index){
        if(index >= 0 && index < items.size()){
            items.get(index).use();
        }else{
            System.out.println("Invalid index.");
        }
    }

    public void deleteItem(Item item){
        for(Item it : items){
            if(it.getName() == item.getName()){
                items.remove(item);
                System.out.println("Item eliminado correctamente.");
            }else{
                System.out.println("Item no encontrado en el inventario");
            }
        }
    }
}
