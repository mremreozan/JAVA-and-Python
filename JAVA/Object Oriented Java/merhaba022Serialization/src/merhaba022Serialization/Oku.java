package merhaba022Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Oku {

	public static void main(String[] args) {
		try {
			Kisi kisi;
			FileInputStream dosya = new FileInputStream("C:\\metin.txt");
			ObjectInputStream oku = new ObjectInputStream(dosya);
			kisi = (Kisi)oku.readObject();
				System.out.println(kisi.toString());
			oku.close();
			System.out.println("Process2 ends .....");
		}
		catch (Exception e) {
			System.out.println("Error in Serialization process2\n"+e.getMessage());
		}
	}

}
