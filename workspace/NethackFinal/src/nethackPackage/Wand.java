package nethackPackage;

/**
 * Purpose: This class can create wands.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Wand extends Weapon {
	
	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the Wand.
	 * @param weight is a double that holds the weight of the Wand.
	 * @param damage is an int that shows how much damage the Wand can deal.
	 */
	public Wand(String itemName, double weight, int damage) {
		super(itemName, weight, damage);
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Wand() {
		
	}
}