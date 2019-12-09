/**
 * PROGRAM DESCRIPTION:
 * <p>
 * This Program is used to create the WingBack Object. It has attributes,
 * constructors, getters and setters, toString() method and equals() method. 
 * It is one of the Child Class of the Defender, so Defender is its Parent Class.
 * <p>
 *  DATE: 25/07/18
 * <p>
 * NAME(S):
 * @author Tashfia Naharin Proma
 *         <p>
 * @author Mariam Jael Caceres Lopez 
 * 
 */

package Three;

import One.Date;

//A WingBack is a Defender that in addition has the following: throwIns (X: int type). 
public class WingBack extends Defender {
	
	//attribute
	private int throwIns;
	
	
	/**
	 * This is the Default Constructor. It assigns all attributes to their default types.
	 */
	public WingBack () {
		super();
		throwIns = 0;
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
	 * @param numTackles         Its a decimal value of the number of tackles by the Defender object. 
	 * @param throwIns           The number of throw ins by the WingBack object.
	 */
	public WingBack (String name, Date dob, String clubName, String countryName, int numYellowCards,int numRedCards,
			         int gamesPlayed,double  numTackles, int throwIns) {
		
		super (name, dob, clubName, countryName, numYellowCards, numRedCards, gamesPlayed, numTackles);
		this.throwIns = throwIns;
		
	}
	
	/**
	 * 
	/** This is a Copy Constructor. Keeps a copy of the attributes.
	 * @param c         This parameter's type is of this class's object.
	 */
	public  WingBack (WingBack c) {
		this.throwIns = c.throwIns;
		
	}
	
	
	//Getter and Setter
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the throwIns attribute.
	 */
	public int getThrowIns () {
		return throwIns;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param throwIns    It sets the variable with a value.
	 */
	public void getThrowIns (int throwIns ) {
		this.throwIns = throwIns;
	}

	
	/**
	 * This is toString() Method. Displays the objects all attributes value. This method is override.
	 * @see Three.Defender#toString()
	 */
	public String toString() {
			return ( "\nName: "        + this.name
					+"\nNationality: " + this.getCountryName()		
					+"\nAge: " + this.dob.playerAge()+" years old "+ this.getDob() 
					+"\nCurrent team: " + this.getClubName()
					+"\nPosition: WingBack "
					+"\nGames Played: "+ this.getGamesPlayed()
					+"\nTackles: "     + this.getNumTackles()
					+"\nThrow Ins: "      + this.getThrowIns()
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
		 * @see Three.Defender#equals(java.lang.Object)
		 */
		public  boolean equals(Object obj) {
			
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
			
	        
			else if ( this == obj) {
	            return true;
	        }
	       try { 
		        final WingBack   other = (WingBack ) obj;
		        
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
		        //defender 
		        if (this.getNumTackles() != other.getNumTackles() ) {
		        	return false;
		        }
		        //new
		        if (this.throwIns != other.throwIns) {
		        	return false;
	        }
				
		 } catch (NullPointerException e) {
     	    return false;
       }
			return true;
			
		}
	
	

}
