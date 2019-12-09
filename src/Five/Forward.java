/**
 * PROGRAM DESCRIPTION:
 * <p>
 * This Program is used to create the Forward Object. It has attributes,
 * constructors, getters and setters, toString() method and equals() method. 
 * It is one of the Child Class of the SoccerPlayer Parent Class.
 * <p>
 * <p>
 * DATE: 25/07/18
 * <p>
 * NAME(S) AND ID(S):
 * 
 * @author  Tashfia Naharin Proma
 *         <p>
 * @author Mariam Jael Caceres Lopez 
 */
package Five;  //Fifth Package.

import One.*;

/*A Forward is a SoccerPlayer that in addition has following: goalsScored (X: int type), numAssists
(X: int type), shotsOnTarget (X: int type). 
*/
public class Forward extends SoccerPlayer {
	
    //Attribute
	private int goalsScored;
	private int numAssists;
	private int shotsOnTarget;

	
	/**
	 * This is the Default Constructor. It assigns all attributes to their default types.
	 */
	public Forward () {
		super();
		goalsScored = 0;
		numAssists = 0;
		shotsOnTarget = 0;
	}
	

	/**
	 * This is a Parameterized constructor.It takes enough parameters to initialize all attributes 
	 * of the created object from this class.
	 * @param name               The name of the SoccerPlayer object.
	 * @param dob                This attribute is used for the date of birth of the SoccerPlayer object.
	 * @param clubName           The club name of the SoccerPlayer object.
	 * @param countryName        The country name of the SoccerPlayer object.
	 * @param numYellowCards     The number of yellow cards the SoccerPlayer object received.
	 * @param numRedCards        The number of red cards the SoccerPlayer object received.
	 * @param gamesPlayed        The number of games played by the SoccerPlayer object.
	 * @param goalsScored        The number of goals scored by the Forward object.
	 * @param numAssists         The number of goals assists by the Forward object.
	 * @param shotsOnTarget      The number of shots on target by the Forward object.
	 */
	public Forward (String name, Date dob, String clubName, String countryName, int numYellowCards,int numRedCards,
			        int gamesPlayed, int goalsScored, int numAssists, int shotsOnTarget ) {
		
		super(name, dob, clubName, countryName, numYellowCards, numRedCards, gamesPlayed);  //After adding the packages
		this.goalsScored = goalsScored;
		this.numAssists = numAssists;
		this.shotsOnTarget = shotsOnTarget;
	}
	

	 
	/** This is a Copy Constructor. Keeps a copy of the attributes.
	 * @param c         This parameter's type is of this class's object.
	 */
	public Forward (Forward c) {
		this.goalsScored = c.goalsScored;
		this.numAssists = c.numAssists;
		this.shotsOnTarget = c.shotsOnTarget;
	}
	
	//Getter and Setter
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the goalsScored attribute.
	 */
	public int getGoalsScored () {
		return goalsScored;
	}
	
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the numAssists attribute.
	 */
	public int getNumAssists () {
		return numAssists;
	}
	
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the shotsOnTarget attribute.
	 */
	public int getShotsOnTarget () {
		return shotsOnTarget;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param goalsScored    It sets the variable with a value. 
	 */
	public void setGoalsScored (int goalsScored ) {
		this.goalsScored = goalsScored;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param numAssists    It sets the variable with a value. 
	 */
	public void setNumAssists (int numAssists) {
		this.numAssists = numAssists;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param shotsOnTarget  It sets the variable with a value. 
	 */
	public void setShotsOnTarget (int shotsOnTarget) {
		this.shotsOnTarget = shotsOnTarget;
	}
	
	
	

	/**
	 * This is toString() Method. Displays the objects all attributes value. This method is override.
	 * @see One.SoccerPlayer#toString()
	 */
	public String toString () {
		return  ("\nName: "                 + this.getName()
				+"\nNationality: "          + this.getCountryName()		
				+"\nAge: "+ this.dob.playerAge() +" years old "+ this.getDob() 
				+"\nCurrent team:"          + this.getClubName() 
				+"\nPosition: Forward" 
				+"\nGames Played: "         + this.getGamesPlayed()
			    +"\nGoals Scored: "         + this.getGoalsScored()
		        +"\nGoals Assisted: "       + this.getNumAssists ()
		        +"\nGoals Shot on Target: " + this.getShotsOnTarget ()
			    +"\nCautions:"
				+"\nYellow Cards: "         + this.getNumYellowCards()
				+"\nRed Cards: "            + this.getNumRedCards()
		        );

		}

	
	
	
	/**
	 * This is an equals() method. It checks if you objects are same. The null verifications here,
	 * will protect this program from crashing. A NullPointerException is handled to make it more
	 * protective. The comparison of the attributes are done to see if they have same attribute values
	 * therefore are same. If both the objects are from the same class they are likely to be same.
	 * This method is override.
	 * @see One.SoccerPlayer#equals(java.lang.Object)
	 */
	public  boolean equals(Object obj) {
		
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
		
       
		else if ( this == obj) {
            return true;
        }
        try {
	        final Forward other = (Forward) obj;
	        
	        if (this.name != null || other.name != null )
	        	 if (!this.name.equals(other.name))
	        		 return false;
	        	
	        if ( this.countryName != null || other.countryName != null )	
	        	 if (!this.countryName.equals(other.countryName))
	        		 return false;
	        
	        if(this.clubName != null || other.clubName != null)
	        	 if(!this.clubName.equals(other.clubName))
	        	     return false;
	      
	        
	        if (this.numYellowCards != other.numYellowCards ||this.numRedCards != other.numRedCards || 
	        	this.gamesPlayed != other.gamesPlayed) {
	        	 return false;
	        }
	        

	        if (this.dob != other.dob) {
	        	if(this.dob.getDay( )!= other.dob.getDay() || this.dob.getMonth( ) != other.dob.getMonth() ||
	        	   this.dob.getYear( ) != other.dob.getYear())
	        	     
	        		return false;
		    } 
	        
	        //forward
		        if (this.goalsScored != other.goalsScored) {
		        	return false;
		        }
		        
		        if (this.numAssists != other.numAssists) {
		        	return false;
		        }
		        
		        if (this.shotsOnTarget != other.shotsOnTarget) {
		        	return false;
		        }
		        
	        } catch (NullPointerException e) {
        	    return false;
          }
 
	        
			return true;
			
		}


		

}
