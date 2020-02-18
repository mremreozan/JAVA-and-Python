package merhaba041InsertionSort;

public class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int arr[]) 
    {  
        for (int i=1; i<arr.length; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 
  
    /* A utility function to print array of size n*/
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
  
    } 
  
    // Driver method 
    public static void main(String args[]) 
    {         
        int arr[] = {15, 19, 4, 3, 18, 6, 2, 12, 7, 9, 11, 16}; 
        
    	System.out.println("Unsorted:");
    	
        printArray(arr); 
  
        InsertionSort sortObj = new InsertionSort();   
        
        sortObj.sort(arr); 
        
        System.out.println("\nSorted:");
          
        printArray(arr); 
    } 
}
