
public class yeniclass extends insan {
	
	void deneme() {           // burada public yazdýðýmýzda hata veriyor, çünkü fonksiiyonun return type'ýný yazmamýþýz.
		boy=180;                   // boy inheritance ile bize geldi. gelen bu bilgiye deðer verebiliyoruz.
		System.out.println(boy);
	}
	
	public static void main(String[] args) {
		yeniclass veli =new yeniclass();
		veli.deneme();
	}

}
