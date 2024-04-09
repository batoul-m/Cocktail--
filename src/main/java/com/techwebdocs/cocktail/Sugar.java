/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

/**
 *
 * @author user
 */
public class Sugar extends Ingrediants{
    
    private double calories;
    private String type;
    private String size;
    private Calories sugarCal = new Calories();
    private Color sugarColor = new Color();

    public Sugar( String type, String size) {
        this.type = type;
        this.size = size;
    }

    

    public double getCalories(String type) {
        return sugarCal.getSugarCalories(type);
    }

    public String getColor(String type){
        return sugarColor.getSugarColor(size);
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    
    public String getInfo() {
        return "Sugar{" + "calories=" + getCalories(type) + ", type=" + type + ", size=" + size + " color="+getColor(type)+" }";
    }

    @Override
    public double caloriescal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

