/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29_equals_hashcode;

import java.util.Objects;

/**
 *
 * @author Utilisateur
 */
public class Kisi {
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
    
    public boolean equals(Object nesne) {       // equals methodunu Kisi class i icersine tanimladik.
        if (this == nesne) return true;
        if (nesne == null || getClass() != nesne.getClass()) return false;
        
        Kisi person = (Kisi) nesne;
        return  Objects.equals(isim, person.isim) &&
                Objects.equals(yas, person.yas); 
    }
    
    public int hashCode() {  // hashcode u Kisi classi icerisine tanimladik.
    return isim.hashCode();  // eger hashmap e eklenmek istenen isim degeri unique degilse onu hashmap esitlemez.
}
}
