/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6_poll;
import java.util.*; 
/**
 *
 * @author Utilisateur
 */
public class JavaApplication6_Poll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaring a LinkedList 
        LinkedList list = new LinkedList(); 
  
        // adding  elements 
        list.add("Geeks"); 
        list.add(4); 
        list.add("Geeks"); 
        list.add(8); 
  
        // printing the list 
        System.out.println("The initial Linked List is : " + list); 
  
        // using poll() to retrieve and remove the head 
        // removes and displays "Geeks" 
        System.out.println("Head element of the list is : " + list.poll()); 
  
        // printing the resultant list 
        System.out.println("Linked List after removal using poll() : " + list); 

        // using pollFirst() to retrieve and remove the head 
        // removes and displays "Geeks" 
        System.out.println("Head element of the list is : " + list.pollFirst()); 

        // printing the resultant list 
        System.out.println("Linked List after removal using pollFirst() : " + list); 

        // using pollLast() to retrieve and remove the tail 
        // removes and displays 8 
        System.out.println("Tail element of the list is : " + list.pollLast());

        // printing the resultant list 
        System.out.println("Linked List after removal using pollLast() : " + list);
    }
    
}
