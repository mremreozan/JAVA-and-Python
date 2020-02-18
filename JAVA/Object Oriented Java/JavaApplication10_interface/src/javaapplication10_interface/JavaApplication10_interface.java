/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10_interface;
import java.io.*; 
  
// A simple interface 
interface in1 { 
  
    // public, static and final 
    final int a = 10; 
  
    // public and abstract 
    void display(); 
} 
/**
 *
 * @author Utilisateur
 */
class JavaApplication10_interface implements in1{

    // Implementing the capabilities of 
    // interface. 
    public void display() 
    { 
        System.out.println("Geek"); 
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaApplication10_interface t = new JavaApplication10_interface(); 
        t.display(); 
        System.out.println(a); 

    }
    
}
