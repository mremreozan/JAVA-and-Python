/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22.hashmap_entryset;
import java.util.*;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication22Hashmap_entryset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> p = new HashMap<>();
        
        p.put(1, "Adana");
        p.put(25, "Erzurum");
        p.put(34, "İstanbul");
        p.put(27, "Gaziantep");
        p.put(6, "Ankara");
        
        Set s = p.entrySet();
        Iterator i = s.iterator();
        
        while (i.hasNext()) {
            // iterator sıradaki çift Entry değeri alınır.
            Map.Entry<Integer, String> mp = (Map.Entry) i.next();
            // Anahtar değerine ulaşma
            int plaka =  (int) mp.getKey();
            // Anahtar ile eşleşen değere ulaşma
            String şehir = (String) mp.getValue();
            System.out.println(plaka + "-" + şehir);
        }
    }
    
}
