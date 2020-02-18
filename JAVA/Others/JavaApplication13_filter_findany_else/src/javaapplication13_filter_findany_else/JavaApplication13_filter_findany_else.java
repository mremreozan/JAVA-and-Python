/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13_filter_findany_else;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication13_filter_findany_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
 
        Person result1 = persons.stream()
                .filter((p) -> "jack".equals(p.getName()) && 20 == p.getAge())
                .findAny()
                .orElse(null);
 
        System.out.println("result 1 :" + result1);
 
        //or like this
        Person result2 = persons.stream()
                .filter(p -> {
                    if ("jack".equals(p.getName()) && 20 == p.getAge()) {
                        return true;
                    }
                    return false;
                }).findAny()
                .orElse(null);
 
        System.out.println("result 2 :" + result2);
    }
    
}
