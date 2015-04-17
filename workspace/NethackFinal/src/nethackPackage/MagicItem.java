package nethackPackage;

/**
 * Purpose: This class can create magic items.
 * @author Isaac Pugh
 * @dateCreated April 9, 2015
 * @dateModified April 9, 2015
 */
public class MagicItem extends Item {
	
	/**
	 * Parameterized Constructor
	 * @param itemName
	 * @param weight
	 */
	public MagicItem(String itemName, double weight) {
		super(itemName, weight);
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public MagicItem() {
		
	}
}
