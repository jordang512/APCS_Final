package nethackPackage;

/**
 * Purpose: This class can create boots.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Boots extends Armor {
	
	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the Boots.
	 * @param weight is a double that holds the weight of the Boots.
	 * @param defense is an int that shows how much the Boots defend from attacks.
	 */
	public Boots(String itemName, double weight, int defense) {
		super(itemName, weight, defense);
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Boots() {
		
	}
}