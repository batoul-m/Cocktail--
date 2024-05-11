
package com.techwebdocs.cocktail;


import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

public class Blender implements Logger{
    
    private static ArrayList<Ingrediants> arr = new ArrayList <>();
    private static ArrayList<String> arr2 = new ArrayList <>();
    private Cup userCup = new Cup();
    int numberOfCups = 0;
    String typeOfCups = "";
    private String result = "";
    private int fnumbers = 0;
    public Blender(){} 
    
    public void addFruites(int num , String fruit){
        fnumbers += num ;
        arr.add(new Fruits(num,fruit));
        for(int i=num;i>0;i--){
            arr2.add(fruit);
        }   
    }
    public void addMilk(String milk){
        arr.add(new Milk(milk));
        arr2.add(milk);
    }
    
    public void addSugar(int num , String sugar){
        arr.add(new Sugar(sugar,num));
        for(int i=num;i>0;i--){
            arr2.add(sugar);
        }
    }
    
    
    public void cup(int numberOfCups , String typeOfCups){
        userCup=new Cup(numberOfCups,typeOfCups);
    }
    
    
    
    public String getInfo(){
        String result1="the drink color = "+Arrays.toString(Color.getMixColor())+"\n  the total calories "+Calories.getTotalCalories();
        return result1;
    }
    public int getMixRed(){
        int red = (Color.getMixColor())[0];
        return red;
    }
    public int getMixBlue(){
        int blue = (Color.getMixColor())[2];
        return blue;
    }
    public int getMixGreen(){
        int green = (Color.getMixColor())[1];
        return green;
    }
    
    public String getDetailedInfo(){
        int i = 1;
        String detail = "";
        for(Ingrediants I : arr) {
            if(I instanceof Fruits)
                result=(((Fruits) I).getInfo());
            else if(I instanceof Milk)
                result=(((Milk) I).getInfo());
            else if(I instanceof Sugar)
                result=(((Sugar) I).getInfo());
            detail = detail + "\n"+ result ;
            i++;
        }
        return detail;
    }
  
    public void blend() throws BlenderIsEmpty{
        if(arr.isEmpty()){
            throw new BlenderIsEmpty();
        }
        else{
            Color.setMixColor(arr2);
            Calories.setTotalCalories(arr2);
        
        
    }
    }
    
    public void pour() throws BlenderOverFlow{
        double fruiteJuice = fnumbers*40;

        if((fruiteJuice + userCup.getMilkForCups(typeOfCups) )> ((userCup.getCupQuantity(typeOfCups))*numberOfCups)){   
            throw new BlenderOverFlow();
        }
    }
    
    public void clear(){
        arr.clear();
        arr2.clear();
    }
}




