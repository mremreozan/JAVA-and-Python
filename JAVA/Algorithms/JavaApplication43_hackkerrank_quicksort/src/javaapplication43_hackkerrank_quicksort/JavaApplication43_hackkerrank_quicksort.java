/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43_hackkerrank_quicksort;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication43_hackkerrank_quicksort {

    static void quicksorthoarepartition (int[] arr, int low, int high){

        int pivot = arr[low];
        int i = low;
        int j = high;
        boolean dongu = true;
        while (dongu == true) {
            while (arr[i] < pivot) {
                i++;
            }
            
            while (arr[j] > pivot) {
                j--;
            }

            if (i >= j) {
                dongu = false;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }  
    }
    
    static void quicksortlomutopartition (int[] arr, int low, int high){
        int pivot = arr[low];   // Generally in lomuto, the pivot index must equal the last of array. But we accept the pivot index is  first element of the array for this example.
        int i=low;

        for (int j = low+1; j <= high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
    
    static void quicksorthackerrank (int[] arrrank){
        int temp=0;
        int pivot=arrrank[0];
        int pIndex=arrrank.length-1;
        for(int i=arrrank.length-1;i>=1;i--){
            if(arrrank[i]>=pivot){
                temp=arrrank[i];
                arrrank[i]=arrrank[pIndex];
                arrrank[pIndex]=temp;
                pIndex-=1;
            }
        }
        temp=arrrank[pIndex];
        arrrank[pIndex]=arrrank[0];
        arrrank[0]=temp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String arritems[] = scan.nextLine().split(" ");
        
        int arrhoare[] = new int[arritems.length];
        for(int i=0; i<arritems.length; i++){
            arrhoare[i] = Integer.parseInt(arritems[i]);
        }
        
        int arrlomuto[] = new int[arritems.length];
        for(int i=0; i<arritems.length; i++){
            arrlomuto[i] = Integer.parseInt(arritems[i]);
        }
        
        int arrrank[] = new int[arritems.length];
        for(int i=0; i<arritems.length; i++){
            arrrank[i] = Integer.parseInt(arritems[i]);
        }
        
        quicksorthoarepartition(arrhoare, 0, arrhoare.length-1);
        for (int i=0; i<arrhoare.length; i++){
            System.out.printf("%d ", arrhoare[i]);
        }
        System.out.println("\n***********************************");
        quicksortlomutopartition(arrlomuto, 0, arrlomuto.length-1);
        for (int i=0; i<arrlomuto.length; i++){
            System.out.printf("%d ", arrlomuto[i]);
        }
        System.out.println("\n***********************************");
        quicksorthackerrank(arrrank);
        for (int i=0; i<arrrank.length; i++){
            System.out.printf("%d ", arrrank[i]);
        }
        
        
    }
    
}
