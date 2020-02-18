package merhaba021Ccomperator;

import java.util.Collections;
import java.util.List;

public class goster {

	public static void main(String[] args) {
 
		List<dizi> hamliste = new Liste();
        
        System.out.println("Sýralanmamýþ olan liste : ");
        for (int i = 0; i < hamliste.size(); i++) {
               dizi item = hamliste.get(i);
               System.out.println(item.getYas() + " -- " + item.getIsim()+" -- "+ item.getKidem());
	    }
        
        
        Collections.sort(hamliste, new yasikarsýlastýr());  // hamliste yi al karsýlastýr sýnýfýna (bu sýnýfta yas kasþýlaþtýrmasý vardýr.) sok.
        
        System.out.println("Yaþa göre sýralý olan liste : ");
        for (int i = 0; i < hamliste.size(); i++) {
               dizi item = hamliste.get(i);
               System.out.println(item.getYas() + " -- " + item.getIsim()+" -- "+ item.getKidem());
        }
        
        Collections.sort(hamliste, new kidemkarsýlasatýrma());  // hamliste yi al kidemkarsýlasatýrma sýnýfýna sok.
        
        System.out.println("Kýdeme göre sýralý olan liste : ");
        for (int i = 0; i < hamliste.size(); i++) {
               dizi item = hamliste.get(i);
               System.out.println(item.getYas() + " -- " + item.getIsim()+" -- "+ item.getKidem());
        }
        
	}

}
