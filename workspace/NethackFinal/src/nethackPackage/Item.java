package nethackPackage;

/**
 * Purpose: This class is every item in the game: weapons, food, unicorn horns, etc.
 * @author Isaac Pugh
 * @dateCreated April 7, 2015
 * @dateModified April 7, 2015
 */
public class Item {

	private String itemName;
	private double weight;
	
	/**
	 * Parameterized Constructor
	 * @param itemName
	 * @param weight
	 */
	public Item(String itemName, double weight) {
		this.itemName = itemName;
		this.weight = weight;
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Item() {
		
	}

	/**
	 * Getters and Setters
	 */
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}