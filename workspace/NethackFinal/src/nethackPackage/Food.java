package nethackPackage;

/**
 * Purpose: This class can create different types of food.
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 8, 2015
 */
public class Food extends Item {
	
	private int hitPointsRecovered;
	private boolean isPoisionous;
	
	/**
	 * Parameterized Constructor
	 * @param itemName
	 * @param weight
	 * @param hitPointsRecovered
	 * @param isPoisionous
	 */
	public Food(String itemName, double weight, int hitPointsRecovered, boolean isPoisionous) {
		super(itemName, weight);
		this.hitPointsRecovered = hitPointsRecovered;
		this.isPoisionous = isPoisionous;
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

	public boolean isPoisionous() {
		return isPoisionous;
	}

	public void setPoisionous(boolean isPoisionous) {
		this.isPoisionous = isPoisionous;
	}
}