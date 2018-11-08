/**
A program that will create a JavaClassdex.
@author Jennifer J.Cruz Hernandez
**/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaClassBuilder {

	//a methos that creates the JavaClassdex
	public JavaClassdex buildJavaClassdex(JavaClassFileList fileList) {
		
		//create a new JavaClassdex
		JavaClassdex newJavaClassList = new JavaClassdex();
		
		for(int i=0; i < fileList.size(); i++) {	
			String className = fileList.get(i).getName();
			String classAbsolutePath = fileList.get(i).getAbsolutePath();
			int allSLOC = 0;
			int excludedSLOC = 0;
			boolean incomment = false;
			String s = " class " + className.substring(0, (className.length() - 5)) +" "; 
			boolean validClass = false; 

			//create a new Scanner to read input from the file created
			try(Scanner input = new Scanner(fileList.get(i))) {

				//use the nextLine methods to read and count SLOC. As well as determine if it s a comment or not. 
				while(input.hasNext()) {
					String line = input.nextLine();
					line = line.trim();
					allSLOC++;
					if (line.startsWith("//")) {
						excludedSLOC ++;
					}else if (!incomment && (line.startsWith("/*") || line.startsWith("/**"))) {
						excludedSLOC ++;
						incomment = true;
					}else if(incomment && (line.endsWith("*/") || line.endsWith("**/"))) {
						excludedSLOC ++;
						incomment = false;	
					}else if(incomment && !(line.startsWith("/*") || line.startsWith("/**")) && !(line.endsWith("*/") || line.endsWith("**/"))) {
						excludedSLOC ++;	
					}
					//checks if File is valid or invalid
					if (!incomment && line.contains(s)) { 
						validClass = true;
					}
			}
			//a variable that represents the total number of SLOC excluding comments 		
			int total = 0;
			total = allSLOC - excludedSLOC;	

			//create a new JavaClass containing the data specified 
			JavaClass javaClass = new JavaClass(allSLOC, total, classAbsolutePath, className);
			
			//add the JavaClass to the JavaClassdex 
			if(validClass == true){ //valid class
				newJavaClassList.addJavaClass(javaClass);
			}else{	//invalid class
				newJavaClassList.addInvalidClass(javaClass);
			}		

			//if a FileNotFoundException is generated, return null
			}catch(FileNotFoundException fnf){
				System.out.println(fnf.getMessage());
				return null;
			}
		}
		return newJavaClassList;
	}
}	
