/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18_arraylist_methodlari;
import java.util.*;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication18_arraylist_methodlari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {2,3,4,3,5,1};
        
        List l = new ArrayList();
        
        for (int i = 0; i < array.length; i++) {
            l.add(array[i]);
        }
    
        // Listi yazdıralım.
        System.out.println(l);
        
        // 0 inside -1 ekleme [-1, 2, 3, 4, 3, 5, 1]
        l.add(0,-1);  // [-1, 2, 3, 4, 3, 5, 1]
        
        // 2 indisteki elemanı getirir.
        System.out.println(l.get(2)); // 3
        
        // 3 hangi indiste?
        System.out.println(l.indexOf(3)); // 2
        
        // 0 indiste buluna elemanı sil.
        System.out.println(l.remove(0)); // -1 silindi. [2, 3, 4, 3, 5, 1]
        
        // 0 indiste bulunan 2 -1 ile değiştir.
        System.out.println(l.set(0, -1)); // -1 silindi. [-1, 3, 4, 3, 5, 1]
        
        // Liste boş mu ?
        System.out.println(l.isEmpty()); // False
    
        // 0 ile 2 arasında bir alt-liste oluştur.
        System.out.println(l.subList(0,2)); // [-1, 3]
        
        // Retain list
        List retainList = new ArrayList();
        retainList.add(5);retainList.add(3);
        // Retain 2,3 hariç diğerlerini sil.
        l.retainAll(retainList); // Son hali [3, 3, 5]

        // ListIterator sağa ve sola gidilebilir.
        ListIterator i = l.listIterator();
        i.hasNext();
        System.out.println(i.next());
        i.hasNext();
        System.out.println(i.previous());
        
        l.clear(); // Listeyi Temizler.
    }
    
}
