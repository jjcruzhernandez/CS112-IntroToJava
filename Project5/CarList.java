/**
A program that maintains a sorted LinkedList of Car objects. As well as methods that can be invoked on the LinkedList.
	author @ Jennifer J. Cruz Hernandez 
**/

public class CarList{

	//data members
	private LinkedList carList;

	//constructor 
	public CarList(){
		this.carList = new LinkedList();
	}

	//addCar method calls addSorted method of LinkedList on carList.
	public void addCar(Car car){
		this.carList.addSorted(car);
	}

	//toString method that calls the toString method of LinkedList on carList and returns a String.
	public String toString(){
		String resultString = this.carList.toString();
		return resultString;
	}

	//toStringGreenCars that calls the greenCarListString method of LinkedList on carList and returns a String.
	public String toStringGreenCars(){
		String resultString = this.carList.greenCarListString();
		return resultString;
	}

	//avgMpg method that calls on the avgMpgNum method of LinkedList on carList and returns a double.
	public double avgMpg(){
		double avgMPG = this.carList.avgMpgNum();
		return avgMPG;			
	}

	//avgMPGByPartialModel method that calls the avgMPGByPartialModelNum method of LinkedList on carList and returns a double.
	public double avgMPGByPartialModel(String model){
		double avgMPG = this.carList.avgMPGByPartialModelNum(model);
		return avgMPG;
	}

	//a findClassesByCylinders method that calls the findClassesByCylindersArray method of LinkedList and returns String[].
	public String[] findClassesByCylinders(int numCylinders){
		String[] list = this.carList.findClassesByCylindersArray(numCylinders);
		return list;		
	}

	//findModelsByClassAndMpg method that calls the findModelsByClassandMpgArray method of LinkedList and returns String[]. 
	public String[] findModelsByClassAndMpg(String vehicleClass, int minMPG){
		String[] listModel = this.carList.findModelsByClassAndMpgArray(vehicleClass, minMPG);
		return listModel;	
	}
}