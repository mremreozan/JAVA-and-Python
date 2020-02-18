/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36_hackerrank9_time;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
/**
 *
 * @author Utilisateur
 */
public class JavaApplication36_hackerrank9_time {

    static String timeConversion(String s){
            
      DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
      //Desired format: 24 hour format: Change the pattern as per the need
      DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
      Date date;
      String output = null;
      try{
         //Converting the input String to Date
    	 date= df.parse(s);
         //Changing the format of date and storing it in String
    	 output = outputformat.format(date);

      }catch(ParseException pe){
         pe.printStackTrace();
       }
               return output;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("24 saat ayarina donusturmek istediginiz saati giriniz: (saat dakika saniye arasinda iki nokta konulmalidir. OR: 08:19:45AM )");
        String s = scan.nextLine();
        String result = timeConversion(s);
        System.out.println(result);

    }
    
}
