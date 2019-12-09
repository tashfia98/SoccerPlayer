/**
 * PROGRAM DESCRIPTION:
 * <p>
 * This Program is used to create the Defender Object. It has attributes,
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
package Three;  //Third package.

import One.Date;

//import java.util.Date;

import One.SoccerPlayer;


public class Defender extends SoccerPlayer{
	
	//Attribute
	private double  numTackles;
	

	/**
	 * This is the Default Constructor. It assigns all attributes to their default types.
	 */
	public Defender() {
		super ();
		numTackles = 0;
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
	 */
	public Defender (String name, Date dob, String clubName, String countryName, int numYellowCards,int numRedCards,
			         int gamesPlayed,double  numTackles) {
		
		super (name, dob, clubName, countryName, numYellowCards, numRedCards, gamesPlayed);
		this.numTackles = numTackles;
	}
	
	/**
	 * 
	/** This is a Copy Constructor. Keeps a copy of the attributes.
	 * @param copy        This parameter's type is of this class's object.
	 */
	public Defender( Defender copy) {
		this.numTackles= copy.numTackles;
	}
	
	
	//Accesor and Mutator
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return A decimal value of the numTackles attribute.
	 */
	public double getNumTackles() {
		return numTackles;
	}

	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param numTackles    It sets the variable with a value.
	 */
	public void setNumTackles(double numTackles) {
	 this.numTackles= numTackles;
	}
	

	/**
	 * This is toString() Method. Displays the objects all attributes value. This method is override.
	 * @see One.SoccerPlayer#toString()
	 */
	public String toString() {
		return ( "\nName: "               + this.name
				+"\nNationality: "        + this.getCountryName()		
				+"\nAge: " + this.dob.playerAge()+" years old "+ this.getDob() 
				+"\nCurrent team:"        + this.getClubName()
				+"\nPosition: Defender"
				+"\nGames Played: "       + this.getGamesPlayed()
				+"\nTackles: "            + this.getNumTackles()
				+"\nCautions:"
				+"\nYellow Cards: "       + this.getNumYellowCards()
				+"\nRed Cards: "          + this.getNumRedCards()
				
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
		        final Defender other = (Defender) obj;
		        
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
		        if (this.numTackles != other.numTackles ) {
		        	return false;
		        }
		        
	       } catch (NullPointerException e) {
       	    return false;
         }
			
			return true;
			
		}

}

//https://www.premierleague.com/stats/top/players/interception
