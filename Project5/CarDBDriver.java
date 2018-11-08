/**
A program that will track information about a Car.
	@author Jennifer J.Cruz Hernandez
**/

public class CarDBDriver {

	public static void main(String[] args) {

		//if the file name parameter is not present, print an error message and exit the program
		if(args.length != 1) {					
				System.out.println("usage: java FileInputCSV cars.csv");
				System.exit(1);				
		}

		//set filename parameter to String filename
		String filename = args[0];

		//build a CarList object from the file cars.csv
		CarBuilder newCarList = new CarBuilder();

		//invoke the buildCarList method and save the CarList returned in a temporary variable 
		CarList tempCarList= newCarList.buildCarList(filename);

		//Print "All Cars:" followed by a newline.
		System.out.println("All Cars:");

		//Print the result of calling toString on the CarList.
		System.out.println(tempCarList.toString());

		//Print "Green Cars - Fuel Type:" followed by a newline.
		System.out.println("Green Cars - Fuel Type:");

		//Print the result of calling toStringGreenCars on the CarList.
		System.out.println(tempCarList.toStringGreenCars());

		//Print "Average MPG All:" followed by the result of calling avgMpg on the CarList followed by a newline. 
		System.out.printf("Average MPG All: %.2f\n", tempCarList.avgMpg());
		System.out.println();

		//Print "Average MPG Subaru:" followed by the result of calling avgMpgByPartialModel("SUBARU") on the CarList followed by a newline. 
		System.out.printf("Average MPG Subaru: %.2f\n", tempCarList.avgMPGByPartialModel("SUBARU"));
		System.out.println();

		//Print "Average MPG Toyota:" followed by the result of calling avgMpgByPartialModel("TOYOTA") on the CarList followed by a newline. 
		System.out.printf("Average MPG Toyota: %.2f\n", tempCarList.avgMPGByPartialModel("TOYOTA"));
		System.out.println();

		//Print "Average MPG Ferrari:" followed by the result of calling avgMpgByPartialModel("FERRARI") on the CarList followed by a newline. 
		System.out.printf("Average MPG Ferrari: %.2f\n", tempCarList.avgMPGByPartialModel("FERRARI"));
		System.out.println();

		//Print "Vehicle Classes with 4-Cylinder Cars:" followed by a newline followed by the result of calling findClassesByCylinders(4) on the CarList. 
		System.out.println("Vehicle Classes with 4-Cylinder Cars:");
		String[] temp4CylArray = tempCarList.findClassesByCylinders(4);
		for (int i = 0; i < temp4CylArray.length; i++){
			System.out.println("	" + temp4CylArray[i]);
		}
		
		//Print "Vehicle Classes with 6-Cylinder Cars:" followed by a newline followed by the result of calling findClassesByCylinders(6) on the CarList.
		System.out.println("Vehicle Classes with 6-Cylinder Cars:");
		String[] temp6CylArray = tempCarList.findClassesByCylinders(6);
		for (int j = 0; j < temp6CylArray.length; j++){
			System.out.println("	" + temp6CylArray[j]);
		}

		//Print "Small SUVs with MPG > 22:" followed by a newline followed by the result of calling findModelsByClassAndMpg("small SUV", 22) on the CarList.
		System.out.println("Small SUVs with MPG > 22:");
		String[] tempMinMPG22 = tempCarList.findModelsByClassAndMpg("small SUV", 22);
		for (int k = 0; k < tempMinMPG22.length; k++){
			System.out.println("	" + tempMinMPG22[k]);
		}

		//Print "Small Cars with MPG > 35:" followed by a newline followed by the result of calling findModelsByClassAndMpg("small car", 35) on the CarList.
		System.out.println("Small Cars with MPG > 35:");
		String[] tempMinMPG35 = tempCarList.findModelsByClassAndMpg("small car", 35);
		for (int l = 0; l < tempMinMPG35.length; l++){
			System.out.println("	" + tempMinMPG35[l]);
		}
	}
}	