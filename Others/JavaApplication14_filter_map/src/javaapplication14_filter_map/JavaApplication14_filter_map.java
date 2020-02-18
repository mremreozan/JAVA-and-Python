/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14_filter_map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication14_filter_map {

    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
 
        String name = persons.stream()
                .filter(x -> "jack".equals(x.getName()))
                .map(Person::getName)                        //Stream nesnesini String e çeviriyor
                .findAny()
                .orElse("");
 
        System.out.println("name : " + name);
 
        List<String> collect = persons.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
 
        collect.forEach(System.out::println);
    }
    
}
