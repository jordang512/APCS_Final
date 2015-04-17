package nethackPackage;

/**
 * Purpose: This class can create different types of food.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Food extends Item {
	
	private int hitPointsRecovered;
	private boolean isPoisonous;
	
	/**
	 * Parameterized Constructor
	 * @param itemName is a String that holds the name of the food.
	 * @param weight is a double that holds the weight of the food.
	 * @param hitPointsRecovered is an int that holds the amount of hitPoints recovered from eating the food.
	 * @param isPoisionous is a boolean that describes the food as being or not being poisonous.
	 */
	public Food(String itemName, double weight, int hitPointsRecovered, boolean isPoisonous) {
		super(itemName, weight);
		this.hitPointsRecovered = hitPointsRecovered;
		this.isPoisonous = isPoisonous;
	}

	/**
	 * Unparameterized Constructor
	 */
	public Food() {
		
	}
	
	/**
	 * Getters and Setters
	 */
	public int getHitPointsRecovered() {
		return hitPointsRecovered;
	}

	public void setHitPointsRecovered(int hitPointsRecovered) {
		this.hitPointsRecovered = hitPointsRecovered;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}
}