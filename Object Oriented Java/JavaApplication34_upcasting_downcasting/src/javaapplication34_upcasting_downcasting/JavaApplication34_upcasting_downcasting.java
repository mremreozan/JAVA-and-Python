/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34_upcasting_downcasting;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication34_upcasting_downcasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FoodCourt serve = new FoodCourt();
	// Upcasting
	Isci p = new Cirak("Ali", 21, 30);
	Isci p2 = new Kalfa("Veli", 45, 0);
	Isci p3 = new Usta("Zelda", 32, -1); // usta eksi olmasina ragmen usta sinifinda onun sinirsiz yemek yiyebilecegini tanimlamistik.
		
	// Çok şekelilik: az kod çok iş
	serve.luchTime(p); // Çırak 
	serve.luchTime(p2); // Kalfa
	serve.luchTime(p3); // Usta sınırsız yemek hakkına sahip. normalde isci sinifinda bir iscinin lunchtimes sayisina bakarak onun  yemek hakkina sahip olup olmadigini mealtracker() fonksiyonu ile tanimlamistik, fakat ebeveyn olan ustada mealtracker() fonksiyonunu farkli sekilde tanimladik. Boylece ustanin lunchtims degeri eksi bir sayi olmasina ragmen yemek hakki oldu.
        
        p3.mealTracker();   // usta olan p3 isci sinifi icerisinde tanimlanmis olan fonskiyona erisebilmektedir.
        //p3.calculatefrom(); //!!!!! usta olan p3 iscinin ebeveyn sinifi olan usta icersinde tanimlanmis fonsiyona erisememektedir. Bunun icin asagida yazacagimiz downcasting olayini gerceklestirmemiz gerekir.
        Usta realtype = (Usta) p3;
        if (p3 instanceof Usta) {
            realtype = (Usta) p3;
	}
        realtype.calculateFrom();   // Artık gerçek tipe dönüldüğünden Usta sınıfın özel metotlarına ulaşılabilir.
    }
    
}
