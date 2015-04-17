package nethackPackage;

/**
 * Purpose: This class can create helmets.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 8, 2015
 */
public class Helmet extends Armor {
	
	/**
	 * Parameterized Constructor
	 * @param itemName
	 * @param weight
	 * @param defense
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