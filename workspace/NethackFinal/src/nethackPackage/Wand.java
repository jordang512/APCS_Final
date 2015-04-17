package nethackPackage;

/**
 * Purpose: This class can create wands.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 8, 2015
 */
public class Wand extends Weapon {
	
	/**
	 * Parameterized Constructor
	 * @param itemName
	 * @param weight
	 * @param damage
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