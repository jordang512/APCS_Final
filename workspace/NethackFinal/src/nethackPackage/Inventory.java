package nethackPackage;

import java.util.*;

/**
 * Purpose: This class holds an entity's items.
 * @author Isaac Pugh
 * @dateCreated April 7, 2015
 * @dateModified April 7, 2015
 */
public class Inventory {
	
	private ArrayList<Item> inventory;
	
	/**
	 * Parameterized Constructor
	 * @param inventory
	 */
	public Inventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	/**
	 * Unparameterized Constructor
	 */
	public Inventory() {
		
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