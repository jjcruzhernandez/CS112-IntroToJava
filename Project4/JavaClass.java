/** 
This class will maintain a list of all the individual objects (java files).
	author @ Jennifer J. Cruz Hernandez
**/
import java.util.Collections;
public class JavaClass implements Comparable<JavaClass> {

	//data members 
	private int allSLOC; //all SLOC lines
	private int excludedSLOC; //SLOC with out comments
	private String classAbsolutePath; //absoulte path of class 
	private String className; //className of file

	//constructor
	public JavaClass(int allSLOC, int excludedSLOC, String classAbsolutePath, String className) {
		this.allSLOC = allSLOC;
		this.excludedSLOC = excludedSLOC;
		this.classAbsolutePath = classAbsolutePath;
		this.className = className;
	}

	//getters
	public int getAllSLOC() {
		return this.allSLOC;
	}
	public int getExcludedSLOC() {
		return this.excludedSLOC;
	}
	public String getClassAbsolutePath() {
		return this.classAbsolutePath;
	}
	public String getClassName() {
		return this.className;
	}

	//toString method that returns a String representation of JavaClass object
	public String toString() {
		String returnValue = "Class: " + this.className + " [" + this.classAbsolutePath + "]" + "\n" + "	SLOC: " + this.allSLOC + "\n" + "	SLOC (excluding comments): " + this.excludedSLOC;
		return returnValue;
	}

	//sorts JavaClass file by the total number of SLOC
	public int compareTo(JavaClass other) {	
		return Integer.compare(this.allSLOC, other.getAllSLOC());
	}
}	
