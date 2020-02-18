/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication55abstractbeginner;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
/*
interface AdvancedArithmetic{
  int divisor_sum(int n);
}
*/
class MyCalculator /*implements AdvancedArithmetic*/{
    public int divisor_sum(int a)
     {
        int s=1;
        int f=0,v=0;
        while(s<=a){
            if(a%s==0){
                f=s;
                v+=f;
            }
            s++;
        }
     return v;
    }
}
public class JavaApplication55abstractbeginner {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
    //    ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
    }
    /*
        static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    
        }
    */    
}
    

