/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i=0; i<n; i++){
              player[i] = new Player (scan.next(), scan.nextInt());
        }
        scan.close();
        
        Arrays.sort(player, checker);
        for (int i=0; i<n; i++){
            System.out.println(player[i]);
        }
    }
    
}
