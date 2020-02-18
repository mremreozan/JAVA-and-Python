package merhaba022Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Yaz {

	public static void main(String[] args) {

		try {
			Kisi kisi = new Kisi("emre", "ozan" );                            // Kisi  sýnýfý tipinde bir nesne oluþturduk.
			FileOutputStream dosya = new FileOutputStream("C:\\metin.txt");   // dosya mýzý oluþturduk.
			ObjectOutputStream yaz = new ObjectOutputStream(dosya);           // serileþtirme için nesneyi oluþturduk.
			yaz.writeObject(kisi);                                            // nesnemizi dosyaya yazdýk, serileþtirme gerçekleþtirildi.
			yaz.close();                                                      // stream i kapattýk, aslýnda bu stream i bir finally bloðunda kapatmak daha iyi olur.
			System.out.println("Process ends .....");
		}
		catch (Exception e) {
			System.out.println("Error in Serialization process\n"+e.getMessage());
		}
	}

}
