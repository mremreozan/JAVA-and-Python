/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49_design_pattern_abstruct_accurence;

/**
 *
 * @author Utilisateur
 */
public class bolum { // bolum bizim occurence olan class imizdir.
    String bolumIsim;
    int bolumNumarasi;
    
    public bolum (String bolumIsim, int bolumNumarasi){ // biz dizi classi icerisnde bolum u kullanmak istedik ve oradaki bir fonsiyon ile bir bolum yapisinda nesne yaratacakssak burada constructor yazmamiz gerekir.
        this.bolumIsim = bolumIsim;
        this.bolumNumarasi = bolumNumarasi;
    } 
}
