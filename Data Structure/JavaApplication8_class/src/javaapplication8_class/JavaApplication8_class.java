/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8_class;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication8_class {
    // Instance Variables 
    String name; 
    String breed; 
    int age; 
    String color; 
  
    // Constructor Declaration of Class 
    public JavaApplication8_class(String name, String breed, 
               int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
  
    // method 1 
    public String getName() 
    { 
        return name; 
    } 
  
    // method 2 
    public String getBreed() 
    { 
        return breed; 
    } 
  
    // method 3 
    public int getAge() 
    { 
        return age; 
    } 
  
    // method 4 
    public String getColor() 
    { 
        return color; 
    } 
  
    @Override
    public String toString() 
    { 
        return ("Hi my name is "
                + this.getName() 
                + ".\nMy breed, age and color are "
                + this.getBreed() + ", "
                + this.getAge() + ", "
                + this.getColor()); 
    } 

    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication8_class tuffy = new JavaApplication8_class("tuffy", "papillon", 
                            5, "white"); 
        System.out.println(tuffy.toString());
    }
    
}
