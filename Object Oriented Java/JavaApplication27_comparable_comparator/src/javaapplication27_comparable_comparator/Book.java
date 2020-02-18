/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27_comparable_comparator;

/**
 *
 * @author Utilisateur
 */
public class Book {
    String name;
    String authorName;
    int releaseYear;
    public Book(String name, String authorName, int releaseYear) {
        this.name = name;
        this.authorName = authorName;
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString() {
        return "Book [ismi=" + name + ", yılı=" + releaseYear + "]";
    }    
}
