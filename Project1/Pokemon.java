/**
A program that will track information about one Pokemon.
@author Jennifer J.Cruz Hernandez
**/

public class Pokemon {

	//data members 
	private String species; // Name
	private int height; // Integer value
	private int weight; //Integer value
	private int experience; // Denote as base_expeience in the data files
	private boolean favorite; //Does NOT appear in the data file. May default to false

	//methods:

	//constructor: takes initial values for all data members 
	public Pokemon(String species, int height, int weight, int experience, boolean favorite) {
		this.species = species;
		this.height = height;
		this.weight = weight;
		this.experience = experience;
		this.favorite = favorite;
	}

	//getters: get methods for all data members
	public String getSpecies() {
		return this.species;
	}
	public int getHeight() {
		return this.height;
	}
	public int getWeight() {
		return this.weight;
	}
	public int getExperience() {
		return this.experience;
	}
	public boolean getFavorite() {
		return this.favorite;
	}

	//toString: returns a String containing data members info for each Pokemon 
	public String toString() {
		String returnValue = this.species + "(" + this.height + ", " + this.weight + ") with experience " + this.experience + " - ";
		if (favorite == true) {
			returnValue += "Starred";
		}else {
			returnValue += "Not Starred";
		}
		return returnValue; 
	}

}	
