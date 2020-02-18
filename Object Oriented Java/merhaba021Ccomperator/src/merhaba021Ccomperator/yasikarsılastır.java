package merhaba021Ccomperator;

import java.util.Comparator;

public class yasikarsýlastýr implements Comparator<dizi> {
	
	public int compare(dizi satir1, dizi satir2) {

		return satir1.getYas() > satir2.getYas() ? 1 : -1;      // yaþ bazýnda karþýlaþtýma 
	}
	
}
