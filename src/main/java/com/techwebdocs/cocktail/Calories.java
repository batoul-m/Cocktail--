/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

/**
 *
 * @author user
 */
public class Calories {
    private String[] fruit ;
    //= {"banana", "apple","blueberries","mango","pineapple"}; 
    private double[] fruitCal ;
           // = {69.0, 89.0,58.0,83.0,215.0};
    
    private String[] milk;
    private double[] milkCal;
    
    private String[] sugar;
    private double[] sugarCal;
    
    public Calories() {
        fruit = new String[]{"banana", "apple","blueberries","mango","pineapple","orange","cherry"}; 
        fruitCal = new double[]{69.0, 89.0,58.0,83.0,215.0,47.0,50.0}; 
        
        milk=new String[]{"normal calories","light calories","oat milk"};
        milkCal=new double[]{150.0,106.0,120};
        
        sugar=new String[]{"white sugar","brown sugar"};
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
}
