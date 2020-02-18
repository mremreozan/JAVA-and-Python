/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49_design_pattern_abstruct_accurence;

import java.util.ArrayList;

/**
 *
 * @author Utilisateur
 */
public class dizi {    // dizi bizim abstruction olan class imizdir.
    String isim;
    String yapimici;
    ArrayList<bolum> bolumler = new ArrayList(); // boylece occurence(bolum) class i icindeki herhangi bir method'a erisebilir.
                                                   // arraylist tutmamizin amaci bir absstruction dan birden fazla occurence erismek istedigimiz icindir. 
    public void bolumEkle(bolum b){  // bolum class ina erisebildigimiz icin bolumleri buradan ekliyoruz. one to many ilskisini gormek lazim yani bir dizi class inin many tane bolum classi tutulur.
        bolumler.add(b);
    }
}
