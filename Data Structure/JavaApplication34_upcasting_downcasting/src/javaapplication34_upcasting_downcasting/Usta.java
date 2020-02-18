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
public class Usta extends Kalfa {

	public Usta(String name, int age, int lunchTimes) {
		super(name, age, lunchTimes);

	}
	// Usta sınıfı sınırsız yemek hakkına sahip.
	@Override
	protected boolean mealTracker() {
		return true;
	}
        protected void calculateFrom() {
		System.out.println("Kalıp hesaplandı.");
	}    
}
