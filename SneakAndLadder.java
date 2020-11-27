import java.util.Random;
import java.util.Scanner;

class SneakLadder {

	final int STARTING_POSITION=0;
	final int END_POSITION=100;
	static int diceoutput;
	static int position_of_player1;
	static String Player1;
	static int choice;
	final int noPlay=1;
	final int ladder=2;
	final int sneak=3;
	
	
	void initialization() // UC1
	{
		Scanner s= new Scanner(System.in);
		System.out.println("\nEnter player 1 name =");
		String player1 = s.nextLine();
		System.out.println("\nPlayer 1 name = "+player1);
		position_of_player1=STARTING_POSITION;
		System.out.println("\nStarting Player1 Position ="+position_of_player1);
	}
	
	void rollingADice()    // UC2 
	{
		
		Random random = new Random();
		diceoutput= random.nextInt(6)+1;
	    System.out.println("\nDice output = "+diceoutput);
	    
			
	 }
	
	void checkForOption()    //UC3
	{
		Random random = new Random();
		choice = random.nextInt(3)+1;
		System.out.println("\nChoice ="+choice);
        switch (choice)
        {
        
        case noPlay : 
        	  System.out.println("\nNo play");
        	  if(position_of_player1>=STARTING_POSITION && position_of_player1<END_POSITION)
        	  {
        	     position_of_player1= position_of_player1+0;
        	  }
        	  System.out.println("\nPlayer1 Position = "+position_of_player1);
        	  break;
        
        case ladder :
        	  System.out.println("\nLadder, we will move ahead");
        	  if(position_of_player1>=STARTING_POSITION && position_of_player1<END_POSITION)
        	  {
        	     position_of_player1= position_of_player1+diceoutput;
        	  }
        	  System.out.println("\nPlayer1 Position = "+position_of_player1);
        	  break;
        
        case sneak : 
        	   System.out.println("\nSneak, we will move backwards");
        	   if(position_of_player1>=STARTING_POSITION && position_of_player1<END_POSITION)
        	   {
        	   
        		   position_of_player1= position_of_player1-diceoutput;
        		   if(position_of_player1<STARTING_POSITION)
        		   {
        			   position_of_player1=0; 
        		   }
        	   }
        	   System.out.println("\nPlayer1 Position = "+position_of_player1);
        	   break;
        }
	}
	
	void tillAPositionReached() // UC4
	{
		while(position_of_player1>=STARTING_POSITION && position_of_player1<END_POSITION)
		{
			rollingADice();
			
			Random random = new Random();
			choice = random.nextInt(3)+1;
			System.out.println("\nChoice ="+choice);
	        
			switch (choice)
	        {
	        
	        case noPlay : 
	        	  
	        	  position_of_player1= position_of_player1+0;
	        	  System.out.println("Updated Player1 Position = "+position_of_player1);
	        	  break;
	        
	        case ladder :
	        	  
	        	  position_of_player1= position_of_player1+diceoutput;
	        	  if(position_of_player1>END_POSITION)
	        	  {
	        		  position_of_player1=100; 
	        	  }
	        	  System.out.println("Updated Player1 Position = "+position_of_player1);
	        	  break;
	        
	        case sneak : 
	        	   
	        	  position_of_player1= position_of_player1-diceoutput;
	        		   if(position_of_player1<STARTING_POSITION)
	        		   {
	        			   position_of_player1=0; 
	        		   }
	        	   
	        	   System.out.println("Updated Player1 Position = "+position_of_player1);
	        	   break;
	        }
			
		}
		
		if(position_of_player1>=100)
		{
			System.out.println("\nWe reached final position so we got out of the loop.");
		}
	}
	
	

}

