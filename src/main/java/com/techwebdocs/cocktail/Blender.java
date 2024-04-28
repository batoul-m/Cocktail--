
package com.techwebdocs.cocktail;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Blender {
    
    ArrayList<Ingrediants> arr = new ArrayList <>();
    ArrayList<String> arr2 = new ArrayList <>();
    private String Component;
    private Cup userCup=new Cup();
    int numberOfCups=0;
    String typeOfCups= "";
//    private String milkType,fruitType,sugarType;
//    private double mixCalories = 0.0;
    Scanner scan = new Scanner(System.in); 
    public Blender() throws BlenderIsEmpty, BlenderOverFlow {
        do{
            System.out.println("1. choose cup size and how many cups you want\n"
                + "2. add ingrediant\n"
                + "3. pour\n"
                + "4. get info\n"
                + "5. Exit\n");
            int choice = scan.nextInt();
            switch(choice){
                case 1 :
                    cup();
                    break;
                case 2:
                    add();
                    break;
                    
                case 3:
                    blend();
                    break;
                    
                case 4:
                    getInfo();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            
            
        }while (true);
    }
   
    
    private void add() throws BlenderOverFlow{
        double fruiteJuice = Fruits.getFruitNumber()*40;

        if((fruiteJuice + userCup.getMilkForCups(typeOfCups) )> ((userCup.getCupQuantity(typeOfCups))*numberOfCups)){   
            throw new BlenderOverFlow();
        }
        else{
        System.out.println("1. add fruits\n"
            + "2. add milk\n"
            + "3. add sugar if you want\n"
            + "4. Exit\n");
            int choiceIngrediant = scan.nextInt();
                    switch(choiceIngrediant){
                        case 1:
                            addFruites();
                            break;
                        case 2:
                            addMilk();
                            break;
                        case 3:
                            addSugar();
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice!");    
                    }
        }
    }
    
    private void addFruites(){
        System.out.println("Enter your how nany from your choice from these and then your choice\n"+
                        "{banana,apple,blueberries,mango,pineapple,orange,cherry}");
        int num = scan.nextInt();
        Component = scan.next();
        arr.add(new Fruits(num,Component));
        for(int i = num;i>0;i--){
            arr2.add(Component);
        }
        
        
    }
    
    private void addMilk(){
        System.out.println("Enter your milk type of milk \n"
                            +"{normal milk,light calories,oat milk}");
        Component = scan.next();
        arr.add(new Milk(Component));
        arr2.add(Component);
    }
    
    private void addSugar(){
        System.out.println("Enter your sugar type then enter how many spoons you want \n"
                            +"{white,brown }");
        Component = scan.next();
        int num = scan.nextInt();
        arr.add(new Sugar(Component,num));
        for(int i=num;i>0;i--){
            arr2.add(Component);
        }
    }
    
    
    private void cup(){
        System.out.println("Enter how many cup you want then your cup size \n"+
                      "{small,medium,larg}");
                    
        numberOfCups=scan.nextInt();
        typeOfCups=scan.next();
        userCup=new Cup(numberOfCups,typeOfCups);
    }
    
    
    
    private void getInfo(){
        int i = 1;
        String result = "no ingrediants";
        result="the drink color = "+Arrays.toString(Color.getMixColor())+"  the total calories "+Calories.getTotalCalories();
        System.out.println(result);
        System.out.println("if you more details click yes");
        if(scan.next().equalsIgnoreCase("yes")){
            for(Ingrediants I : arr) {
                if(I instanceof Fruits)
                    result=(((Fruits) I).getInfo());
                else if(I instanceof Milk)
                    result=(((Milk) I).getInfo());
                else if(I instanceof Sugar)
                    result=(((Sugar) I).getInfo());
            System.out.println(i+"-  "+result);
            i++;}
        }
    }
    
    
    
    private void blend() throws BlenderIsEmpty{
        if(arr.isEmpty()){
            throw new BlenderIsEmpty();
        }
        else{
            Color.setMixColor(arr2);
            Calories.setTotalCalories(arr2);
        }
        
    }
}




