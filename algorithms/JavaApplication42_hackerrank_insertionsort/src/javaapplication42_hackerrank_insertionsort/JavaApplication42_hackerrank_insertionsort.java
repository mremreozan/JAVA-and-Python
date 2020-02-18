/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42_hackerrank_insertionsort;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication42_hackerrank_insertionsort {
    
    static int[] insertionsort(int[] arr1){
        
        for(int j=1; j<arr1.length; j++){
            int key = arr1[j];
            int i = j-1; 
            while (i>-1 && arr1[i] > key){
                arr1[i+1] = arr1[i];
                for (int m=0; m<arr1.length; m++){
                    System.out.printf("%d", arr1[m]);
                }
                System.out.println();
                i--;
            }
            arr1[i+1]=key;
        }
        for (int m=0; m<arr1.length; m++){
            System.out.printf("%d", arr1[m]);
        }
        return arr1;
    }
        static int[] insertionsort2(int[] arr){
        
        int[] m = new int [arr.length-1];        
        for(int j=1; j<arr.length; j++){
            int key = arr[j];
            int i = j-1; 
            int n = 0;            
            
            while (i>-1 && arr[i] > key){
                arr[i+1] = arr[i];
                i--;
                n++;
            }
            m[j-1] = n;
          
            arr[i+1]=key;
            
//            for (int m=0; m<arr.length; m++){
//                System.out.printf("%d ", arr[m]);
//            }
//            System.out.println();   
        }
        int top=0;
        for(int i=0; i<m.length; i++){
            top = top + m[i];
            System.out.println(top);
        }
        
        return arr;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String arritems[] = scan.nextLine().split(" ");
        
        int[] arr1 = new int[arritems.length];
        for (int i=0; i<arritems.length; i++){
            arr1[i] = Integer.parseInt(arritems[i]);
        }

        int[] arr2 = new int[arritems.length];
        for (int i=0; i<arritems.length; i++){
            arr2[i] = Integer.parseInt(arritems[i]);
        }        
        
        insertionsort(arr1);
        System.out.println("\n****************************************");
        insertionsort2(arr2);

        
        
    }
    
}
