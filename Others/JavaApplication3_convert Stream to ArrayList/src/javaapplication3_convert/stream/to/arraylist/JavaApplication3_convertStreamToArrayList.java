/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3_convert.stream.to.arraylist;
import java.util.*; 
import java.util.stream.*;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication3_convertStreamToArrayList {
    
    // Function to get ArrayList from Stream 
    public static <T> ArrayList<T> 
    getArrayListFromStream(Stream<T> stream) 
    { 
  
        // Convert the Stream to List 
        List<T> 
            list = stream.collect(Collectors.toList()); 
  
        // Create an ArrayList of the List 
        ArrayList<T> 
            arrayList = new ArrayList<T>(list); 
  
        // Return the ArrayList 
        return arrayList; 
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stream<Integer> 
            stream = Stream.of(1, 2, 3, 4, 5); 
  
        // Convert Stream to ArrayList in Java 
        ArrayList<Integer> 
            arrayList = getArrayListFromStream(stream); 
  
        // Print the arraylist 
        System.out.println("ArrayList: " + arrayList);         
    }
    
}
