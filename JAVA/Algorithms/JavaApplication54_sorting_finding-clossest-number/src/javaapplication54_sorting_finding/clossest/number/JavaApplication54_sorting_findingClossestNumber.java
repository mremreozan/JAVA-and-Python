/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication54_sorting_finding.clossest.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.lang.Math;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication54_sorting_findingClossestNumber {
    static Object[] closestNumbers(int[] arr) {
        int diff=0;
        int min=Math.abs(arr[0] - arr[1]);
        Set<Integer> res = new TreeSet<>();
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                diff = Math.abs(arr[i] - arr[j]);
                if(diff<min){
                    min = diff;
                }
            }
        }
        
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                diff = Math.abs(arr[i] - arr[j]);
                if(diff==min){
                    res.add(arr[i]);
                    res.add(arr[j]);                                      
                }
            }
        }
        Object[] arr2 = res.toArray(); 
        return arr2;
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayidiz[] = {34, 4, 5774, 45, -65, 95, 92, 93948, 84774, 373, -62};
        Object result[] = closestNumbers(sayidiz);          
        for (int k=0; k<result.length; k++){
            System.out.printf("%d ", result[k]);
        }          
    }
    
}
