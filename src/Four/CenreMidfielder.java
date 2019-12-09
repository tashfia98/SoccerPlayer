/**
 * PROGRAM DESCRIPTION:
 * <p>
 * This Program is used to create the CenreMidfielder Object. It has attributes,
 * constructors, getters and setters, toString() method and equals() method. 
 * It is one of the Child Class of the Midfielder, so Midfielder is its Parent Class.
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
package Four;

import One.Date;  //to import the date class


//A CenreMidfielder is a Midfielder that in addition has the following: numPasses (X: int type). 
public class CenreMidfielder extends Midfielder {
	
	//Attribute
	private int numPasses;
	
	
	/**
	 * This is the Default Constructor. It assigns all attributes to their default types.
	 */
	public CenreMidfielder () {
		super();
		numPasses = 0;
		
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
	 * @param attacksStopped     The number of attacks stopped by the Midfielder object.
	 * @param numPasses           The number of passes by the CenreMidfielder object
	 */
	public CenreMidfielder (String name, Date dob, String clubName, String countryName, int numYellowCards,int numRedCards,
			   int gamesPlayed,int attacksStopped, int numPasses ) {
		super(name, dob, clubName, countryName, numYellowCards, numRedCards, gamesPlayed, attacksStopped);
		this.numPasses = numPasses;
	}
	
	/**
	 * 
	/** This is a Copy Constructor. Keeps a copy of the attributes.
	 * @param c         This parameter's type is of this class's object.
	 */
	public CenreMidfielder (CenreMidfielder c) {                   
		this.numPasses = c.numPasses;
		
	}
	
	//Getter and Setter
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the numPasses attribute.
	 */
	public int getNumPasses () {
		return numPasses;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param numPasses       It sets the variable with a value. 
	 */
	public void setNumPasses (int numPasses) {
		this.numPasses = numPasses;
		
	}
	

	/**
	 * This is toString() Method. Displays the objects all attributes value. This method is override.
	 * @see Four.Midfielder#toString()
	 */
	public String toString () {
		return  ("\nName: "             + this.getName()
				+"\nNationality: "      + this.getCountryName()		
				+"\nAge: "+ this.dob.playerAge() +" years old "+ this.getDob() 
				+"\nCurrent team: "      + this.getClubName() 
				+"\nPosition: Centre Midfielder" 
				+"\nGames Played: "     + this.getGamesPlayed()
				+"\nAttacks Stopped: " + this.getAttacksStopped()
			    +"\nNumber of Passes: " + this.getNumPasses() 
				+"\nCautions:"
				+"\nYellow Cards: "     + this.getNumYellowCards()
				+"\nRed Cards: "        + this.getNumRedCards()
       
				);

	}


	/**
	 * This is an equals() method. It checks if you objects are same. The null verifications here,
	 * will protect this program from crashing. A NullPointerException is handled to make it more
	 * protective. The comparison of the attributes are done to see if they have same attribute values
	 * therefore are same. If both the objects are from the same class they are likely to be same.
	 * This method is override.
	 * @see Four.Midfielder#equals(java.lang.Object)
	 */
	public  boolean equals(Object obj) {
		
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
		
       
		else if ( this == obj) {
            return true;
        }
        
        try {
	        final CenreMidfielder other = (CenreMidfielder) obj;
	    
	        
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
	        
	        //for midfielder
	        if (this.getAttacksStopped() != other.getAttacksStopped() ) {
	        	    return false;
	        }
	        
	        //new
	        if (this.numPasses != other.numPasses) {
	        	    return false;
	        }
	        
        } catch (NullPointerException e) {
    	            return false;
          }
			
		
		return true;
		
	}
	
}
