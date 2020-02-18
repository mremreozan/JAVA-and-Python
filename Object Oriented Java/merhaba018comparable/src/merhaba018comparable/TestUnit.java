package merhaba018comparable;

import java.util.Collections;
import java.util.List;

//Aþaðýdaki gibi “main” metodu içeren bir “TestUnit” sýnýfý oluþturulur.Listenin sýralanmadan önceki ve sonraki dizilimi gösterilir.

public class TestUnit {

	public static void main(String[] args) {
        
        // Sýralama yapýlmamýþ olan liste aþaðýdaki gibidir.
        List<ArrayItem> list = new CustomArray();
        
        System.out.println("Sýralanmamýþ olan liste : ");
        for (int i = 0; i < list.size(); i++) {
               ArrayItem item = list.get(i);
               System.out.println(item.getAge() + " -- " + item.getName());


        }
        
        // Liste ve Comparator sýnýfýndan bir nesne örneði sort algoritmasýna parametre olarak gönderilir.
        // Comparator, "ArrayItem" tipindeki nesneleri sýralayacak olan sýnýftýr.
        // Küçükten büyüðe doðru sýralama yapýlýr.
        Collections.sort(list, new ArrayItemComparator());
        
        System.out.println();
        System.out.println();
        
        System.out.println("Sýralanmýþ olan liste : ");
        for (int i = 0; i < list.size(); i++) {
               ArrayItem item = list.get(i);
               System.out.println(item.getAge() + " -- " + item.getName());
        }
	}

}
