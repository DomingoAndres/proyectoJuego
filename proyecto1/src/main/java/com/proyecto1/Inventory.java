package com.proyecto1;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;
    private int capacityLimit;
    private int actualCapacity;


    public Inventory(int capacityLimit){
        items = new ArrayList<>();
        this.capacityLimit = capacityLimit;
        this.actualCapacity = 0;
    }

    public int getCapacityLimit(){
        return capacityLimit;
    }

    public void setCapacityLimit(int capacityLimit){
        if(capacityLimit > 0){
            this.capacityLimit = capacityLimit;
        }else{
            System.out.println("Limit capacity has to be more tha 0.");
            return;
        }
    }

    public void addItem(Item item){ 
        if(actualCapacity < capacityLimit){
            items.add(item);
            actualCapacity ++;
            System.out.println("Item added: " + item.getName());
            System.out.println("Your actual capacity is: " + actualCapacity);
        }else{
            System.out.println("You have no more capacity.");
        }
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

    public void deleteItem(int index){
        if ((index >= 0 && index < items.size())){
            items.remove(index);
            actualCapacity --;
            System.out.println("Objeto eliminado.");
        }else{
            System.out.println("Item not found.");
        }
    }
}
