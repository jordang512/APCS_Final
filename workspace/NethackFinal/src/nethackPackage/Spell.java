package nethackPackage;

/**
 * Purpose: This is where spells are made
 * @author Isaac Pugh
 * @dateCreated April 8, 2015
 * @dateModified April 8, 2015
 */
public class Spell {
	
	private int damage;
	private int range;
	private int pointCost;
	private int DC;
	private String[] statusEffect;
	private String element;
	
	/**
	 * Parameterized Constructor
	 * @param damage
	 * @param range
	 * @param pointCost
	 * @param DC
	 * @param statusEffect
	 * @param element
	 */
	public Spell(int damage, int range, int pointCost, int DC, String[] statusEffect, 
			String element) {
		this.damage = damage;
		this.range = range;
		this.pointCost = pointCost;
		this.DC = DC;
		this.statusEffect = statusEffect;
		this.element = element;
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public Spell() {
		
	}
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getPointCost() {
		return pointCost;
	}

	public void setPointCost(int pointCost) {
		this.pointCost = pointCost;
	}

	public int getDC() {
		return DC;
	}

	public void setDC(int dC) {
		DC = dC;
	}

	public String[] getStatusEffect() {
		return statusEffect;
	}

	public void setStatusEffect(String[] statusEffect) {
		this.statusEffect = statusEffect;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}
}