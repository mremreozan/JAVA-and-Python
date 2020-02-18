/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47_secondhigh;

import static java.lang.Math.abs;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication47_secondHigh {

    /**
     * @param args the command line arguments
     */
    public static int secondhigh(int[] dizi){
        int high=0;
        int temp;
        int secondhigh = 0;
        for (int i=0; i<dizi.length; i++){
            if(dizi[i] > high){
                temp = high;
                high = dizi[i];
                secondhigh = temp;
            }
        }
        return secondhigh;        
    }
    
    public static void minsumpair(int [] array){
        int pair1=0;
        int pair2=0;
        int top;
        int minsumpa=array[0] + array[1];
        for(int i=0; i<array.length; i++){
            
            for(int j=i+1; j<array.length; j++){                
                top = array[i]+array[j];
                top = abs(top);
                if(top < minsumpa){
                    minsumpa = top;
                    pair1=array[i];
                    pair2=array[j];
                }
                    
            }
        }
        System.out.println(pair1+" ve "+pair2+" toplamlari "+minsumpa+" dir.");
    }
    public static void main(String[] args) {
        int dizi[] = {1,3,-5,7,8,20,-40,6};
        System.out.println(secondhigh(dizi));
        minsumpair(dizi);
    }
    
}
