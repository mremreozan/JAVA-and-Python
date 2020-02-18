/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17_map_compare_interface;
import java.util.*;

/**
 *
 * @author Utilisateur
 */
public class JavaApplication17_map_compare_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String,Integer> skorTablosu=new HashMap<>();
        skorTablosu.put("FenerBahçe",45);
        skorTablosu.put("TrabzonSpor",33);
        skorTablosu.put("Beşiktaş",33);
        skorTablosu.put("SivasSpor",33);
        skorTablosu.put("İstanbulSpor",32);

        Map<String,Integer> siraliSkorTablosu=siraliSkor(skorTablosu);
 
        for (Map.Entry<String,Integer> tmp:siraliSkorTablosu.entrySet()){
 
            System.out.println(tmp.getKey()+ " Puani = "+tmp.getValue()); 
        }
    }
 
    private static Map<String, Integer> siraliSkor(Map<String, Integer> skorTablosu) {
 
        List liste=new LinkedList(skorTablosu.entrySet());
 
        Collections.sort(liste, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int o1Skor = (int) ((Map.Entry) (o1)).getValue(); 
                int o2Skor = (int) ((Map.Entry) (o2)).getValue();
 
                if (o1Skor != o2Skor){
                    return o1Skor - o2Skor;}
                else if (o1Skor == o2Skor){            // Eger takimlarin puanlari esitse takimismine gore alfabetik sira yapicaz.
                    return ((Map.Entry) (o1)).getKey().toString().compareTo(((Map.Entry) (o2)).getKey().toString());
                }
                else
                    return 0;
            }
        });
 
        Iterator iter=liste.iterator();
 
        Map<String,Integer> tempMap=new LinkedHashMap<>();
        while (iter.hasNext()){
 
            Map.Entry tmp=(Map.Entry)iter.next();
            tempMap.put((String)tmp.getKey(),(Integer)tmp.getValue());
        }
    return tempMap;
    }
    
}
