/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19_linkedlist_methodlari;
import java.util.*;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication19_linkedlist_methodlari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {2,3,4,3,5,1};
        
        LinkedList l = new LinkedList();
        for (int i = 0; i < array.length; i++) {
            l.add(array[i]);
        }
        
        // Listi yazdıralım.
        System.out.println(l);
        
        // Listenin başına ekleme
        l.addFirst(-1); // [-1, 2, 3, 4, 3, 5, 1]
        // Listenin sonuna ekleme
        l.addLast(-1); //[-1, 2, 3, 4, 3, 5, 1, -1]
        
        // Listenin başındaki elemanı getir ve sil
        System.out.println(l.remove()); // -1  l: [2, 3, 4, 3, 5, 1, -1]
        
        // Listenin başına eleman ekleme
        System.out.println(l.offerFirst(1)); // true l:[1, 2, 3, 4, 3, 5, 1, -1]
        
        // Listenin başındaki elemanı getir ama silme
        System.out.println(l.peek()); // 1     
    }
    
}
