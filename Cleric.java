package javaInstanceAndClassPracitce;
import java.util.Random;

public class Cleric {
	
	String name;
	// Heart Point 
	final int MAX_HP = 50;
	// Max Magic Point 
	final int MAX_MP = 50;
	// Magic Point
	int mp = 10;
	// HP
	int hp = 50;
	
	
	// Cure 
	public void aid() {
		System.out.print(this.name + "call Self Aid");
		this.hp = MAX_HP;
		mp = mp - 5;
		System.out.println("HP is max now");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "pray" + sec + "sec");
		
		int recover = new Random().nextInt(3) + sec;
		
		int recAct = Math.min(this.MAX_MP - this.mp, recover);
		
		this.mp = recAct;	
		
		System.out.println("MP is " + recAct);
		return recAct;
		
	}
	
	
}
