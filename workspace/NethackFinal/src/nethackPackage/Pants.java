package nethackPackage;

/**
 * Purpose: This class can create pants.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 8, 2015
 */
public class Pants extends Armor {
	
	/**
	 * Parameterized Constructor
	 * @param itemName
	 * @param weight
	 * @param defense
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