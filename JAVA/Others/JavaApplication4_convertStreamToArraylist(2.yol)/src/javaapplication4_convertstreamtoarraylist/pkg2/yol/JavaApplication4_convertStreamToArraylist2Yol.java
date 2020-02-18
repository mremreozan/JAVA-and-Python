/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4_convertstreamtoarraylist.pkg2.yol;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication4_convertStreamToArraylist2Yol {
    // Function to get ArrayList from Stream 
    public static <T> ArrayList<T> 
    getArrayListFromStream(Stream<T> stream) 
    { 
         // Convert the Stream to ArrayList 
        ArrayList<T> 
            arrayList = stream 
                            .collect(Collectors 
                            .toCollection(ArrayList::new)); 
  
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
