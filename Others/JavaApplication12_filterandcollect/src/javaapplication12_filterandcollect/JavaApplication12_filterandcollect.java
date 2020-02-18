/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12_filterandcollect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication12_filterandcollect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> lines = Arrays.asList("elma", "armut", "çilek");
 
        List<String> result = lines.stream()                // listeyi bir stream 'e çevirelim
                .filter(line -> !"armut".equals(line))     // armut ifadesini istemiyoruz
                .collect(Collectors.toList());              // tekrardan stream'i bir listeye çevirelim
 
        result.forEach(System.out::println);                //çıktı: elma, çilek
    }
    
}
