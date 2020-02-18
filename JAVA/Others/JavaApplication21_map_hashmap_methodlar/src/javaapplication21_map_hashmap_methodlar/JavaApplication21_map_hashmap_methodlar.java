/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21_map_hashmap_methodlar;
import java.util.*;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication21_map_hashmap_methodlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map p = new HashMap();
        
        p.put(1, "Adana");
        p.put(25, "Erz");
        p.put(34, "İstanbul");
        p.put(27, "Gaziantep");
        p.put(6, "Ankara");
        // Map yazdıralım
        System.out.println(p); // {1=Adana, 34=İstanbul, 6=Ankara, 25=Erzurum, 27=Gaziantep}
        
        // Key karşılık gelen değer silinir. Yoksa null döndürür.
        System.out.println(p.remove(6)); // {1=Adana, 34=İstanbul, 25=Erzurum, 27=Gaziantep}
        
        // Put eğer anahtar ile eşleşen bir değer bulunuyorsa eski değer döndürülür
        // ve yenisi ile değiştirilir. Erz Erzurum ile güncellenmiştir.
        System.out.println(p.put(25,"Erzurum")); // Erz
        
        // Anahtar ile eşleşen değere ulaşma
        System.out.println(p.get(25)); // Erzurum
        
        // Anahtar ile eşleşen değere güncelleme
        System.out.println(p.replace(27,"Antep")); // {1=Adana, 34=İstanbul, 25=Erzurum, 27=Antep}
    
        // Değerden var mı?
        System.out.println(p.containsValue("İstanbul")); // True
        
        // Anahtarları Set aktarma
        Set keySet = p.keySet();
        // Set iterator alıp yazdırma.
        Iterator i = keySet.iterator();
        while (i.hasNext()) {
            System.out.print(" "+i.next());   // 1 34 25 27            
        }
        
        // Değerleri Collection yapısını aktarma ve iterator alma
        Collection l = p.values();
        i =l.iterator();
        while (i.hasNext()) {
            System.out.print(" "+i.next());   // Adana İstanbul Erzurum Antep        
        }                
    }
    
}
