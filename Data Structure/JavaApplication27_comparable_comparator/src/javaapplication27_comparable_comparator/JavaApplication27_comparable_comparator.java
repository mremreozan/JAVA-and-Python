/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27_comparable_comparator;
import java.util.Comparator;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication27_comparable_comparator implements Comparator {
    
        @Override
    public int compare(Object o1, Object o2) {
        // Gerçek tipi dönülmesi
        Book b = (Book) o1;
        Book b2 = (Book) o2;
    
        int r = 0;
        if (b.getReleaseYear() > b2.getReleaseYear()) {
            r = 1;
        } else if (b.getReleaseYear() < b2.getReleaseYear()) {
            r = -1;
        }
        return r;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Book b = new Book("Karamazov Kardeşler", "Dostoyevski" , 1866);
        Book b2 = new Book("Hacı Murat", "Tolstoy" , 1917);
        // Book nesnesin Comparable olup olmadığı kontrol edildi.
        System.out.println(b instanceof Comparable); // false
        // Comparator arayüzünü gerçekleştiren ara sınıf
        JavaApplication27_comparable_comparator bc = new JavaApplication27_comparable_comparator();
        // compare metodu ile karşılaştırma
        System.out.println(b+" vs "+b2+" :" +bc.compare(b,b2)); // -1
    }
    
}
