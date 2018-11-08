/**
A program prints out numbers in increasing then decending order through recursion.
	author @ Jennifer J. Cruz Hernandez 
**/

public class NumberPrinter {

	//method to print a single row  
	public static void printRow(int n, int count){
		if(count == n){
			System.out.println(n);
			return;
		}
		System.out.print(count);
		printRow(n, count+1);	
	}

	//helper method
	public static void printNums(int n){
		printNums(0,n);
	}

	//method that is called by main and prints the entire structure
	public static void printNums(int n, int count){
		if(count == n ){
			printRow(n,0);
			return;
		}
		printRow(n,0);
		printNums(n +1, count);
		printRow(n,0);	
	}

	//main method
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("usage: java NumberPrinter <int>");
			System.exit(1);
		}
		int n = Integer.parseInt(args[0]);
		printNums(n);	
	}
}
