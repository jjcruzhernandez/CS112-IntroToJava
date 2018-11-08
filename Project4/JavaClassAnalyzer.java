/** 
This class will contain the main method.
	author @ Jennifer J. Cruz Hernandez
**/
import java.util.ArrayList;
import java.io.File;

public class JavaClassAnalyzer {

	//main method
	public static void main(String[] args) {

		//if the absolute path parameter is not present, print an error message and exit the program
		if(args.length != 1) {					
				System.out.println("usage: java JavaClassAnalyzer <absolute_path>");
				System.exit(1);				
		}

		//create a string of the input absolute path
		String dir = args[0];

		//create string dir into File object 
		File directory = new File(dir);

		//create a new JavaClassFileList
		JavaClassFileList list = new JavaClassFileList();

		//call findFiles method on JavaClassFileList object that will add all File objects into the JavaClassFileList
		list = list.findFiles(directory, list);

		//create a new JavaClassBuilder
		JavaClassBuilder newJavaClassBuilder = new JavaClassBuilder();

		//invoke the buildJavaClassdex method and save the JavaClassdex returned in a temporary variable 
		JavaClassdex tempJavaClassdex= newJavaClassBuilder.buildJavaClassdex(list);

		//display the string "Valid Classes - Total: "
		System.out.println("Valid Classes - Total: " + tempJavaClassdex.totalValidClasses());

		//use the tempJavaClassdex.toString method to display data memeber list of JavaClassdex
		System.out.println(tempJavaClassdex.toString());

		//display the string "Total SLOC: " with the total number of SLOC all Files using the totalSLOC method
		System.out.println("Total SLOC: " + tempJavaClassdex.totalSLOC());

		//display the string "Total SLOC (excluding comments): " with the total number of SLOC excluding comments all Files using the totalExcludedSLOC method
		System.out.println("Total SLOC (excluding comments): " + tempJavaClassdex.totalExcludedSLOC());

		//display the string "Invalid JavaClass:"
		System.out.println("Invalid JavaClass:");

		//use the tempJavaClassdex.invalidClassToString method to display data memeber invalidList of JavaClassdex
		System.out.println(tempJavaClassdex.invalidClassToString());
 	}
}
