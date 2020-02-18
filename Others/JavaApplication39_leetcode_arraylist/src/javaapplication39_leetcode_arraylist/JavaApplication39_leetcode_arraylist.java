/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39_leetcode_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication39_leetcode_arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("birlesik olarak buyukten kucuge yazilmasini istediginiz sayilari aralarinda birer bosluk birakarak giriniz:");
        String numsitems[] = scan.nextLine().split(" ");
        
        int [] nums = new int[numsitems.length];
        for (int i=0; i<numsitems.length; i++){
            int numsitem = Integer.parseInt(numsitems[i]);
            nums[i] = numsitem;
        }
        
        ArrayList<Integer> arr = new ArrayList();
        int key;
        
        for(int i=0; i<nums.length; i++){
            while(nums[i]>0){
                key = nums[i]%10;
                arr.add(key);
                nums[i] = nums[i]/10;              
            }
        }
        Collections.sort(arr, Collections.reverseOrder());
        
        String sonuc="";
        for(int k : arr){
            String  str = String.valueOf(k);
            sonuc=sonuc+str;          
        }
        System.out.println(sonuc);
        
        
    }
    
}
