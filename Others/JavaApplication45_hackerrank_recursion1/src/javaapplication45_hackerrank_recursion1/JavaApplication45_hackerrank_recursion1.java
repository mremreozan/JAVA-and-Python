/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45_hackerrank_recursion1;


import java.util.Scanner;


/**
 *
 * @author Utilisateur
 */
public class JavaApplication45_hackerrank_recursion1 {

    static int powersum_recursive (int X, int N, int num){

        int var = (int) Math.pow(num,N);
        if(var > X)
            return 0; 
        else if(var == X)
            return 1;
        else
        return powersum_recursive(X,N,num+1)+powersum_recursive(X-var,N,num+1);
    }
    
    static int topla_recursive(int N){
        
        if(N==1)
            return 1;  // yani x=1 ise attaki return e en son 1 i gonder sonra fonksiyonu bitir.
        
        return N + topla_recursive (N-1);
    }
    
    static int topla_dongu(int N){
        
        int top=0;
        for(int i=1; i<=N; i++){
            top = top + i;
        }
        return top;
    }
    
    static int fibonaci_recursive(int N){
        if(N<0) throw new IllegalArgumentException ("Can`t accept negative arguments");   
        return (N<2) ? N : fibonaci_recursive(N-1) + fibonaci_recursive(N-2);
    }
    
    static int fibonaci_dongu(int N){
    
        int a=1;
        int b=0;
        int temp=0;
        if (N<2){
            a=N;
        }
        else{
            for(int i=1; i<N; i++){    
            temp = a;
            a = a + b;
            b = temp;
            }
        }
        return a;
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner scan = new Scanner(System.in);
        System.out.println("uslu ifadeyi ayirmak istediginiz sayiyi giriniz: ");
        int X = scan.nextInt();
        System.out.println("uslu sayi degerini giriniz: ");
        int N = scan.nextInt();
        
        int result1 = powersum_recursive(X, N, 1);
        System.out.println("powersum sonucu: "+result1);
        
        System.out.println("toplama  recursive sonuc: " +topla_recursive(N));
        System.out.println("toplama dongu sonuc: " +topla_dongu(N));
        
        System.out.println("Bastan baslayarak " + N + " tane fibonaci sayisi yaziyorum.");
        for(int i=0; i<N; i++){
            System.out.printf(fibonaci_recursive(i) + " ");
        }
        System.out.println();
        for(int i=0; i<N; i++){
            System.out.printf(fibonaci_dongu(i) + " ");
        }
        int a = (int) Math.pow (2, 3);
        System.out.println(Math.pow (2, 3));
        
    }
    
}
