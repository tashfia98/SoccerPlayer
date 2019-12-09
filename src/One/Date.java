/**
 * PROGRAM DESCRIPTION:
 * <p> This program is used to show date in the appropriate format.
 * <p>
 *  DATE: 25/07/18
 * <p>
 * NAME(S):
 * @author Tashfia Naharin Proma
 *         <p>
 * @author Mariam Jael Caceres Lopez 
 * 
 */
package One;
public class  Date {
	
	//Attributes
	private int month;
	private int day;
	private int year;
	
	/**
	 * This is the Default Constructor. It assigns all attributes to their default types.
	 */
	public Date() {
		month=0;
		day=0;
		year=0;
	}
	
	/**
	 * This is a Parameterized constructor.It takes enough parameters to initialize all attributes 
	 * of the created object from this class.
	 * @param day                The day of the Date object.
	 * @param month              The month of the Date object.
	 * @param year               The year of the Date object.
	 */
	public Date(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	/**
	 * 
	/** This is a Copy Constructor. Keeps a copy of the attributes.
	 * @param c         This parameter's type is of this class's object.
	 */
	public Date(Date c) {
		this.month=c.month;
		this.day=c.day;
		this.year=c.year;
	}
	

	
	/**
	 * This method is to o calculate age of the player.
	 * @return The age of the player
	 */
	public  int playerAge() {
	
		int age= (2018- this.year);
		return age;
	}
	
	//Getter and Setter
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the day attribute.
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the month attribute.
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the year attribute.
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 *  @param day   It sets the variable with a value. 
	 */
	public void setDay(int day) {
		this.day=day;
	}
	

	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 *  @param month   It sets the variable with a value. 
	 */
	public void setMonth(int month) {
		this.month=month;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param year   It sets the variable with a value. 
	 */
	public void setYear(int year) {
		this.year=year;
	}
	

	/**
	 * This is toString() Method. Displays the objects all attributes value. This method is override.
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		if ( this.day >=10) {
		 return "("+ this.day+"-"+this.month+"-"+this.year+")";
		}
		else return "(0"+ this.day+"-"+this.month+"-"+this.year+")"; //to maintain the format
	}
	
}
