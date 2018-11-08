/**
A program that will create a CarList by reading information about many cars from a text file.
	@author Jennifer J.Cruz Hernandez
**/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CarBuilder {

	public CarList buildCarList (String filename) {
		
		//instantiate a new CarList
		CarList newCarList = new CarList();

		//create a file with the given filename
		File inputFile = new File(filename);

		//create a new Scanner to read input from the file created
		try(Scanner input = new Scanner(inputFile)) {

			//read in the first line and ignore it
			String ignore = input.nextLine();
			
			//use the Scanner to read in all data from the next line
			while(input.hasNext()) {
				String string = input.nextLine();
				String[] stringCol = string.split(",");
				String model = stringCol[0];
				String vehicleClass = stringCol[10];
				int pollutionScore = Integer.parseInt(stringCol[11]);
				int numCylinders = 0;
				if (!stringCol[2].equals("N/A")){
					numCylinders = Integer.parseInt(stringCol[2]);
				}
				String mpgString = stringCol[14];
				String[] mpgList = mpgString.split("/");
				int mpg = Integer.parseInt(mpgList[0]);
				String fuelType = stringCol[5];
				
				//create a new greenCar containing the data specified 
				if (fuelType.equals("Hydrogen") || fuelType.equals("Electricity")){
					Car greenCar = new GreenCar(model, vehicleClass, pollutionScore, fuelType);
					//add the greenCar to the carList
					newCarList.addCar(greenCar);
				} else {	
					//create a new gasCar containing the data specified 
					Car gasCar = new GasCar(model, vehicleClass, pollutionScore, numCylinders, mpg);
					//add the gasCar to the carList
					newCarList.addCar(gasCar);
				}	
			}

		//if a FileNotFoundException is generated, return null
		} catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
			return null;
		}
		//return the newCarList
		return newCarList;
	}
}	
