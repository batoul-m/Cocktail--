/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

/**
 *
 * @author user
 */

public abstract class Ingrediants {
    
    public abstract double caloriescal();


    private static int count;

    public Ingrediants() {
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ingrediants.count = count;
    }
    
 
    
}
