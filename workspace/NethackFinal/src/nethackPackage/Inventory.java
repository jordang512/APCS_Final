package nethackPackage;

import java.util.*;

/**
 * Purpose: This class holds an entity's items.
 * @author Isaac Pugh
 * @dateCreated April 7, 2015
 * @dateModified April 16, 2015
 */
public class Inventory {
	
	private ArrayList<Item> inventory;
	
	/**
	 * Parameterized Constructor
	 * @param inventory is an ArrayList of Item that holds items.
	 */
	public Inventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	/**
	 * Unparameterized Constructor
	 */
	public Inventory() {
		inventory = new ArrayList<Item>();
	}
	
	/**
	 * Finds the total weight of the inventory.
	 * @return the total weight of the items in the inventory.
	 */
	public double getTotalWeight() {
		int totalWeight = 0;
		for (int i = 0; i < inventory.size(); i++)
			totalWeight += inventory.get(i).getWeight();
		return totalWeight;
	}
	
	/**
	 * Getters and Setters
	 */
	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}
}