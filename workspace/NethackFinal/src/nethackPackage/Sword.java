package nethackPackage;

/**
 * Purpose: This class can create swords.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Sword extends Weapon {
	
	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the Sword.
	 * @param weight is a double that holds the weight of the Sword.
	 * @param damage is an int that shows how much damage the Sword can deal.
	 */
	public Sword(String itemName, double weight, int damage) {
		super(itemName, weight, damage);
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Sword() {
		 
	}
}