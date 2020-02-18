/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0002_java_sort;

import java.util.Comparator;

/**
 *
 * @author Utilisateur
 */
public class sequence implements Comparator<Student>{
    
    @Override
    public int compare (Student s1, Student s2){
        if(s1.getCgpa() == s2.getCgpa()){
            if (s1.getFname().equals(s2.getFname()) ){
                return s2.getId() - s1.getId();   //  firstly is written the big number
            }
            else {
                return s1.getFname().compareTo(s2.getFname());   // firstly is written smaller letter, namely alphabetic order
            }
        }
        
        else{
            //return s1.getCgpa().compareTo(s2.getCgpa());
            double delta = s2.getCgpa() - s1.getCgpa(); //firstly is written the big number
            if(delta > 0) return 1;
            if(delta < 0) return -1;    
            return 0;
        }
        
    }
}
