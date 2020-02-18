/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49_design_pattern_abstruct_accurence;
// Dizi classindan bir dizi yayinlandigi zaman dizi class indan bolumlerine ersilsin istiyoruz.

/**
 *
 * @author Utilisateur
 */
public class JavaApplication49_design_pattern_abstruct_accurence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dizi guldurguldur = new dizi();
        guldurguldur.isim = "Guldur Guldur";
        guldurguldur.bolumEkle(new bolum("esofmanli sevket hoca tatilde ", 1));
        guldurguldur.bolumEkle(new bolum("esofmanli sevket hoca iste ", 2));
    }
    
}
