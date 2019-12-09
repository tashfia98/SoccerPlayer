/**
 * PROGRAM DESCRIPTION:
 * This Program is used to create the SoccerPlayer Object. It has attributes, constructors, getters and setters,
 * toString() method and equals() method. It is the Parent Class of the other classes.
 * <p>
 *  DATE: 25/07/18
 * <p>
 * NAME(S):
 * @author Tashfia Naharin Proma
 *         <p>
 * @author Mariam Jael Caceres Lopez 
 * 
 */

package One; //First Package.

public class SoccerPlayer  { 

	//Attributes
	protected String name;
	protected Date dob = new Date ();
	protected String clubName;
	protected  String countryName;
	protected  int numYellowCards;
	protected  int numRedCards;
	protected  int gamesPlayed;
	
	
	/**
	 *This is the Default Constructor. It assigns all attributes to their default types. 
	 */
	public SoccerPlayer() {
		
		this.name = null;
		this.dob = null;
		this.clubName = null;
		this.countryName = null;
		this.numYellowCards = 0;
		this.numRedCards = 0;
		this.gamesPlayed = 0;
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
	 */
	public SoccerPlayer(String name, Date dob, String clubName, String countryName, int numYellowCards,int numRedCards,
			            int gamesPlayed) {
		this.name =  name;
		this.dob = dob;
		this.clubName = clubName;
		this.countryName = countryName;
		this.numYellowCards = numYellowCards;
		this.numRedCards = numRedCards;
		this.gamesPlayed = gamesPlayed;
		
	}
	
	
	/**
	 * 
	/** This is a Copy Constructor. Keeps a copy of the attributes.
	 * @param a         This parameter's type is of this class's object.
	 */
	public SoccerPlayer(SoccerPlayer a) {
		
		this.name = a.name;
		this.dob=a.dob;
		this.clubName=a.clubName;
		this.countryName=a.countryName;
		this.numYellowCards=a.numYellowCards;
		this.numRedCards=a.numRedCards;
		this.gamesPlayed=a.gamesPlayed;
		
	}
	
	
	//Accesors
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return A String, the SoccerPlayer object's name attribute.
	 */
	public String getName( ) {
		
		return name;
	}
	
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return A Date (DD-MM-YYYY), the SoccerPlayer object's dob attribute.
	 */
	public Date getDob() {
		return dob;
	}
	
	/**
	* This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return A String, the SoccerPlayer object's clubName attribute.
	 */
	public String getClubName() {
		return  clubName;
	}
	
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return A String, the SoccerPlayer object's countryName attribute.
	 */
	public String getCountryName() {
		return countryName;
	}
	
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the numYellowCards attribute.
	 */
	public int getNumYellowCards() {
		return numYellowCards;
	}
	
	/**
	  * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the numRedCards attribute.
	 */
	public int getNumRedCards() {
		return numRedCards;
	}
	
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the gamesPlayed attribute.
	 */
	public int  getGamesPlayed() {
		return gamesPlayed;
	}

	
	
	//Mutators
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param name     It sets the variable with a value.
	 */
	public void setName(String name) {
		this.name=name;
	}
    
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param dob     It sets the variable with a value.
	 */
	public void setDob(Date dob) {
		this.dob= dob;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable.
	 * Its a void method so no return type.
	 * @param clubName     It sets the variable with a value.
	 */
	public void setClubName(String clubName) {
		this.clubName=clubName;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable.
	 * Its a void method so no return type.
	 * @param countryName     It sets the variable with a value.
	 */
	public void setCountryName(String countryName) {
		this.countryName= countryName;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable.
	 * Its a void method so no return type.
	 * @param numYellowCards     It sets the variable with a value.
	 */
	public void setNumYellowCards(int numYellowCards) {
		this.numYellowCards= numYellowCards;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable.
	 * Its a void method so no return type.
	 * @param numRedCards     It sets the variable with a value.
	 */
	public void setNumRedCards(int numRedCards) {
		this.numRedCards= numRedCards;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable.
	 * Its a void method so no return type.
	 * @param gamesPlayed     It sets the variable with a value.
	 */
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed= gamesPlayed;
	}
	
	
    
	/**
	 * This is toString() Method. Displays the objects all attributes value. This method is override.
	 * @see java.lang.Object#toString()
	 */
	public String toString() {                       //https://www.whoscored.com/Players/50835/Show/Neymar
		return (
				 "\nName: "        + this.name 
				+"\nNationality: " + this.getCountryName()		
				+"\nAge: "+ this.dob.playerAge() + " years old " + this.getDob() 
				+"\nCurrent team: " + this.getClubName() 
				+"\nPosition: Soccer Player" 
				+"\nGames Played: "+ this.getGamesPlayed()
				+"\nCautions:"
				+"\nYellow Cards: "+ this.getNumYellowCards()
				+"\nRed Cards: "   + this.getNumRedCards());
				
		}
	

	                                                 
	/**
	 * This is an equals() method. It checks if you objects are same. The null verifications here,
	 * will protect this program from crashing. A NullPointerException is handled to make it more
	 * protective. The comparison of the attributes are done to see if they have same attribute values
	 * therefore are same. If both the objects are from the same class they are likely to be same.
	 * This method is override.
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj)  {// check if object are equal.
		
		
		if (obj == null || getClass() != obj.getClass()) {  
            return false;
        }
        
       
		else if ( this == obj) {
            return true;
        }
		
        try {
		        final SoccerPlayer  other = (SoccerPlayer) obj;
		        
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
		      
		        
        } catch (NullPointerException e) {
        	    return false;
          }
 
        
		return true;
	}

}
   