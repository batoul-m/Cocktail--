/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techwebdocs.cocktail;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Cocktail {

    public static void main(String[] args) {
       // Blender blend = new Blender();
        //blend.blender();
       
        System.out.println("enter you count and size : ");
        Scanner scan=new Scanner(System.in);
        Cup c = new Cup(scan.nextInt(), scan.next());
        System.out.println(c.getInfo());
    }
}
