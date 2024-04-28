/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

import java.util.ArrayList;
public class Color {
 
      
    private String fruit[];
    private int[][] fruitColorNumber;
    private String[] fruitColor;
    
    private String[] milk;
    private int[] milkColorNumber={255, 255, 255};
    private String milkColor="white";
    
    private String[] sugar;
    private int[][] sugarColorNumber;
    private String[] sugarColor;
    
    private static int[] mixColor;
    private String[] stringArray;
    public Color(){
        fruit=new String[]{"banana", "apple","blueberries","mango","pineapple","orange","cherry"}; 
        fruitColorNumber=new int[][]{ {255, 255, 0},{255, 0, 0},{0, 0, 255},{255, 165, 0},{255, 255, 0},{255, 165, 0},{255, 0, 0}};
        fruitColor=new String[]{"Yellow","Red","Blue","Orange","Yellow","White","Orange","Red"};
        
        sugar=new String[]{"white","brown"};
        sugarColorNumber=new int[][]{ {255,255,255},{210,105,30}};
        sugarColor=new String[]{"white","light brown"}; 
        
        milk=new String[]{"normal","oat milk","light"};
        
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
           
    public void mixColors(String[] colorNames) {

        this.stringArray=colorNames;
        int totalRed = 0, totalGreen = 0, totalBlue = 0;
        int numColors = 0;
        
        for (String colorName : colorNames) {
            for (int i = 0; i < fruit.length; i++) {
                if (fruit[i].equalsIgnoreCase(colorName)) {
                    totalRed += fruitColorNumber[i][0];
                    totalGreen += fruitColorNumber[i][1];
                    totalBlue += fruitColorNumber[i][2];
                    numColors++;
                    break;
                }
            }
            
            for (int i = 0; i < milk.length; i++) {
                if (milk[i].equalsIgnoreCase(colorName)) {
                    totalRed += milkColorNumber[0];
                    totalGreen += milkColorNumber[1];
                    totalBlue += milkColorNumber[2];
                    numColors++;
                    break;
                }
            }
            
            for (int i = 0; i < sugar.length; i++) {
                if (sugar[i].equalsIgnoreCase(colorName)) {
                    totalRed += sugarColorNumber[i][0];
                    totalGreen += sugarColorNumber[i][1];
                    totalBlue += sugarColorNumber[i][2];
                    numColors++;
                    break;
                }
            }
        }
        
        // Calculate the average color components
        int[] mixedColor = new int[3];
        if (numColors > 0) {
            mixedColor[0] = totalRed / numColors;
            mixedColor[1] = totalGreen / numColors;
            mixedColor[2] = totalBlue / numColors;
        }
        
        mixColor = mixedColor;
        
    } 
    
    public static void setMixColor(ArrayList<String> component){
        String[] stringArray = component.toArray(new String[component.size()]);
        Color color = new Color();
        color.mixColors(stringArray);
        
    }
    public static int[] getMixColor(){
        return mixColor;
    }
    
}
