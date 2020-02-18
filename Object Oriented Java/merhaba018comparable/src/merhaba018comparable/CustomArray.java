package merhaba018comparable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/*
“CustomArray” sýnýf ise “ArrayItem” tipindeki nesneleri tutacak olan sýnýftýr. Bu sýnýf “ArrayList” sýnýfýndan kalýtým almýþtýr. 
Böylece “CustomArray” sýnýfýna Collection özelliði kazandýrýlmýþtýr.
*/
	@SuppressWarnings("serial")
	public class CustomArray extends ArrayList<ArrayItem> implements Serializable{
	 
	       private String[] nameList = {"Ali", "Mehmet", "Ahmet", "Veli", "Hasan", "Ayþe", "Fatma", "Zeynep", "Emine", "Gülsüm", "Jale"};
	       
	       public CustomArray() {
	             createDemoList();
	       }
	       
	       // Random olarak "ArrayItem" tipinde nesnelerden oluþan bir liste hazýrlanýr.
	       // Hazýrlanmýþ olan liste Comparable sýnýf yardýmýyla küçükten büyüðe sýralanacaktýr.
	       // "createDemoList" metodu sadece sýnýf içinde kullanýlacaðý için "private" olarak yazýlmýþtýr.
	       private void createDemoList() {
	             Random rnd = new Random();
	             for (int i = 0; i < nameList.length; i++) {
	                    String name = nameList[i];
	                    ArrayItem item = new ArrayItem();
	                    item.setName(name);
	                    item.setAge(rnd.nextInt(1000));
	                    super.add(item);
	             }
	       }
	       
	       // ArrayItem tipinde nesne eklemek için hazýrlanmýþ olan metod tanýmýdýr.
	       // "super" anahtar kelimesi ile kalýtým aldýðý "ArrayList" sýnýfýnýn "add" metodunu çalýþtýrýr.
	       public void addItem(ArrayItem item) {
	             super.add(item);
	       }
	       
	       // ArrayItem tipinde nesne almak için hazýrlanmýþ olan metod tanýmýdýr.
	       // "super" anahtar kelimesi ile kalýtým aldýðý "ArrayList" sýnýfýnýn "get(index)" metodunu çalýþtýrýr.
	       public ArrayItem getItem(int index) {
	             return super.get(index);
	       }
	       
	       // ArrayItem tipinde bir dizi oluþturmak için hazýrlanmýþtýr.
	       public ArrayItem[] getArray() {
	             return super.toArray(new ArrayItem[0]);
	       }
	}

	