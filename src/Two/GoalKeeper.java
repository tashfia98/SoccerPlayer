/**
 * PROGRAM DESCRIPTION:
 * This Program is used to create the GoalKeeper Object. It has attributes, constructors, getters and setters, 
 * toString() method and equals() method. It is one of the Child Class of the SoccerPlayer Parent Class.
 * <p>
 *  DATE: 25/07/18
 * <p>
 * NAME(S):
 * @author Tashfia Naharin Proma
 *         <p>
 * @author Mariam Jael Caceres Lopez 
 * 
 */
package Two;  //Package 2.
import One.SoccerPlayer;
import One.Date;

public class GoalKeeper extends SoccerPlayer{
	
	//Attributes
	private int goalsAllowed;
	private int shotsOnGoal;
	private int  numSaves ;
	
	/**
	 *This is the Default Constructor. It assigns all attributes to their default types. 
	 */
	public GoalKeeper(){
		this.goalsAllowed=0;
		this.shotsOnGoal= 0;
		this.numSaves=0;
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
	 * @param goalsAllowed       The number of goals allowed by the GoalKeeper object.
	 * @param shotsOnGoal        The number of shots on goal by the GoalKeeper object.
	 * @param numSaves           The number of goals saved by the GoalKeeper object.
	 */
	public GoalKeeper (String name, Date dob, String clubName, String countryName, int numYellowCards,int numRedCards,
			           int gamesPlayed,int goalsAllowed, int shotsOnGoal, int numSaves) {
		
		super(name, dob, clubName, countryName, numYellowCards, numRedCards, gamesPlayed);
		this.goalsAllowed = goalsAllowed;
		this.shotsOnGoal = shotsOnGoal;
		this.numSaves = numSaves;
	}
	
	/**
	 * 
	/** This is a Copy Constructor. Keeps a copy of the attributes.
	 * @param a         This parameter's type is of this class's object.
	 */
	public GoalKeeper(GoalKeeper a){    
		this.goalsAllowed=a.goalsAllowed;
		this.shotsOnGoal=a.shotsOnGoal;
		this.numSaves=a.numSaves;
	}

	
	//Accessors
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the goalsAllowed attribute.
	 */
	public int getGoalsAllowed() {
		return  goalsAllowed;
	}
	
	/**
     * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the shotsOnGoal attribute.
	 */
	public int getShotsOnGoal() {
		return shotsOnGoal;
	}
	
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the numSaves attribute.
	 */
	public int getNumSaves() {
		return numSaves;
	}
	
	
	//Mutators
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable.
	 * Its a void method so no return type.
	 * @param goalsAllowed         It sets the variable with a value.
	 */
	public void setGoalsAllowed(int goalsAllowed) {
		this.goalsAllowed= goalsAllowed;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable.
	 * Its a void method so no return type.
	 * @param shotsOnGoal          It sets the variable with a value.
	 */
	public void setShotsOnGoal(int shotsOnGoal) {
		this.shotsOnGoal=shotsOnGoal;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable.
	 * Its a void method so no return type.
	 * @param numSaves              It sets the variable with a value.s
	 */
	public void setNumSaves(int numSaves) {
		this.numSaves=numSaves;
	}
	
	

	//toString Method
	/**
	 * This is toString() Method. Displays the objects all attributes value. This method is override.
	 * @see One.SoccerPlayer#toString()
	 */
	public String toString() {
		return ( "\nName: "        + this.name
				+"\nNationality: " + this.countryName		
				+"\nAge: "+ this.dob.playerAge()+" years old "+ this.dob
				+"\nCurrent team: " + this.clubName
				+"\nPosition: GoalKeeper"
				+"\nGames Played: "+ this.gamesPlayed
				+"\nGoals Allowed: "+ this.getGoalsAllowed()
				+"\nShots : "+ this.getShotsOnGoal()
				+"\nSaves: "+ this.getNumSaves()
				+"\nCautions:"
				+"\nYellow Cards: "+ this.getNumYellowCards()
				+"\nRed Cards: "+ this.getNumRedCards()
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
	        final  GoalKeeper other = ( GoalKeeper) obj;
	        
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
	        
	        if (this.goalsAllowed != other.goalsAllowed ) {
	        	return false;
	        }
	        
	        if (this.shotsOnGoal != other.shotsOnGoal ) {
	        	return false;
	        }
	        
	        if (this.numSaves != other.numSaves ) {
	        	return false;
	        }
	        
	        } catch (NullPointerException e) {
        	    return false;
          }	
			
			return true;
			
		}

		
}


