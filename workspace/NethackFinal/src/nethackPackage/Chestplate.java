package nethackPackage;

/**
 * Purpose: This class can create chestplates.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Chestplate extends Armor {
	
	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the Chestplate.
	 * @param weight is a double that holds the weight of the Chestplate.
	 * @param defense is an int that shows how much the Chestplate defends from attacks.
	 */
	public Chestplate(String itemName, double weight, int defense) {
		super(itemName, weight, defense);
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Chestplate() {
		
	}
}