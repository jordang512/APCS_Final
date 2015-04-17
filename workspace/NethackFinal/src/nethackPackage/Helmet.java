package nethackPackage;

/**
 * Purpose: This class can create helmets.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Helmet extends Armor {
	
	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the Helmet.
	 * @param weight is a double that holds the weight of the Helmet.
	 * @param defense is an int that shows how much the Helmet defends from attacks.
	 */
	public Helmet(String itemName, double weight, int defense) {
		super(itemName, weight, defense);
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Helmet() {
		
	}
}