package nethackPackage;

/**
 * Purpose: This class can create pants.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Pants extends Armor {
	
	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the Pants.
	 * @param weight is a double that holds the weight of the Pants.
	 * @param defense is an int that shows how much the Pants defend from attacks.
	 */
	public Pants(String itemName, double weight, int defense) {
		super(itemName, weight, defense);
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Pants() {
		
	}
}