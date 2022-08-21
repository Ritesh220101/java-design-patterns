package com.aurionpro.test;

import com.aurionpro.model.DietInfo;
import com.aurionpro.model.DietInfoCaretaker;

public class MementoTest {

	public static void main(String[] args) {
		DietInfoCaretaker caretaker = new DietInfoCaretaker();
		
		DietInfo diet = new DietInfo("ritz", 1, 70);
		System.out.println(diet);
		
		diet.setDayNumberAndWeight(2, 69);
		System.out.println(diet);
		System.out.println("Saving state to memento");
		caretaker.saveState(diet);
		
		System.out.println("-----------------------------------------------");
		
		diet.setDayNumberAndWeight(3, 68);
		System.out.println(diet);
		
		System.out.println("Restoring");
		caretaker.restoreState(diet);
		System.out.println(diet);
	}

}
