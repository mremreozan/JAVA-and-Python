/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

import java.util.Comparator;

/**
 *
 * @author Utilisateur
 */
public class Checker implements Comparator<Player> {
    public int compare (Player p1, Player p2){
        if(p1.score == p2.score){
            return p1.name.compareTo(p2.name);
        }
        else{
            return p2.score-p1.score;
        }
   
    }    
}
