/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20_stack_methodlari;
import java.util.*;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication20_stack_methodlari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] meyveler = {"Muz","Kivi","Nar","Şeftali"};
        Stack s = new Stack();
    
        for (int i = 0; i < meyveler.length; i++) {
            // Yığına eleman ekle.
            s.push(meyveler[i]);
        }
        // Yığını yazdıralım.
        System.out.println(s); // [Muz, Kivi, Nar, Şeftali]
        
        // Yığın boş mu?
        System.out.println(s.empty()); // False
        
        // Son eklenen elemanı getir.
        System.out.println(s.peek()); // Şeftali
    
        // Son eklenen elemanı getir ve sil.
        System.out.println(s.pop()); // Şeftali s:[Muz, Kivi, Nar]
        
        // Kivi'ye kaç eleman sonra ulaşılabilir.
        System.out.println(s.search("Kive")); // 2
    }
    
}
