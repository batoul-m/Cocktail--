/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

/**
 *
 * @author user
 */
public class Color {
 
      
    private String fruit[];
    private int[][] fruitColorNumber;
    private String[] fruitColor;
    
    private String milk;
    private int[] milkColorNumber={255, 255, 255};
    private String milkColor="white";
    
    private String[] sugar;
    private int[][] sugarColorNumber;
    private String[] sugarColor;
    
    public Color(){
        fruit=new String[]{"banana", "apple","blueberries","mango","pineapple","orange","cherry"}; 
        fruitColorNumber=new int[][]{ {255, 255, 0},{255, 0, 0},{0, 0, 255},{255, 165, 0},{255, 255, 0},{255, 165, 0},{255, 0, 0}};
        fruitColor=new String[]{"Yellow","Red","Blue","Orange","Yellow","White","Orange","Red"};
        
        sugar=new String[]{"white sugar","brown sugar"};
        sugarColorNumber=new int[][]{ {255,255,255},{210,105,30}};
        sugarColor=new String[]{"white","light brown"};       
        
    }
    
    public String getFruitColor(String fruits) {
        for(int i=0;i<fruit.length;i++){
            if(fruit[i].equalsIgnoreCase(fruits)){
                return fruitColor[i];
            }
        }
        return null;
    
    }
    
    public int[] getFruitColorNumber(String fruits) {
        for(int i=0;i<fruit.length;i++){
            if(fruit[i].equalsIgnoreCase(fruits)){
                return fruitColorNumber[i];
            }
        }
        return null;
    
    }
    
    public String getMilkColor(){
        return milkColor;
    }
    
    public int[] getMilkColorNumber(){
        return milkColorNumber;
    }
    
    public int[] getSugarColorNumber(String sugar) {
        for(int i=0;i<fruit.length;i++){
            if(fruit[i].equalsIgnoreCase(sugar)){
                return fruitColorNumber[i];
            }
        }
        return null;
    
    }
    
    public String getSugarColor(String sugar) {
        for(int i=0;i<fruit.length;i++){
            if(fruit[i].equalsIgnoreCase(sugar)){
                return fruitColor[i];
            }
        }
        return null;
    
    }
}
