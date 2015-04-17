package nethackPackage;

import java.util.*;

/**
 * Purpose: This class hold the map in everything in it.
 * @author Isaac Pugh
 * @dateCreated April 7, 2015
 * @dateModified April 7, 2015
 */
public class Map {
	
	ArrayList<Layer> Layers;
	
	/**
	 * Parameterized Constructor
	 * @param Layers
	 */
	public Map(ArrayList<Layer> Layers) {
		this.Layers = Layers;
	}

	/**
	 * Unparameterized Constructor
	 */
	public Map() {
		
	}
	
	/**
	 * Getters and Setters
	 */
	public ArrayList<Layer> getLayers() {
		return Layers;
	}

	public void setLayers(ArrayList<Layer> layers) {
		Layers = layers;
	}
}