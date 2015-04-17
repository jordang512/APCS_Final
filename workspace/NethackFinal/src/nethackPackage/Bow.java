package nethackPackage;

/**
 * Purpose: This class can create bows.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 8, 2015
 */
public class Bow extends Weapon {

	/**
	 * Parameterized Constructor
	 * @param itemName
	 * @param weight
	 * @param damage
	 */
	public Bow(String itemName, double weight, int damage) {
		super(itemName, weight, damage);
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Bow() {
		
	}
	
}
