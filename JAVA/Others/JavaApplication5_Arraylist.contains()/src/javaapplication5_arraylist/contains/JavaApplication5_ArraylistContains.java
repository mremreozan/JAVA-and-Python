/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5_arraylist.contains;
import java.util.ArrayList; 
/**
 *
 * @author Utilisateur
 */
public class JavaApplication5_ArraylistContains {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating an Empty Integer ArrayList 
        ArrayList<Integer> arr = new ArrayList<Integer>(4); 
  
        // using add() to initialize values 
        // [1, 2, 3, 4] 
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(4); 
  
        // use contains() to check if the element 
        // 2 exits or not 
        boolean ans = arr.contains(2); 
  
        if (ans) 
            System.out.println("The list contains 2"); 
        else
            System.out.println("The list does not contains 2"); 
  
        // use contains() to check if the element 
        // 5 exits or not 
        ans = arr.contains(5); 
  
        if (ans) 
            System.out.println("The list contains 5"); 
        else
            System.out.println("The list does not contains 5"); 
    }
    
}
