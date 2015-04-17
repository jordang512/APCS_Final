package nethackPackage;

import java.util.*;

/**
 * Purpose: Stores spells in ArrayList that is an entity's spellbook
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 8, 2015
 */
public class Spellbook {
	
	ArrayList<Spell> spellbook;
	
	/**
	 * Parameterized Constructor
	 * @param spellbook
	 */
	Spellbook(ArrayList<Spell> spellbook) {
		this.spellbook = spellbook;
	}
	
	/**
	 * Unparameterized Constructor
	 */
	Spellbook() {
		
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