/** A program that instantiates and prints three different Pokemon.
	@author Jennifer J.Cruz Hernandez
**/

public class PokemonDriver {

	public static void main(String[] args) {

		// Instantiate three different Pokemon.
		Pokemon n1 = new Pokemon("Zubat", 137, true);
		Pokemon n2 = new Pokemon("Snorlax", 200, false);
		Pokemon n3 = new Pokemon("Pikachu", 1000);

		// Print information about object.
		System.out.println(n1.toString());
		System.out.println(n2.toString());
		System.out.println(n3.toString());


	}

}
