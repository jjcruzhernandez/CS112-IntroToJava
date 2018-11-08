/**
A program that will maintain a list of JavaClass objects and provide methods to find information about each object.
@author Jennifer J.Cruz Hernandez
**/
import java.util.ArrayList;
import java.util.Collections;

public class JavaClassdex {

	//data memebers
	private ArrayList<JavaClass> list; //contains valid JavaClass objects
	private ArrayList<JavaClass> invalidList; //contians invalid JavaClass objects 

	//constructor 
	public JavaClassdex() {
		this.list = new ArrayList<JavaClass>();
		this.invalidList = new ArrayList<JavaClass>();
	} 

	//a method that takes input a JavaClass object and adds it to the list in the JavaClassdex
	public void addJavaClass(JavaClass javaClass) {
		this.list.add(javaClass);
		Collections.sort(this.list);
	}

	//a method that takes input a JavaClass object and adds it to the invalidlist in the JavaClassdex
	public void addInvalidClass(JavaClass javaClass) {
			this.invalidList.add(javaClass);
		}

	//a method that returns a string representation of list
	public String toString() {
		String resultString = "";
		for (JavaClass javaClass: this.list) {
			resultString = resultString + javaClass.toString() + "\n";
		}
		return resultString;
	}

	//a method that returns a string representation of invalidList
	public String invalidClassToString() {
		String resultString = "";
		for (JavaClass javaClass: this.invalidList) {
			resultString = resultString + javaClass.getClassAbsolutePath() + "\n";
		}
		return resultString;
	}

	//a method that returns the total SLOC of all Files in list
	public int totalSLOC() { 
		int total = 0;
		for(JavaClass javaClass: this.list) {
			total = total + javaClass.getAllSLOC();
		}
		return total;
	}

	//a method that returns the total SLOC excluding comment lines of all Files in invalidList
	public int totalExcludedSLOC() { 
		int total = 0;
		for(JavaClass javaClass: this.list) {
			total = total + javaClass.getExcludedSLOC();
		}
		return total;
	}

	//a method that returns the number of Files in list 
	public int totalValidClasses() { 
		int total = 0;
		for(JavaClass javaClass: this.list) {
			total ++;
		}
		return total;
	}
}
