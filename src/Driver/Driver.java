/**
 * PROGRAM DESCRIPTION:
 * <p> This program is used to show soccer player's statistics such as name, club, nationality and so on. 
 * <p> The user can search players by: 
 * <p> The most number of goals scored.
 * <p> The least number of goals scored.
 * <p> The same club association.
 * <p> It will also allow user to make a copy of the player's statistics. 
 * <p>
 *  DATE: 25/07/18
 * <p>
 * NAME(S):
 * @author Tashfia Naharin Proma
 *         <p>
 * @author Mariam Jael Caceres Lopez 
 * 
 */
package Driver;
import java.util.Scanner;
//To import all classes in all packages.
import One.*;
import Two.*;
import Three.*;
import Four.*;
import Five.*;

public class Driver {
	
	public static void main(String[] args) {

		Scanner keyboard= new Scanner(System.in);


		System.out.println("\n-----------Soccer Player's Stats-----------\n");

		//Create various objects from all the 14 classes. Here is 14 objects.
		SoccerPlayer soccerPlayer=new SoccerPlayer("Neymar da Silva Santos Júnior", new Date(4,8,1986),"Paris Saint-Germain","Chile",3,0,30);

		GoalKeeper goalKeeper = new GoalKeeper("Gianluigi Buffon",new Date(28,3,1978),"Juventus","Italy",1,2,3,4,5,2); 	

		Defender defender=new Defender("Cristiano Ronaldo dos Santos Aveiro",new Date(8,12,1984),"Champion","Colombia",3,2,1,0);
		CentreBack centreBack =new CentreBack("John George Terry",new Date(3,12,1980),"Aston Villa","England",2,0,35,0,0);			
		Sweeper sweeper= new Sweeper("Raul Carazo", new Date(4,8,1986),"Real Madrid","Chile",3,0,30,2,4);
		WingBack wingBack=new WingBack("Miguel Casona", new Date(30,8,1985),"Logo","Brazil",2,0,30,2,3); 

		Midfielder midfielder=new Midfielder("Pedro Carazo", new Date(4,8,1986),"Barcelona","Chile",3,0,30,2);	
		CenreMidfielder centreMidfielder= new CenreMidfielder("Robart Gomez", new Date(2,8,1986),"Chelsea","Chile",3,0,30,2,4);
		WideMidfielder wideMidfielder= new  WideMidfielder("James Corden", new Date(4,8,1996),"Chelsea","Colombia",3,0,30,4,4);
		DefensiveMidfielder defensiveMidfielder= new DefensiveMidfielder("Cesar Mendez", new Date(4,8,1986),"Chelsea","Chile",3,0,30,2,4);

		Forward forward=new Forward("Rolandhino", new Date(4,8,1986),"Barcelona","Chile",3,0,30,40,4,9);
		CenreForward centreForward=new CenreForward("Leander Dendoncker", new Date(4,8,1986),"Real Madrid","Iceland",3,0,30,1,4,2,3);
		Winger winger=new Winger("Kaka", new Date(4,8,1986),"Aston Villa","Brazil",3,0,30,5,4,9,3);
		Striker striker=new Striker("Messi", new Date(4,8,1986),"Arsenal","Argentina",3,0,30,2,4,3,0);


		//4 new objects from few of the classes to test the equality of objects. They will be in the array as well
		GoalKeeper goalKeeper2 = new GoalKeeper("Kean John",new Date(28,3,1998),"Juventus","Canada",9,8,7,6,5,7); 

		Defender defender2=new Defender(" Marco Antonio", new Date(2,2,1970),"Marchal","Spain",0,2,3,4);

		CentreBack centreBack2= new CentreBack("Pedro Carazo", new Date(4,8,1986),"Arsenal","Chile",3,0,30,2,4);

		WingBack wingBack2=new WingBack("Miguel Casona", new Date(30,8,1985),"Logo","Brazil",2,0,30,2,3);



		//Display all their information using the toString() method. 
		System.out.println(soccerPlayer.toString());

		System.out.println(goalKeeper.toString());
		System.out.println(goalKeeper2.toString());

		System.out.println(defender.toString());
		System.out.println(defender2.toString());
		System.out.println(centreBack.toString());
		System.out.println(centreBack2.toString());
		System.out.println(sweeper.toString());
		System.out.println(wingBack.toString());
		System.out.println(wingBack2.toString());

		System.out.println(midfielder.toString());
		System.out.println(centreMidfielder.toString());
		System.out.println(wideMidfielder.toString());
		System.out.println(defensiveMidfielder.toString());
		System.out.println(forward.toString());
		System.out.println(centreForward.toString());
		System.out.println(winger.toString());
		System.out.println(striker.toString());




		//Test the equality of some to the created objects using the equals() method. 
		System.out.println("\n-----------Showing if some Soccer players are the same-----------\n");

		System.out.println("Are the first wingBack and second wingBack the same?");
		System.out.println(wingBack.equals(wingBack2));

		System.out.println("\nAre goalKeeper and first defender the same?");
		System.out.println(goalKeeper.equals(defender));

		System.out.println("\nIs midfielder and midfielder the same?");
		System.out.println( midfielder.equals(midfielder));
		System.out.println();


		//Create an array of 18 SoccerPlayer objects and fill that array with various objects from
		//the 14 classes (each class must have at least one entry in that array). 
		SoccerPlayer [] player= new SoccerPlayer [18];


		player[0]=soccerPlayer;
		player[1]=goalKeeper;
		player[2]=goalKeeper2; 
		player[3]=defender;
		player[4]=defender2;
		player[5]=centreBack;
		player[6]=centreBack2;
		player[7]=sweeper;
		player[8]=wingBack;
		player[9]=wingBack2;
		player[10]=midfielder;
		player[11]=centreMidfielder;
		player[12]=wideMidfielder;
		player[13]=defensiveMidfielder;
		player[14]=forward;
		player[15]=centreForward;
		player[16]=winger;
		player[17]=striker;


		
        //This give the user the option to trace soccer players
			String options=("\nWhat do you want to do? "
				+"\n(1) Search the most number of goals scored by a player"
				+"\n(2) Search the least number of goals saved by a player"
				+"\n(3) Search players with the same club association "
				+"\n(4) Copy the player's stats"
				+"\n(5) End the program"
				+"\n\nChoose one of the options: ");


		int b = 0;
		do {                 //This loop is to repeat the options.
			int input = 0;
			do {
				System.out.println(options);
				input= keyboard.nextInt();
			} while (input>5||input<1);   //To ensure the digit entered is between that range.  


			//Displaying options, after each option the program closes.
			switch(input) {

		
			case 1: {                          
				int indexNum = 0;
				int maxScore = 0;

				Forward maxScorePlayer = new Forward();
				for (int i = 0; i < player.length; i++) { 

					if(player[i] instanceof Forward) {
						Forward holder = new Forward();
						holder = (Forward)player[i];
						holder.getGoalsScored();
						if(holder.getGoalsScored() >= maxScore) {

							indexNum = i;
							maxScore = holder.getGoalsScored();
							maxScorePlayer = holder;
						}
					}
				}

				System.out.println("\nIndex: " + indexNum + "\nMax number of goals scored: "+ maxScore );
				System.out.println( maxScorePlayer);


				System.out.println();
				System.out.println("Type anything to go back to the Menu: ");
				String decision = keyboard.next();

			}	
			break;

			case 2: {

				int indexNum = 0;
				int leastSaves = Integer.MAX_VALUE;

				GoalKeeper leastNumSaves = new GoalKeeper();

				for (int i = 0; i < player.length; i++) { 

					if(player[i] instanceof GoalKeeper) {
						GoalKeeper holder = new GoalKeeper();
						holder = (GoalKeeper)player[i];

						holder.getNumSaves() ;
						if(holder.getNumSaves() <= leastSaves) {

							indexNum = i;
							leastSaves= holder.getNumSaves() ;
							leastNumSaves = holder;
						}
					}
				}

				System.out.println("\nIndex: " + indexNum + "\nLeast number of goals Saved: "+ leastSaves );
				System.out.println( leastNumSaves);


				System.out.println();
				System.out.println("Type anything to go back to the Menu: ");
				String decision = keyboard.next();

			}	 
			break;

			case 3: {   int a = 0;
			do{ System.out.println("Please enter the  club association: ");
			String store = keyboard.next();
			for (int i = 0; i < player.length; i++) {

				if((player[i].getClubName()).equals(store)) {
					System.out.println();
					System.out.print("Index: " + i);
					System.out.println(player[i].toString());
					a=1;
				}

			}
			}
			while (a == 0);

			System.out.println();
			System.out.println("Type anything to go back to the Menu: ");
			String decision = keyboard.next();


			} 	
			break;

			case 4: {
				///Showing the copy array
				System.out.println("\n----------- Printing Copied Players -----------\n");
				SoccerPlayer[] newPlayer  = teamSimilarTo(player);

				for (int i = 0; i < newPlayer.length; i++) {
					System.out.println(newPlayer[i]);
				}

				System.out.println("\n----------- Printing Original Players -----------\n");//add this
				for (int i = 0; i < player.length; i++) {
					System.out.println(player[i].toString());
				}

				System.out.print("\nCopy of Players was successful!\n");

				System.out.println();
				System.out.println("Type anything to go back to the Menu: ");
				String decision = keyboard.next();

			}
			break;


			case 5: {

				System.out.println();
				System.out.println("I hope you have received the information you were looking for, Thank you!");
				System.out.println("See you next time. Bye!");
				keyboard.close();
				System.exit(0);
				

			}


			}
		} while ( b == 0);


	}


	//For part 2.
	//Method that copies the Soccer Player original array
	
	/**
	 * This method makes a copy of the original player array
	 * @param player     This the player array
	 * @return           This return the copy array
	 */
	public static SoccerPlayer[] teamSimilarTo(SoccerPlayer[] player) {

		SoccerPlayer playerCopy[] = new SoccerPlayer[player.length];
		for(int i=0; i<player.length; i++){

			playerCopy[i] = new SoccerPlayer((SoccerPlayer)player[i]);

		}
		return playerCopy;


	}

}
	       




