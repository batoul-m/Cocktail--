/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techwebdocs.cocktail;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author user
 */
public class FileLogger implements Logger{
    private String filePath;
    
    public FileLogger(String filePath){
        this.filePath = filePath;
    }

    @Override
    public void log(String msg) {
        try (FileWriter writer = new FileWriter(filePath, true) ){
            writer.write(msg + "\n");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
