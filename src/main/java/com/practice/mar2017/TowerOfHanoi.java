package com.practice.mar2017;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int numDisc = 5;
		int numTowers = 3;
		
		/**
		 * rules
		 * 	- bigger disc can not be placed on top of smaller on
		 *  - one disc has to moved at one time
		 */
	}
	
	private static void printIt(char fromTower, char toTower, char usingTower){
		System.out.println(String.format("move disc from:%s to:%s using:%s", fromTower, toTower, usingTower));
	}

}
