/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0001_java_comparator;

/**
 *
 * @author Utilisateur
 */
public class Player {
    String name;
    int score;
    
    public Player(String name, int score){
        this.name = name;
        this.score=score;
    }  
    
    public String toString(){
        return this.name +" " + this.score;
    }
}