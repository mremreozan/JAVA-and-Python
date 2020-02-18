/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23_treemap;
import java.util.*;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication23_treemap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map p = new TreeMap();
        p.put(1, "Adana");
        p.put(25, "Erzurum");
        p.put(34, "İstanbul");
        p.put(27, "Gaziantep");
        p.put(6, "Ankara");
        // TreeMap anahtar değerine göre sıralama yapar.
        System.out.println(p); // {1=Adana, 6=Ankara, 25=Erzurum, 27=Gaziantep, 34=İstanbul}   
    }
    
}
