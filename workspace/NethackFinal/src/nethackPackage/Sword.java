package nethackPackage;

/**
 * Purpose: This class can create swords.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 8, 2015
 */
public class Sword extends Weapon {
	
	/**
	 * Parameterized Constructor
	 * @param itemName
	 * @param weight
	 * @param damage
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