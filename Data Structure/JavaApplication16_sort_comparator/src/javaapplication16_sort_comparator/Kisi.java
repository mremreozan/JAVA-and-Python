/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16_sort_comparator;

/**
 *
 * @author Utilisateur
 */
public class Kisi implements Comparable<Kisi>{
    String isim;
    int yas;
 
    public Kisi(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }
 
    public String getIsim() {
        return isim;
    }
 
    public void setIsim(String isim) {
        this.isim = isim;
    }
 
    public int getYas() {
        return yas;
    }
 
    public void setYas(int yas) {
        this.yas = yas;
    }
    
    public String toString() 
    { 
        return ("\nHi my name is "
                + this.getIsim() 
                + ", My age is "
                + this.getYas()); 
    }    
 
       // kisi sinifindan bir liste siralanmak istediginde herhangi bir method belirtilmediyse default olarak bizim compareTo icerisine yazacagimiz method a gore siralama yapar.
    @Override
    public int compareTo(Kisi o) {
        return this.isim.compareTo(o.getIsim());
    }    
}
