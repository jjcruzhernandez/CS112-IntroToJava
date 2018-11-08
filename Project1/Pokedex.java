/**
A program that will maintain a list of Pokemon and provide methods to find information about the collection of Pokemon,
including the average experience level, the tallest pokemone, and a list of the most experienced pokemon.
@author Jennifer J.Cruz Hernandez
**/
import java.util.ArrayList;

public class Pokedex {

	//data memebers
	private ArrayList<Pokemon> list;

	//methods: 

	//default constructor 
	public Pokedex() {
		this.list = new ArrayList<Pokemon>();
	} 

	//takes input a Pokemon object and adds it to the ArrayList of pokemon in the Pokedex
	public void addPokemon(Pokemon pokemon) {
		this.list.add(pokemon);
	}

	//returns a string representation of the Pokedex
	public String toString() {
		String resultString = "";

		for (Pokemon pokemon: this.list) {
			resultString = resultString + pokemon.toString() + "\n";
		}

		return resultString;
	}

	//returns the average height of all Pokemon in the pokedex
	public double averageHeight() { 
		double total = 0;

		for(Pokemon pokemon:this.list) {
			total = total + pokemon.getHeight();
		}
		double averageHeight = total / this.list.size();
		return averageHeight;
	}

	//returns the avgerage weight of all Pokemon in Pokedex
	public double averageWeight() { 
		double total = 0;

		for(Pokemon pokemon:this.list) {
			total = total + pokemon.getWeight();
		}
		double averageWeight = total / this.list.size();
		return averageWeight;
	}

	//returns the avgerage experience of all Pokemon in Pokedex
	public double averageExperience() { 
		double total = 0;

		for(Pokemon pokemon:this.list) {
			total = total + pokemon.getExperience();
		}
		double averageExperience = total / this.list.size();
		return averageExperience;
	}

	//returns the species of the Pokemon with the largest height
	public String tallest() { 
		int tallest = this.list.get(0).getHeight();
		String speciesTallest = this.list.get(0).getSpecies();;
		for (int i = 0; i < this.list.size(); i++) {
			if (tallest < this.list.get(i).getHeight()) {
				tallest = this.list.get(i).getHeight();
				speciesTallest = this.list.get(i).getSpecies();
			}
		}
		return speciesTallest; 
	}

	//returns the species of the Pokemon with the smallest weight
	public String smallest() { 
		int smallest = this.list.get(0).getWeight();
		String speciesSmallest = list.get(0).getSpecies();
		for (int i = 0; i < this.list.size(); i++) {
			if (smallest > this.list.get(i).getWeight()) {
				smallest = this.list.get(i).getWeight();
				speciesSmallest = this.list.get(i).getSpecies();
			}
		}
		return speciesSmallest; 
	}

	//takes as input an experience level and returns a list of all Pokemon with expeierence level GREATER THAN the level as input
	public ArrayList<Pokemon> mostExperience(int level) {  
		ArrayList<Pokemon> mostExperienceList = new ArrayList<Pokemon>();
		for (int i = 0; i < this.list.size(); i++) {
			if (level < this.list.get(i).getExperience()){
				mostExperienceList.add(this.list.get(i));
			}
		}
		return mostExperienceList;
	}

}
