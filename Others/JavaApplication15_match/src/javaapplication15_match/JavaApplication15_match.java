/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15_match;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication15_match {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List < Integer > aList = Arrays.asList(new Integer[] {
            1,
            3,
            5,
            6,
            8
        });
        List < Integer > bList = Arrays.asList(new Integer[] {
            10,
            89,
            8,
            9
        });
        // If any number from List is present in List 2
        System.out.println(
                "If any number from aList is present in List 2 :"+
                aList.stream().anyMatch(num -> bList.contains(num)));
        // If any number from List is present in List 2
        System.out.println(
                "If any number from aList is not present in List 2 :" + 
                aList.stream().noneMatch(num -> bList.contains(num)));
        // If any number from List is present in List 2
        System.out.println(
                "If all numbers from aList are present in List 2 :" +
                aList.stream().allMatch(num -> bList.contains(num)));

    }
    
}
