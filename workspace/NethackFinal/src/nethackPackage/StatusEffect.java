package nethackPackage;

/**
 * Purpose: This class can create status effects.
 * @author Isaac Pugh
 * @dateCreated April 13, 2015
 * @dateModified April 16, 2015
 */
public class StatusEffect {
	
	private String effect;
	private int duration;
	
	/**
	 * Parameterized Constructor
	 * @param effect is a String that describes the effect the effect causes.
	 * @param duration is an int that describes how many turns the effect will last.
	 */
	public StatusEffect(String effect, int duration) {
		this.effect = effect;
		this.duration = duration;
	}
	
	/**
	 * Unparameterized Constructor
	 */
	public StatusEffect() {
		
	}

	/**
	 * Getters and Setters
	 */
	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}
