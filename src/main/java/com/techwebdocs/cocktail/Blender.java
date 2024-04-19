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
import java.util.Scanner;
public class Blender {
    
    ArrayList<Ingrediants> arr = new ArrayList <>();
    private Cup userCup=new Cup();
    int numberOfCups=0;
    String typeOfCups= "";
//    private String milkType,fruitType,sugarType;
//    private double mixCalories = 0.0;
    Scanner scan = new Scanner(System.in); 
    public Blender() {
        do{
            System.out.println("1. choose cup size and how many cups you want\n"
                + "2. add ingrediant\n"
                + "3. pour\n"
                + "4. get info\n"
                + "5. Exit\n");
            int choice = scan.nextInt();
            switch(choice){
                case 2 :
                    System.out.println("1. add fruits\n"
                        + "2. add milk\n"
                        + "3. add sugar if you want\n"
                        + "4. Exit\n");
                    int choiceIngrediant = scan.nextInt();
                    switch(choiceIngrediant){
                        case 1:
                            System.out.println("Enter your how nany from your choice from these and then your choice\n"+
                                    "{banana,apple,blueberries,mango,pineapple,orange,cherry}");
                            arr.add(new Fruits(scan.nextInt(),scan.next()));
                            break;
                        case 2:
                            System.out.println("Enter your milk type of milk \n"
                                    +"{normal milk,light calories,oat milk}");
                            arr.add(new Milk(scan.next()));
                            break;
                        case 3:
                            System.out.println("Enter your sugar type then enter how many spoons you want \n"
                            +"{white,brown }");
                            arr.add(new Sugar(scan.next(),scan.nextInt()));
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                        
                    }
                    break;
                case 1:
                    System.out.println("Enter how many cup you want then your cup size \n"+
                            "{small,medium,larg}");
                    
                    numberOfCups=scan.nextInt();
                    typeOfCups=scan.next();
                    userCup=new Cup(numberOfCups,typeOfCups);
                    break;
                    
                case 3:
                    double fruitJuice=Fruits.getCount()*40;   ///assum each fruit make 40ml of juice
                    if((fruitJuice + userCup.getMilkForCups(typeOfCups) )<= ((userCup.getCupQuantity(typeOfCups))*numberOfCups))
                        System.out.println("right size");
                        
                    else
                        System.out.println("big");
                    break;
                    
                case 4:
                    int i = 1;
                    String result = "no ingrediants";
                    for(Ingrediants I : arr) {
                        if(I instanceof Fruits)
                            result=(((Fruits) I).getInfo());
                        else if(I instanceof Milk)
                            result=(((Milk) I).getInfo());
                        else if(I instanceof Sugar)
                            result=(((Sugar) I).getInfo());
                        System.out.println(i+"-  "+result);
                        i++;}
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            
            
        }while (true);
    }
   
        
}
