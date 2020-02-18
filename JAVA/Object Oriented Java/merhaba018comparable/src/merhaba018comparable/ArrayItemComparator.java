package merhaba018comparable;

import java.util.Comparator;

//“ArrayItemComparator” sýnýfý  “ArrayItem” tipindeki nesneleri “age” alanýna bakarak, küçükten büyüðe doðru sýralayacaktýr.

public class ArrayItemComparator implements Comparator<ArrayItem>{
	@Override
    public int compare(ArrayItem arg0, ArrayItem arg1) {
          // Ýlk parametrede gelen yaþ deðeri, ikincisinden büyükse 1 deðeri, küçükse -1 deðeri döndürülür.
          // Comparator sýnýfýnýn çalýþma mantýðý 1,0,-1 deðerlerine bakýlarak yapýlýr.
          /*
           *   1 deðeri arg0 > arg1 'den büyük olduðunu belirtir.
           *   0 deðeri arg0 == arg1 ile eþit deðerde olduðunu belirtir.
           *   -1 deðeri arg0 < arg1 'den küçük olduðunu belirtir.
           */
          return arg0.getAge() > arg1.getAge() ? 1 : -1;

	}
}
