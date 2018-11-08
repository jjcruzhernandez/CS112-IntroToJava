/** A program that instantiates and prints three different Pokemon.
	@author Jennifer J.Cruz Hernandez
**/

public class PokemonTest {

	public static void main(String[] args) {

		Pokedex list = new Pokedex();
		Pokemon p1 = new Pokemon("Zubat", 13, 600, 137, true);
		list.addPokemon(p1);
		System.out.println(list.toString());
		System.out.println("\n*****\n");
		Pokemon p2 = new Pokemon("Snorlax", 8, 30, 200, false);
		Pokemon p3 = new Pokemon("Pikachu", 10, 140, 1000);
		list.addPokemon(p2);
		list.addPokemon(p3);
		System.out.println(list.toString());
		System.out.println(list.averageHeight());
		System.out.println(list.averageWeight());
		System.out.println(list.averageExperience());
		System.out.println(list.smallest());
		System.out.println(list.tallest());
		System.out.println("\n*****\n");
		System.out.println(list.mostExperience(150));


		// Instantiate three different Pokemon.
		//Pokemon n1 = new Pokemon("Zubat", 13, 600, 137, true);
		//Pokemon n2 = new Pokemon("Snorlax", 8, 30, 200, false);
		//Pokemon n3 = new Pokemon("Pikachu", 10, 140, 1000);

		// Print information about object.
		//System.out.println(n1.toString());
		//System.out.println(n2.toString());
		//System.out.println(n3.toString());

		
	}

}
