/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44_list_cartesian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication44_list_cartesian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String arritems[] = scan.nextLine().split(" ");
        
        int arr[] = new int[arritems.length];
        for(int i=0; i<arritems.length; i++){
            arr[i] = Integer.parseInt(arritems[i]);
        }
        
        System.out.println("Burada biz alt kumelerinin kendi icerisindeki 2 li elemanlarinin belirledigimiz sayisya bolunup bolunmedigine bakicaz.\n Ve sonuc olarak hic bir 2 li elemani belirledigimiz syiya kalansiz bolunmeyen alt kumenin uzunlugunu yazdiricaz.\n Dizinin alt kumelerinin 2 li elamanlarinin bolunup bolunmedigine bakacaginiz sayiyi giriniz:");
        int k = scan.nextInt();
        
        JavaApplication44_list_cartesian soa= new JavaApplication44_list_cartesian();
        List<List<Integer>> subsets = soa.subsets(arr);
                
                         
        int n=0; 
        List<Integer> subset = new ArrayList();
	for (int i=0; i<subsets.size(); i++) {
            subset = subsets.get(i);
            System.out.println(subset);
            int topunuz;
            int m=0;
            for(int p=0; p<subset.size(); p++){
                
                for(int r=p+1; r<subset.size(); r++){
                    
                    m=0;
                    topunuz = 0;
                    topunuz = subset.get(p)+ subset.get(r);
                    m = topunuz % k;
                    if(m==0){
                        break;
                    }
//                    System.out.println(subset.get(p) + ", " + subset.get(r));  
                    
                    
                }
                if(m==0){
                    break;
                }
            }
            if(m > 0 && subset.size() > n){
                n = subset.size();
                System.out.printf("**\n");
            }
        }
        System.out.println("****"+ n + "*****");
        
        
        System.out.println("Dizinin alt kumeleri:");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            for(int j=i+1; j<arr.length; j++){
                System.out.printf("%d", arr[i]);
                System.out.printf("%d\n", arr[j]);
                for(int t=j+1; t<arr.length; t++){
                    System.out.printf("%d", arr[i]);
                    System.out.printf("%d", arr[j]);
                    System.out.printf("%d\n", arr[t]);
                }
            }           
        }
        System.out.println("Dizinin alt kumeleri bitti.");
      
    }
 
    public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		subsetsHelper(list, new ArrayList<>(), nums, 0);
		return list;
    }
 
    private static void subsetsHelper(List<List<Integer>> list , List<Integer> resultList, int [] nums, int start){
		list.add(new ArrayList<>(resultList));
		for(int i = start; i < nums.length; i++){
           // add element
			resultList.add(nums[i]);
           // Explore
			subsetsHelper(list, resultList, nums, i + 1);
           // remove
			resultList.remove(resultList.size() - 1);
		}
    }       
}
