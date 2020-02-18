/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication38_hackerrank10_factorial;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication38_hackerrank10_factorial {
    static void extraLongFactorials (int n){
        
        BigInteger sonuc = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
           sonuc = sonuc.multiply(new BigInteger(i + ""));
        }
        System.out.println(sonuc);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("faktoryel alinmasini istediginiz sayiyi giriniz:");
        int n = scan.nextInt();
       
        extraLongFactorials(n);
        
    }
    
}
