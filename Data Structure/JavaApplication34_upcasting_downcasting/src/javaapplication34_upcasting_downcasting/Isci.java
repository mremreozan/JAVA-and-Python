/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34_upcasting_downcasting;

/**
 *
 * @author Utilisateur
 */
public class Isci {

	protected String name;
	protected int age;
	protected int lunchTimes; // Kalan yemek sayısı

	public Isci(String name, int age, int lunchTimes) {
		this.name = name;
		this.age = age;
		this.lunchTimes = lunchTimes;
	}
	// Yemek sayını kontrol eden metot.
	protected boolean mealTracker() {
		boolean b = false;

		if (lunchTimes > 0) {
			lunchTimes--;
			b = true;
		}
		return b;
	}    
}
