/* Sources used: https://www.w3schools.com/java/java_enums.asp
              	 https://www.geeksforgeeks.org/priority-queue-class-in-java-2/
                 https://www.geeksforgeeks.org/enum-in-java/
*/
package PriorityQueuesExcercise;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

//You will need to write at least one Comparator so that you can implement the queues in two different orders.
// You can either make Victim implement Comparable and handle the other sort order using a Comparator
public class Carnage implements Comparator<Victims> {

	@Override
	public int compare(Victims victim1, Victims victim2) {
		// TODO Auto-generated method stub
		double diff = victim1.getAppearanceScore() - victim2.getAppearanceScore();
		if (diff > 0) return -1;
		else if (diff < 0) return 1;
		else return 0;
	}
	
	//You do not need to write Zombie and Vampire classes; use an enum for this.
	enum Monster{
		Vampire,
		Zombie
	}
	
	//Carnage contains a method called monsterAttack()
	//This method takes a List of victims and an enum value of the type of Monster, and the number of monsters,
	public static void monsterAttack(List <Victims> victimsList, Monster monster, int numMonsters) {
		/* The monster takes turns feeding from the queue in the same manner used by the children
		 * in the swingset example in the lecture notes, using a modulo operator inside a loop
		 * However, you don't need to use Thread.sleep in this case */
		
		if (monster.equals(Monster.Vampire)) {
			//Create comperator
			Comparator<Victims> comparator = new Carnage();
			//Create the correct type of PriorityQueu		
			PriorityQueue<Victims> queueForVictims = new PriorityQueue<Victims>(comparator);
			for (int i = 0; i<victimsList.size(); i++) {
				queueForVictims.offer(victimsList.get(i));
			}
			//Similar to the swing modulo
			int round = 0;
			while(!queueForVictims.isEmpty()) {
				System.out.println(queueForVictims.remove() + " is eaten by Vampire number " + round % numMonsters);
				round++;
			}
		}
		else if(monster.equals(Monster.Zombie)) {
			//Create new queue for Zombies
			PriorityQueue<Victims> queueForVictims = new PriorityQueue<Victims>(victimsList); 
			//Similar to the Swing modulo
			int round = 0;
			while(!queueForVictims.isEmpty()) {
				System.out.println(queueForVictims.remove() + " is eaten by Zombie number " + round % numMonsters);
				round++;
			}
		}
		else {
			System.out.println("ERROR");
		}
	}
}

