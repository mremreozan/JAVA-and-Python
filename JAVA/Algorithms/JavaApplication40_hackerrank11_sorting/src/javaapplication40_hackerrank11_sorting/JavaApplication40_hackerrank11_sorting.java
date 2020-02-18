/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication40_hackerrank11_sorting;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication40_hackerrank11_sorting {

    static String[] bigcollectionsort(String[] arritems){
        
        ArrayList<BigInteger> arl = new ArrayList();
        
        for(int i=0; i<arritems.length; i++){
            arl.add(new BigInteger (arritems[i]));
        }
        
        Collections.sort(arl);

        String str[] = new String[arl.size()];
        Object[] objArr = arl.toArray();
        
        int i=0;
        for (Object obj : objArr) { 
            str[i++] = String.valueOf((BigInteger)obj); 
        } 
        return str;
    }
    
    static String[] bigarraysort(String[] arritems){
        
        BigInteger[] arr = new BigInteger[arritems.length];
        for(int i=0; i<arritems.length; i++){
            arr[i] = new BigInteger(arritems[i]);
        }
        
        for(int i=1; i<arr.length; i++){
            BigInteger key = arr[i].abs();
            int j=i-1;
            while((j>-1) && ((arr[j].compareTo(key)) > 0)){
                arr[j+1]=arr[j];
                j--;                
            }
            arr[j+1]=key.abs();
        }

        String[] str = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            str[i]=arr[i].toString();
        }
        return str;
    }
    static String[] normarraysort(String[] arritems){
        
        int[] arr = new int[arritems.length];
        for(int i=0; i<arritems.length; i++){
            arr[i] = Integer.parseInt(arritems[i]);
        }

        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j=i-1;
            while((j>-1) && (arr[j]>key)){
                arr[j+1]=arr[j];
                j--;                
            }
            arr[j+1]=key;
        }

        String[] str = new String[arr.length];
        for(int i=0; i<arr.length; i++){
            str[i] = String.valueOf(arr[i]);
        }
        return str;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("siralanacak sayilari aralarinda birer bosluk birakarak giriniz:");
        String arritems[] = scan.nextLine().split(" ");
        
        String[] sort1= bigcollectionsort(arritems);
        for(String str : sort1)
            System.out.println(str);
        
        String sort2[] = bigarraysort(arritems);
        for (String str : sort2)
            System.out.println(str);
        
        String sort3[] = normarraysort(arritems);
        for (String str : sort3)
            System.out.println(str);
        
        
            
        
        
    }
    
}
