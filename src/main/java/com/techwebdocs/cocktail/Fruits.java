/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

/**
 *
 * @author user
 */
public class Fruits extends Ingrediants{
    private int number;
    private String type;
    private Color fcolor = new Color();
    private static int count;
    private Calories fcal= new Calories();
    private double calSum = 0.0;
    private double cal;

    public Fruits(){
    
    }
    public Fruits(int number, String type) {
        this.number = number;
        this.type = type;
        count++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public String getColor(String type) {
        return fcolor.getFruitColor(type);
    }


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Fruits.count = count;
    }

    public double getCalories(String type){
        return fcal.getFruitCalories(type);
    }
    
 


    public String getInfo() {
        return "Fruits{" + "number=" + number + ", type=" + type + ", calories=" + getCalories(type) + ", color=" + getColor(type) + '}';
    }

    @Override
    public double caloriescal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}