package nethackPackage;

/**
 * Purpose: This class can create potions.
 * @author Isaac Pugh
 * @dateCreated April 9, 2015
 * @dateModified April 16, 2015
 */
public class Potion extends MagicItem {
	
	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the Potion.
	 * @param weight is a double that holds the weight of the Potion.
	 */
	public Potion(String itemName, double weight) {
		super(itemName, weight);
	}
	
	
	/**
	 * Unparameterized Constructor
	 */
	public Potion() {
		
	}
	
}