/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7_get;
import java.util.*; 
/**
 *
 * @author Utilisateur
 */
public class JavaApplication7_get {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declaring a LinkedList 
        LinkedList list = new LinkedList(); 
  
        // adding elements using add() 
        list.add("Geeks"); 
        list.add(4); 
        list.add("Geeks"); 
        list.add("8"); 
  
        // printing the whole list 
        System.out.println("The elements in List are : " + list); 
  
        // using get() to print element at index 3 
        // prints 8 
        System.out.println("Element at index 3 is : " + list.get(2)); 
        
        System.out.println("The elements in List are : " + list);        

        // using get() to print element at first index 
        // prints "Geeks" 
        System.out.println("Element at 1st index is : " + list.getFirst());
        
       // using get() to print element at last index 
        // prints "8" 
        System.out.println("Element at last index is : " + list.getLast()); 

        System.out.println("The elements in List are : " + list);    
    }
    
}
