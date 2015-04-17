package nethackPackage;

/**
 * Purpose: This class can create weapons.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 8, 2015
 */
public class Weapon extends Item {

	private int damage;
	
	/**
	 * Parameterized Constructor
	 * @param itemName
	 * @param weight
	 * @param damage
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

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}