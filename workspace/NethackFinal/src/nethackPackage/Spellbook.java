package nethackPackage;

import java.util.*;

/**
 * Purpose: Stores spells in ArrayList that is an entity's spellbook
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 16, 2015
 */
public class Spellbook {
	
	ArrayList<Spell> spellbook;
	
	/**
	 * Parameterized Constructor
	 * @param spellbook is an ArrayList of Spell that holds the spells a player currently has/can use.
	 */
	Spellbook(ArrayList<Spell> spellbook) {
		this.spellbook = spellbook;
	}
	
	/**
	 * Unparameterized Constructor
	 */
	Spellbook() {
		spellbook = new ArrayList<Spell>();
	}

	/**
	 * Getters and Setters
	 */
	public ArrayList<Spell> getSpellbook() {
		return spellbook;
	}

	public void setSpellbook(ArrayList<Spell> spellbook) {
		this.spellbook = spellbook;
	}
}