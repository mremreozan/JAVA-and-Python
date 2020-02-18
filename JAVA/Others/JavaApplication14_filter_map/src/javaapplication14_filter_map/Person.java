/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14_filter_map;

/**
 *
 * @author Utilisateur
 */
public class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String newName) 
    { 
      name = newName; 
    } 
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge( int newAge) 
    { 
      age = newAge; 
    } 
 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() 
    { 
        return ("Hi my name is "
                + this.getName() 
                + ".\nMy age is "
                + this.getAge()); 
    }      
}
