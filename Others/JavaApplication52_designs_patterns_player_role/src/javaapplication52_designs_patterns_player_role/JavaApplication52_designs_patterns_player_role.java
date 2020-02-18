/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52_designs_patterns_player_role;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication52_designs_patterns_player_role {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ogrenci ali = new ogrenci();
        ali.devamRolu = new fulltime();
        ali.egtdurum = new lisans();
        
        ogrenci veysel = new ogrenci();
        veysel.devamRolu = new parttime();
        veysel.egtdurum = new lisansustu();
        
        ali.devamRolu.devamsizlik = 150;
        System.out.println("Ali devamsizlik tan  kaldi mi?" + ali.devamRolu.devamsiz());
        
        veysel.devamRolu.devamsizlik = 150;
        System.out.println("Veysel devamsizlik tan  kaldi mi?" + veysel.devamRolu.devamsiz());

        ali.notOrtalamasi = 2.5;
        System.out.println("Ali mezun olabilir mi?" + ali.egtdurum.mezuniyet(ali.notOrtalamasi));

        veysel.notOrtalamasi = 2.7;
        System.out.println("Ali mezun olabilir mi?" + veysel.egtdurum.mezuniyet(veysel.notOrtalamasi));
        
    }
    
}
