/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication53_counting_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author Utilisateur
 */
public class JavaApplication53_counting_sort {

    static int[] countingSortstart(int sayidiz[]){
        
        int max = sayidiz[0];;
        for (int m=1; m<sayidiz.length; m++){
            if(sayidiz[m]>max){
            max = sayidiz[m];  
            }
        }   
        
        int C[] = new int[max+1];
        /*
        for (int i=0; i<C.length; i++){
            C[i]=0;
        }
        */
        for (int j=0; j<sayidiz.length; j++){
            C[sayidiz[j]]++;
        }
        return C;
    }
    static int[] countingSortstart2(int sayidiz[]){
        int max = sayidiz[0];;
        for (int m=1; m<sayidiz.length; m++){
            if(sayidiz[m]>max){
            max = sayidiz[m];  
            }
        }     
        
        int[] res=new int[max+1];
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int j=0;j<sayidiz.length;j++)
            a.add(sayidiz[j]);
        for(int w=0;w<res.length;w++)
        {
            res[w]=Collections.frequency(a,w);
        }
        return res;
    }
    
    static int [] countingSortFin(int arr[], int result[]){
        int real[] = new int[arr.length];
        int j=0;
        for(int i=0; i<result.length; i++){
            while(result[i]>0){
                real[j]=i;
                j++;
                result[i]--;
            }
        }        
        return real;        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int sayidiz[] = {2, 4, 8, 4, 3, 2, 1, 5, 6, 8, 9, 10, 8, 6, 6, 1, 2};
        int result[] = countingSortstart(sayidiz);
        for (int k=0; k<result.length; k++){
            System.out.printf("%d ", result[k]);
        }
        System.out.println();

        int result2[] = countingSortstart2(sayidiz);
        for (int k=0; k<result.length; k++){
            System.out.printf("%d ", result2[k]);
        }       
        System.out.println();

        int realResult[] = countingSortFin(sayidiz, result);
        for (int k=0; k<realResult.length; k++){
            System.out.printf("%d ", realResult[k]);
        }        
    }
    
}
