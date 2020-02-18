/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25_iterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication25_iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> meyveler = new HashSet<>();
        meyveler.add("Elma");
        meyveler.add("Muz");
        meyveler.add("Ayva");
        meyveler.add("Nar");
        
        // Torbadan iteratör alma
        Iterator i = meyveler.iterator();
        
        // iteratör alınmış bir torba üzerinde işlem yapılamaz.
        //meyveler.add("Portakal"); // Hata! java.util.ConcurrentModificationException
        //meyveler.remove("Muz");   // Hata! java.util.ConcurrentModificationException
        
        // java11 de iteratör üzerinden remove yapılabilir.
        //i.remove("Ayva");  
        
        // Elemanları sırayla alama
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    
        // Ancak iteratör tüm elemanların üzerinden geçildikten sonra
        // torba üzerinden ekleme çıkarma yapılabilir.
        meyveler.add("Kivi");
        meyveler.remove("Nar");
        
        System.out.println(meyveler);
        
         //for-each  ile tüm iterable torbaların üstünden geçilebilir.
        for (String string : meyveler) {
            System.out.println("foreach ile yazdiriyorum\n" +string);
        }
        
        // Iterable üzerindeki forEach ile lambda fonksiyonel kod yazılabilir.
        // Aşağıdaki lambda kod parçasında elemanların hashCode gösterilmiştir.
        meyveler.forEach(s -> {
            System.out.println(s + "'s hash code:" + s.hashCode());
        });
        
    }
    
}
