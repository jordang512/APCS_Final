package nethackPackage;

/**
 * Purpose: This class can create bows.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Bow extends Weapon {

	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the Bow.
	 * @param weight is a double that holds the weight of the Bow.
	 * @param damage is an int that holds how much damage the Bow does.
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
