package merhaba022Serialization;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Kisi implements Serializable {   // þimdi Kisi isimli kiþi bilgilerinin kaydedildiði bir sýnýf oluþturuyoruz.
	                                          // bu sýnýf tipinde bir nesne oluþturacaðýz.
											  // bu nesneyi serileþtirerek bir dosya üzerinde saklayacaðýz.
											  // serileþtirilmiþ bu nesneyi saklandýðý dosyadan okuyarak elde edeceðiz.
	
	private String ad;
	private String soyad;
	
	public Kisi (String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
}