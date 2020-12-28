package PriorityQueuesExcercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import PriorityQueuesExcercise.Carnage.Monster;

public class Driver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a driver class that creates a list of Victims
		//and uses it to call the method monsterAttack
		
		boolean loop = true;
		while (loop) {
		List<Victims> listOfVictims = new ArrayList<Victims>();
		/* You can hardcode the Victim data, but please don't name the victims
		 *  after real people whom your classmates or I might know. 
		 */
		Victims victim1 = new Victims("Murgatroyd", 110, 4);
		Victims victim2 = new Victims ("Bob", 105, 7);
		Victims victim3 = new Victims ("Joe", 100, 9);
		Victims victim4 = new Victims("Susie", 97, 10);
		Victims victim5 = new Victims ("Stan", 95, 5);
		Victims victim6 = new Victims ("Mary", 92, 9);
		
		listOfVictims.add(victim1);
		listOfVictims.add(victim2);
		listOfVictims.add(victim3);
		listOfVictims.add(victim4);
		listOfVictims.add(victim5);
		listOfVictims.add(victim6);
		
		Monster monsterTypeUsers = monsterTypeUserInput();
		int numberOfMonstersUser = numberOfMonstersUserInput();
		
		Carnage.monsterAttack(listOfVictims, monsterTypeUsers, numberOfMonstersUser);
		}
	}
	//User input
	static Scanner userInput = new Scanner(System.in);
	public static int numberOfMonstersUserInput() {
		System.out.println();
		System.out.println("How many monsters?");
		return userInput.nextInt();
	}
	
	public static Monster monsterTypeUserInput() {
		System.out.println();
		System.out.println("1) Zombie  OR  2) Vampire ?");
		int userChoice = userInput.nextInt();
		
		if (userChoice == 1) {
			return Monster.Zombie;
		}
		else {
			return Monster.Vampire;
		}
	}

}
