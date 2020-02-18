/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16_sort_comparator;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication16_sort_comparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kisi baba=new Kisi("Ahmet",35);
        Kisi anne=new Kisi("Ayşe",28);
        Kisi abi=new Kisi("Mustafa",6);
        Kisi kardes=new Kisi("Mehmet",2);
 
        ArrayList<Kisi> aile = new ArrayList<>();
        
        aile.add(baba);
        aile.add(anne);
        aile.add(abi);
        aile.add(kardes);
        
        
        Collections.sort(aile,new YasComparator()); // yaşa göre sıralama yapar
        System.out.println("kucukten buyuge aile siralamasi:\n"+aile);

        
        Collections.sort(aile,new IsimComparator()); // isme göre sıralama yapar
        System.out.println("isme gore alfabetik sira aile siralamasi:\n"+aile);

    }
    
}
