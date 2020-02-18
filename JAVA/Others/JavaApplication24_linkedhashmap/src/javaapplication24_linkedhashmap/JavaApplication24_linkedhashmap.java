/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24_linkedhashmap;
import java.util.*;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication24_linkedhashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // HashMap
        Map<Integer, String> p = new HashMap<>();
        p.put(1, "Adana");
        p.put(25, "Erzurum");
        p.put(34, "İstanbul");
        p.put(27, "Gaziantep");
        p.put(6, "Ankara");
        // LinkedHashMap
        Map<Integer, String> l = new LinkedHashMap<>();
        l.put(1, "Adana");
        l.put(25, "Erzurum");
        l.put(34, "İstanbul");
        l.put(27, "Gaziantep");
        l.put(6, "Ankara");
        
        // HashMap eklendiği sırayı korumaz.
        System.out.println(p); // {1=Adana, 34=İstanbul, 6=Ankara, 25=Erzurum, 27=Gaziantep}
        // LinkedHashMap eklendiği sırayı korur.
        System.out.println(l); // {1=Adana, 25=Erzurum, 34=İstanbul, 27=Gaziantep, 6=Ankara}
    }
    
}
