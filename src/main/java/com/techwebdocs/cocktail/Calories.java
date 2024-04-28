/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Calories {
    private String[] fruit ;
    private double[] fruitCal ;
           
    private String[] milk;
    private double[] milkCal;
    
    private String[] sugar;
    private double[] sugarCal;
    
    private static double totalCalories;
    private String[] stringArray;

    public Calories() {
        fruit = new String[]{"banana", "apple","blueberries","mango","pineapple","orange","cherry"}; 
        fruitCal = new double[]{69.0, 89.0,58.0,83.0,215.0,47.0,50.0}; 
        
        milk=new String[]{"normal","light","oat"};
        milkCal=new double[]{150.0,106.0,120};
        
        sugar=new String[]{"white","brown"};
        sugarCal=new double[]{385.0 ,380.0 };
    }
    
    public double getFruitCalories(String fruits) {
        for(int i=0;i<fruit.length;i++){
            if(fruit[i].equalsIgnoreCase(fruits)){
                return fruitCal[i];
            }
        }
        return -1 ;
    
    }
    
    public double getMilkCalories(String milks){
        for(int i=0;i< milk.length;i++){
            if(milk[i].equalsIgnoreCase(milks)){
                return milkCal[i];
            }
        }
        return -1.0;
    }
    
    
    public double getSugarCalories(String sugars){
        for(int i=0;i< sugar.length;i++){
            if(sugar[i].equalsIgnoreCase(sugars)){
                return sugarCal[i];
            }
        }
        return -1.0;
    }
    
     public void mixCalories(String[] ingredients) {
        this.stringArray = ingredients;
        double totalCalories = 0.0;
        for (String ingredient : ingredients) {
            double calories = -1.0;
            calories = getFruitCalories(ingredient);
            totalCalories += calories;
            
            if (calories == -1.0) {
                calories = getMilkCalories(ingredient);
                totalCalories += calories;
            }
            
            if (calories == -1.0) {
                calories = getSugarCalories(ingredient);
                totalCalories += calories;
            }
            
            if (calories != -1.0) {
                totalCalories += calories;
            }
        }
        this.totalCalories = totalCalories;
    }
     
    public static void setTotalCalories(ArrayList<String> component){
        String[] stringArray = component.toArray(new String[0]);
        Calories calories = new Calories();
        calories.mixCalories(stringArray);
    }
    public static double getTotalCalories(){
        return totalCalories;
    }
}
