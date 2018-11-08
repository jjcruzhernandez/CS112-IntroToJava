/**
A program that will create a JavaClassdex.
@author Jennifer J.Cruz Hernandez
**/
import java.io.File;
import java.util.ArrayList;

public class JavaClassFileList {

	//data memeber
	private ArrayList<File> list;

	//constructor 
	public JavaClassFileList() {
		this.list = new ArrayList<File>();
	} 

	//a method that takes input a File object and adds it to list
	public void addJavaClass(File file) {
		this.list.add(file);
	}

	//a method that returns the size/length of list 
	public int size() {
		return this.list.size();
	}

	//a method that returns the File at a certain index
	public File get(int i) {
		return this.list.get(i);
	}

	//a method that returns a string representation of the JavaClassFileList
	public String toString() {
		String resultString = "";
		for (File file: this.list) {
			resultString = resultString + file.getName() + "\n";
		}
		return resultString;
	}

	//method takes as input a File representing the absolute path to a directory and JavaClassFileList
	//then recursively finds all Java files in a specified directory and adds them to the JavaClassFileList
	public static JavaClassFileList findFiles(File input, JavaClassFileList list) {
		if(input.isFile()) {
			String filename = input.getName();
			if (filename.endsWith(".java")) {
				list.addJavaClass(input);
			}	
		} else if(input.isDirectory()) {		
			File[] children = input.listFiles();
			for(File f: children) {
				findFiles(f, list);	
			}
		}
		return list;
	}
}		
