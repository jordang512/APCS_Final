package nethackPackage;

/**
 * Purpose: This class can create weapons.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Weapon extends Item {

	private int damage;
	
	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the Weapon.
	 * @param weight is a double that holds the weight of the Weapon.
	 * @param damage is an int that shows how much damage the Weapon can deal.
	 */
	public Weapon(String itemName, double weight, int damage) {
		super(itemName, weight);
		this.damage = damage;
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Weapon() {
		
	}

	/**
	 * Getters and Setters
	 */
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}