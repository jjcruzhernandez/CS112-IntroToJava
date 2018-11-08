/** A program that stores the data members for a Pokemon and impliments the Pokemon's information into one of the two constructos.
	Also contains the get and set methods for every data memeber. A method is also created to store the Pokemon's data memebers into a string.
	@author Jennifer J.Cruz Hernandez
**/

public class Pokemon {

	//data members
	private String species;
	private int experience;
	private boolean favorite;
		 

	//constructor 
	public Pokemon(String species, int experience, boolean favorite) {
		this.species = species;
		this.experience = experience;
		this.favorite = favorite;
	}
	public Pokemon(String species, int experience) {
		this.species = species;
		this.experience = experience;
		this.favorite = true;
	}

	//getters
	public String getSpecies() {
		return this.species;
	}

	public int getExperience() {
		return this.experience;
	}
	
	public boolean getFavorite() {
		return this.favorite;
	}

	//setters
	public void setSpeices(String species) {
		this.species = species;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	//other methods
	public String toString() {
		String returnValue = this.species + 
				" with Experience " + this.experience + 
				" - ";
		if (favorite == true) {
		 	returnValue += "Starred";
		 }else {
		 	returnValue += "Not Starred";
		 }
		 return returnValue;
	}
}
