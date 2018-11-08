/**
A program that will create a Pokedex by reading information about many pokemon from a text file.
@author Jennifer J.Cruz Hernandez
**/
import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Scanner;

public class PokedexBuilder {

	public Pokedex buildPokedex (String filename) {
		
		//instantiate a new Pokedex
		Pokedex newPokedexList = new Pokedex();

		//create a file with the given filename
		File inputFile = new File(filename);

		//create a new Scanner to read input from the file created
		try(Scanner input = new Scanner(inputFile)) {
			
			//specifies that Scanner will useDelimiter(",||n") 
			//indicates that the newline character as well as the comma(,) will seperate tokens read by the Scanner
			input.useDelimiter(",|\n");

			//read in the first line and ignore it
			String ignore = input.nextLine();
			
			//use the Scanner, next, and nextInt methods to read in all data from the next line
			while(input.hasNext()) {
				String id = input.next();
				String species = input.next();
				String speciesId = input.next();
				int height = input.nextInt();
				int weight = input.nextInt();
				int base_experience = input.nextInt();
				String order = input.next();
				String isDefault = input.next();
				boolean favorite = false;
				
				//create a new Pokemon containing the data specified 
				Pokemon pokemon = new Pokemon(species, height, weight, base_experience, favorite);

				//add the Pokemon to the Pokedex
				newPokedexList.addPokemon(pokemon);

			}

		//if a FileNotFoundException is generated, return null
		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
			return null;
		}
		//return the Pokedex
		return newPokedexList;
	}
}	
