/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41_binary_search;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication41_binary_search {
    static int binarysearch(int[] arr, int aranan){ 
        // BU ARAMA ALGORITMASINI SORTED LISTELERDE KULLANIRIZ.
        // BU ARAMA ICIN SORTED LISTENIN KUCUKTEN BUYUGE SIRALANDIGI VARSAYILMISTIR.
        
        int baslangic=0;
        int son = arr.length-1;
        
        while (baslangic <= son){
            int orta = (baslangic+son)/2;
            if(arr[orta] > aranan){
                son = orta-1;
            }
            else if(arr[orta] == aranan){
                return orta; // Aranan sayi bulundu.
            }
            else{
                baslangic = orta + 1;
            }
        }
        return -1;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sorted Diziyi olusturmak istedigiiniz sayilari birer bosluk birakarak kucukten buyuge giriniz:");
        String[] arritems = scan.nextLine().split(" ");
        
        int[] arr = new int[arritems.length];
        for (int i=0; i<arritems.length; i++){
            arr[i] = Integer.parseInt(arritems[i]);
        }
        
        System.out.println("Dizi icerisinde armak istediginiz elemani yaziniz.");
        int aranan = scan.nextInt();
        
        int sonuc = binarysearch(arr, aranan);
        if(sonuc > 0){
            System.out.println("Aranan sayinin indexi " + sonuc + "'dir.");
        }
        else {
            System.out.println("Aranan sayi bulunamadi.");
        }
    }
    
}
