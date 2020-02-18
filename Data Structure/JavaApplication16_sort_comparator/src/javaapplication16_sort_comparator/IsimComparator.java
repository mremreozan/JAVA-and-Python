/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16_sort_comparator;
import java.util.Comparator;
/**
 *
 * @author Utilisateur
 */
public class IsimComparator implements Comparator<Kisi> {

    @Override
    public int compare(Kisi o1, Kisi o2) {
        return o1.getIsim().compareTo(o2.getIsim());
            }    
}
