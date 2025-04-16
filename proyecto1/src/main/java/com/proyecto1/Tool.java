package com.proyecto1;

public class Tool extends Item{

    //Atributos
    private String type; //por poner uno xd

    //Constructor
    public Tool(String name, int value, String type){
        super(name, value);
        this.type = type;
    }




    //acá se implemeta el metodo use

    public void use(){
        System.out.println("Using tool: " + getName() + " del tipo: " + type);
    }


}
