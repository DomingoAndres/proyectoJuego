package com.proyecto1;

public abstract class Item {

    
    //Atributos
    private String name;
    private int value;
    //Tambien se deberia agregar atributo de espacio para reflejar en el inventario?

    
    //Constructor
    public Item(String name, int value){
        this.name = name;
        this.value = value;
    }

    
    //Getters
    public String getName(){
        return name;
    }

    public int getValue(){
        return value;
    }


    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setValue(int value){
        if(value > 0){
            this.value = value;
        }
        else{
            System.out.println("The value has to be greater than zero.");
        }
    }

    public abstract void use();
        
    
}
