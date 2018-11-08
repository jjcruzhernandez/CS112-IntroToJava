/**
A program creates a HashMap that maps String objects representing file extensions 
(e.g., jpg or doc) to a count of the number of files found with that extension in the directory passed using recursion.
	author @ Jennifer J. Cruz Hernandez 
**/

import java.io.File;
import java.util.HashMap;

public class FileFinder{

	//method that creates a HashMap that will map String objects representing file extensions (e.g., jpg or doc) to a count of the number of files found with that extension
	public static HashMap<String, Integer> findFiles(String directory){
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		findFiles(new File(directory), result);
		return result;
	}

	//method takes as input a String representing the absolute path to a directory and recursively traverses the directory and all directories below it
	private static void findFiles(File input, HashMap<String, Integer> result){
		if(input.isFile()){
			String filename = input.getName();
			if (filename.contains(".")){
				int index = filename.lastIndexOf(".") + 1;
				String extension = filename.substring(index, filename.length());
				if (filename.contains(extension)){
					if(!result.containsKey(extension)){
						result.put(extension, 1);
					} else {
						result.put(extension, result.get(extension)+1);
					}
				}
			}	
		} else if(input.isDirectory()){		
			File[] children = input.listFiles();
			for(File f: children){
				findFiles(f, result);	
			}
		}

	}

	//main method will call a method findFiles HasMap and then print the contents of the HashMap
	public static void main(String[] args){
		String string = args[0];
		HashMap<String, Integer> result = findFiles(string);

		for(String key: result.keySet()){
			System.out.println(key + ": " + result.get(key));
		}
	}
}
