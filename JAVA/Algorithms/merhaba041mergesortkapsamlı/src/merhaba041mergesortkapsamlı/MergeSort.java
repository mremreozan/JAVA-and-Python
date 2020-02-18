package merhaba041mergesortkapsamlý;


public class MergeSort {

    public static void main(String[] args) {

	int[] arr = {15, 19, 4, 3, 18, 6, 2, 12, 7, 9, 11, 16};

	System.out.println("Unsorted:");

	printArray(arr); 

	MergeSort sortObj = new MergeSort(arr);
	
	sortObj.sort(arr);
	
	System.out.println("\nSorted:");

	printArray(arr); 

    }	
    
    
    private int[] list;

   // siralancak listeyi alan inþa fonksiyonu
    public MergeSort(int[] listToSort) {
	list = listToSort;
    }
    
    // dýþarýdan çaðýrýlan sýralama fonksiyonu
    public void sort() {
	list = sort(list);
    }
    // Özyineli olarak çalýþan ve her parça için kullanýlan sýralama fonksiyonu
    private int[] sort(int[] whole) {
    	if (whole.length == 1) {
    		return whole;
    	}
    	else {
    		// diziyi ikiye bölüyoruz ve solu oluþturuyoruz
    		int[] left = new int[whole.length/2];
    		System.arraycopy(whole, 0, left, 0, left.length);

    		//dizinin saðýný oluþturuyoruz ancak tek sayý ihtimali var
    		int[] right = new int[whole.length-left.length];
    		System.arraycopy(whole, left.length, right, 0, right.length);

    		// her iki tarafý ayrý ayrý sýralýyoruz
    		left = sort(left);
            	
    		right = sort(right);

    		// Sýralanmýþ dizileri birleþtiriyoruz
    		merge(left, right, whole);

    		return whole;
    	}
    }

    // birleþtirme fonksiyonu
    private void merge(int[] left, int[] right, int[] result) {
	int x = 0;
	int y = 0;
	int k = 0;

	// iki dizide de eleman varken
	while (x < left.length &&
	       y < right.length) {
	    if (left[x] < right[y]) {
		result[k] = left[x];
		x++;
	    }
	    else {
		result[k] = right[y];
		y++;
	    }
	    k++;
	}

	int[] rest;
	int restIndex;
	if (x >= left.length) {

	    rest = right;
	    restIndex = y;
	}
	else {

	    rest = left;
	    restIndex = x;
	}

	for (int i=restIndex; i<rest.length; i++) {
	    result[k] = rest[i];
	    k++;
	}
	
    }
    
    
    static void printArray(int arra[]) 
    { 
         
        for (int i=0; i<arra.length; ++i) 
            System.out.print(arra[i] + " "); 
  
    } 
}
