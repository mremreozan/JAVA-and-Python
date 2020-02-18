package merhaba040mergesort;

public class mergesort {
	 public int [] mergesort(int [] m)
	   {

	     int x=0;
	     int y=0;
	     int middle=m.length/2;
	     int left[] =new int [middle];
	     int right[] =new int [middle];
	     int result[] =new int[(m.length)];

	     if(m.length<= 1){
	       return m;
	     }

	     for(int i=0; i<middle; i++)
	     {
	       left[x]=m[i];
	       x++;
	     }
	     for(int i=middle; i<m.length; i++)
	     {
	       right[y]=m[i];
	       y++;
	     }
	     left=mergesort(left);
	     right=mergesort(right);
	     result=merge(left,right);
	     return result;
	   }
	 
/* Yukarýdaki bu fonksiyon dikkat edilirse özyinelemeli (recursive) bir kod olup paramatre olarak aldýðý dizinin yanýnda bu dizi boyutunun 
 * yarýsý uzunluðunda iki ilave dizi kullanmýþ ve bu dizilere iki parçayý ayrý ayrý koyarak yine sýralamasý için kendi fonksiyonuna 
 * parametre olarak geçirmiþtir. Sonda ise bu iki parçayý birleþtiren bir merge() fonksiyonu çaðýrmýþtýr. 
 * Ýþte bu birleþtirme fonksiyonunun kodu aþaðýda verilmiþtir:*/
	 
/*Yukarýdaki kodun bir problemi, sýralama iþlemi sýrasýnda 2 ve üzeri sayýdaki elemanlý dizileri kabul ediyor olmasýdýr. 
 * Örneðin 2,4,8,16 gibi eleman sayýlarýndaki diziyi kabul eder. Bunun sebebi, sýralama fonksiyonuna gelen dizinin her durumda iki 
 * eþit parçaya bölünmesidir. Oysaki tek eleman sayýsýna sahip dizilerde, bölünme sonucunda sorun çýkar. Örneðin 3 elemanlý bir diziyi 
 * iki parçaya böldüðümüzde biri 2 diðeri 1 elemanlý iki dizi elde etmemiz gerekir.*/
	 
	 public int [] merge(int []left,int []right)
	 {
	   int result[] =new int [left.length + right.length];

	     int x=0;
	     int y=0;
	     int k=0;

	   while(left.length>x && right.length>y)

	   {

	     if(left[x] <= right[y])

	     {

	       result[k]=left[x];
	       x++;
	       k++;

	     }

	     else

	      {
	        result[k]=right[y];
	        y++;
	        k++;

	      }
	   }

	   if(left.length>x)

	   {
	     while(x < left.length)

	     {

	     result[k]=left[x];
	     x++;
	     k++;

	     }
	   }

	   if(right.length>y)

	   {
	     while(y < right.length)

	     {

	     result[k]=right[y];
	     y++;
	     k++;

	     }
	   }
	   return result;
	 }
	 
	 /*Yukarýdaki koda dikkat edilecek olursa 3 ayrý durum için birleþtirme kodu yazýlmýþtýr:
Birinci durumda iki dizide de eleman bulunmaktadýr. Bu durumda iki dizideki en baþtaki sayýlar karþýlaþtýrýlarak küçük olan sonuç dizisine 
kopyalanmaktadýr. Ýkinci ve üçüncü durumlarda ise dizilerden birisinde eleman kalmamýþtýr. Bu durumlarda eleman kalan dizideki elemanlar 
doðrudan sonuç dizisine kopyalanabilir.*/
	 
	 

}
