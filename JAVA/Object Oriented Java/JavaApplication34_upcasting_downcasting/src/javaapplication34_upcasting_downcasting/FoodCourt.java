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
public class FoodCourt {

	protected void luchTime(Isci p) {
		
		if (p.mealTracker() == true) {
			System.out.println("Afiyet olsun.");
		} else {
			System.out.println("Sayın "+p.name+", lütfen yemek kartınızı doldurunuz.");
		}
        }
}
