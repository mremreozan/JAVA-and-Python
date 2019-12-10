/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0002_java_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int testCases = Integer.parseInt(in.nextLine());
		
	List<Student> studentList = new ArrayList<Student>();
	while(testCases>0){
		int id = in.nextInt();
		String fname = in.next();
		double cgpa = in.nextDouble();
			
		Student st = new Student(id, fname, cgpa);
		studentList.add(st);
			
		testCases--;
	}
        Collections.sort(studentList, new sequence());

      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
    }
    
}



