//Source: https://www.geeksforgeeks.org/implement-priorityqueue-comparator-java/

package PriorityQueuesExcercise;

public class Victims implements Comparable<Victims>{
	//Data fields
	private String names;
	private int IQ;
	private int appearanceScore;
	
	//Constructor
	public Victims(String names, int IQ, int appearanceScore) {
		this.names = names;
		
		/* All appearance scores are between 1 and 10; it is easy to set up 
		* the constructor and setters to ensure this. 
		*/
		
		//No IQ can be below 50 or above 200. 
		if (IQ>200) {
			this.IQ = 200;
		}
		else if (IQ < 50) {
			this.IQ = 50;
		}
		else {
			this.IQ = IQ;
		}
		this.IQ = IQ;
		
		//All appearance scores are between 1 and 10
		if(appearanceScore > 10) {
			this.appearanceScore = 10;
		}
		else if (appearanceScore < 10) {
			this.appearanceScore = 1;
		}
		else {
			this.appearanceScore = appearanceScore;
		}
		this.appearanceScore=appearanceScore;
	}
	

	//Use proper encapusalation (Getters and Setters)
	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public int getIQ() {
		return IQ;
	}

	public void setIQ(int IQ) {
		if (IQ > 200) {
			this.IQ = 200;
		}
		else if (IQ < 50) {
			this.IQ = 50;
		}
		else{
			this.IQ = IQ;
		}
	}

	public int getAppearanceScore() {
		return appearanceScore;
	}

	public void setAppearanceScore(int appearanceScore) {
		if(appearanceScore > 10) {
			this.appearanceScore = 10;
		}
		else if (appearanceScore < 1) {
			this.appearanceScore = 1;
		}
		else {
			this.appearanceScore = appearanceScore;
		}
	}
	
	/* Victim's toString() should show all the data in some 
	 * reasonable format.
	*/
	public String toString() {
		return this.getNames()+ ": intelligence " + this.getIQ() + ", appearnace " + this.getAppearanceScore();
	}
	@Override
	public int compareTo(Victims victims) {
	//	return this.IQ.compareTo(v.getIQ());
		if(this.IQ > victims.IQ) {
			return -1;
		}else if(this.IQ < victims.IQ) {
			return 1;
		}
		return 0;
	}
}
