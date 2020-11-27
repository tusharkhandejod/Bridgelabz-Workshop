import java.util.Random;
import java.util.Scanner;

class SneakLadder {

	final int STARTING_POSITION=0;
	final int END_POSITION=100;
	static int diceoutput;
	static int position_of_player1;
	static String Player1;

	
	
	void initialization() // UC1
	{
		Scanner s= new Scanner(System.in);
		System.out.println("\nEnter player 1 name =");
		String player1 = s.nextLine();
		System.out.println("\nPlayer 1 name = "+player1);
		position_of_player1=STARTING_POSITION;
		System.out.println("\nStarting Player1 Position ="+position_of_player1);
	}

}


class Main1 {

	public static void main(String[] args) 
	{
		System.out.println("\n---------------------------------------");
		System.out.println("\n\nWelcome to the Sneak & Ladder program");
		System.out.println("\n---------------------------------------");
		
		SneakLadder obj1 = new SneakLadder();
		obj1.initialization();
	}

}
