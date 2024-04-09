/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

/**
 *
 * @author user
 */
import java.util.ArrayList;
public class Blender {
    
    ArrayList<Ingrediants> ingrediant = new ArrayList <>();
    private String milkType,fruitType,sugarType;
    private double mixCalories = 0.0;
//    public Blender(Ingrediants ingrediants) {
//        this.ingrediant = ingrediants;
//        
//    }
//    
//   
//    public Blender(){       
//    if(ingrediant instanceof Sugar) {
//        mixCalories += ((Sugar) ingrediant).getCalories(sugarType);
//                        
//        }
//    if(ingrediant instanceof Milk) {
//        mixCalories +=  ((Milk) ingrediant).getCalories(milkType);
//                        
//        }
////    if(ingrediant instanceof Fruits) {
////        mixCalories +=  ((Fruits) ingrediant).getCalories(fruitType);
////                        
////        }
////        
//    }
//     
    public String getinfo(){
        return "mixcalories = "+mixCalories;
                
    }            
}
