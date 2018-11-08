/**
A program that will track information about one Pokemon.
@author Jennifer J.Cruz Hernandez
**/

import java.util.ArrayList;

public class PokemonDriver {

	//implement the main method
	public static void main(String[] args) {

		//if the file name parameter is not present, print an error message and exit the program
		if(args.length != 1) {					
				System.out.println("usage: java FileInputCSV pokemon.csv");
				System.exit(1);				
		}

		String filename = args[0];

		//create a new PokedexBuilder 
		PokedexBuilder newPokedexBuilder = new PokedexBuilder();

		//invoke the buildPokedex method and save the Pokedex returned in a temporary variable 
		Pokedex tempPokedex= newPokedexBuilder.buildPokedex(filename);

		//if the Pokedex is null(ex. because the file was not found), print an error message and exit the program
		if (tempPokedex == null) {
			System.out.println("error: Pokedex is null.");
			System.exit(1);
		}

		//display the string "ALL Pokemon:""
		System.out.println("ALL Pokemon:");

		//use the Pokedex.toString method to display the entire Pokedex
		System.out.println(tempPokedex.toString());

		//display the result of the averageHeight method in a string
		System.out.println("Average Height: " + tempPokedex.averageHeight());

		//display the result of the averageWeight method in a string
		System.out.println("Average Weight: " + tempPokedex.averageWeight());

		//display the result of the averageExperience method in a string
		System.out.println("Avergae Experience: " + tempPokedex.averageExperience());

		//display the result of the tallest method in a string
		System.out.println("Tallest of Species: " + tempPokedex.tallest());

		//display the result of the smallest method in a string
		System.out.println("Smallest of Species: " + tempPokedex.smallest());

		//display the string "Pokemon with experience greater than <level>:"
		System.out.println("Pokemon with experience greater than 200: ");

		//use iteration and the Pokemon.toString method to display info about all Pokemon returned by the mostExperienced method
		ArrayList<Pokemon> mostExperienceResultList = new ArrayList<Pokemon>();
		mostExperienceResultList = tempPokedex.mostExperience(200);
		for (int i = 0; i < mostExperienceResultList.size(); i++) {
			System.out.println(mostExperienceResultList.get(i));
		}
	}
}
