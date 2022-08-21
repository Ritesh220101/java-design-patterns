package com.aurionpro.test;

import com.aurionpro.model.Game;
import com.aurionpro.model.GameLoadMenu;

public class GameTest {

	public static void main(String[] args) {
		Game gta = new Game();
		GameLoadMenu loadMenu = new GameLoadMenu();
		
		gta.setMission("Big Smoke");
		loadMenu.saveGameProgress(gta.savingMission());
		
		gta.setMission("Ryder");
		loadMenu.saveGameProgress(gta.savingMission());
		
		gta.setMission("Sweet Johnson");
		loadMenu.saveGameProgress(gta.savingMission());
		
		gta.setMission("Madd Dogg");
		loadMenu.saveGameProgress(gta.savingMission());
		
		System.out.println(loadMenu);
		
//		gta.loadingMission(loadMenu.loadGame(0));
//		System.out.println("Loading "+gta.getMission());
		
//		System.out.println("--------------------------");
		
		gta.loadingMission(loadMenu.loadGame(1));
		System.out.println("Loading "+gta.getMission());
//		
//		System.out.println("--------------------------");
//		
//		gta.loadingMission(loadMenu.loadGame(2));
//		System.out.println("Loading "+gta.getMission());
//		
//		System.out.println("--------------------------");
//		
//		gta.loadingMission(loadMenu.loadGame(3));
//		System.out.println("Loading "+gta.getMission());
	}

}
