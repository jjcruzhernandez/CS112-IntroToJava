/**
A program that will print the input word and whether is or is not a palindrome (same word backwards) using recursion.
	author @ Jennifer J. Cruz Hernandez 
**/

public class PalindromeTester{

	//main method will print the word and whether is or is not a palindrome (same word backwards)
	public static void main(String[] args){
		if (args.length != 1) {
			System.out.println("usage: java PalindromeTester <word>");
			System.exit(1);
		}
		String word = args[0];
		System.out.println("Word:" + word);
		boolean result = isPalindrome(word);
		if (result == true){
			System.out.println("The word is a palindrome.");
		}else{
			System.out.println("The word is not a palindrome.");
		}
	}

	//method takes as input a word and returns true if it is a palindrome and false otherwise 
	public static boolean isPalindrome(String word){
		if (word.charAt(0) == word.charAt(word.length()-1)){
			isPalindrome(word.substring(1, word.length()-2));
			return true; 
		}
		return false;
	}
}
