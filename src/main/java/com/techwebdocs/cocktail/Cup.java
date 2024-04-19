/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

/**
 *
 * @author user
 */
public class Cup {
    private int count;
    private String size ;
    private String allSize[]= {"small","medium","larg"};
    private int cupQuantity[]={200,400,600};
    private int milkForCup[]={80,160,240};
    public Cup(){
        
    }
    public Cup(int count, String size) {
        setCount(count);

        boolean sizeFound = false;
        for (String s : allSize) {
            if (s.equals(size)) {
                this.size = s ;
                sizeFound = true;
            }
        }
        if(!sizeFound){
            this.size = "not avaliable ";
        }
       
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count > 0 ? count : 0 ;
    }

    public String getSize() {
        return size;
    }

    public int getCupQuantity(String cup) {
        for(int i=0;i<allSize.length;i++){
            if(allSize[i].equalsIgnoreCase(cup)){
                return cupQuantity[i];
            }
        }
        return -1 ;
    
    }
    
    public int getMilkForCups(String cup){
        for(int i=0;i<allSize.length;i++){
            if(allSize[i].equalsIgnoreCase(cup)){
                return milkForCup[i];
            }
        }
        return -1 ;
    }
    
    public String getInfo() {
        return "Cup{" + "count = " + count + ", size = " + size + '}';
    }
    
    
}
