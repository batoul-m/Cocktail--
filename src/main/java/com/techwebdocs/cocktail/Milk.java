/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

/**
 *
 * @author user
 */
public class Milk extends Ingrediants{
    
    private Color mcolor = new Color();
    private String type;
    private Calories milkcal = new Calories();
   
    public Milk(String type) {
        this.type = type;
    }

    public String getColor() {
        return mcolor.getMilkColor();
    }

    public double getCalories(String milk) {
        return milkcal.getMilkCalories(milk);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getInfo() {
        return "Milk{" + "color=" + getColor() + ", calories=" + getCalories(type) + ", type=" + type + '}';
    }

    @Override
    public double caloriescal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}

