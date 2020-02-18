/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29_equals_hashcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication29_equals_hashcode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Kisi p1 = new Kisi("Yusuf", 12);   // kisi sinifindan bir nesne ornegi olustuduk
        Kisi p2 = new Kisi("Yusuf", 12);
        Kisi p3 = new Kisi("Dilek", 17);
        
        System.out.println(p1 == p2);      // false - p1 p2 ile ayni olmasina ragmen false veriyor cunku nesneler stack da farkli adreslere sahiptirler, siniflarin esitligini kontrol etmek icin equals() methodunu kullanmamiz gerekir.
        System.out.println(p1.equals(p2)); // True - cunku equals methodu Kisi class i icerisinde tanimlidir.
        
        // simdi hashmap de belirledigimiz bir attitude den aynisini 2.kez hashmap e girmesini istemiyorsak onu class icerisine tanimlamaliyiz.   
       
        Map<Kisi, String> liste = new HashMap<>();
            liste.put(p1, "1.kayit");
            liste.put(p2, "2.kayit");
            liste.put(p3, "3.kayit");
        System.out.println(liste.size());  // cevap 2 verir. 3 kayit ekledik fakat class icersine hashcpde tanimlarken ayni isimde gorursen onu 2.kez hashcode a alma diye ayarladik.
           

    }
    
}
