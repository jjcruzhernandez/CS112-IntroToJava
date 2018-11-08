/**
A program that maintains a sorted array of Car objects. As well as methods that can be invoked on the array.
	author @ Jennifer J. Cruz Hernandez 
**/

import java.util.Arrays;

public class CarList{

	//data members
	private Car[] carList;
	private int count;

	//constructor 
	public CarList(){
		carList = new Car[100]; //change 100
		count = 0;
	}

	//resize method for Car array
	private void resize(){
		Car[] newArray = new Car[carList.length*2];
		for(int i = 0; i < carList.length; i++) {
			newArray[i] = carList[i];
		}
		carList = newArray;
	}

	//resizeList method that resizes a array of type String
	private String[] resizeList(String[] list, int counter){
		String[] newArray = new String[list.length*2];
		for(int j = 0; j < counter; j++) {
			newArray[j] = list[j];
		}
		return newArray;
	}

	//shrinkAllCarsArray method that shrinks an array to its apporiate size for Car array
	private void shrinkAllCarsArray(){
		Car[] finalAllCarsArray = new Car[count];
		for(int i = 0; i < count; i++){
			finalAllCarsArray[i] = this.carList[i];
		}
		this.carList = finalAllCarsArray;
	}

	//shrinkList method that shrinks an array to its apporiate size
	private String[] shrinkList(String[] list, int counter){
		String[] finalArray = new String[counter];
		for(int i = 0; i < counter; i++){
			finalArray[i] = list[i];
		}
		return finalArray;
	}

	//addCar method takes as input a Car and inserts it into the array in sorted order.
	public void addCar(Car car){
		int index = count;
		if(count >= carList.length) {
			resize();
		}
		if (count == 0){
			carList[count] = car;
			count ++;
		}
		else {
			for(int i = count-1; i > -1; i--){
				if (car.compareTo(carList[i]) < 0){
					index = i;
					carList[i+1] = carList[i];
				}	
			}
			carList[index] = car;
			count ++;
		}
	}

	//toString method that returns a String representation of the entire database. 
	public String toString(){
		shrinkAllCarsArray();
		String resultString = "";
		for (Car car: this.carList){
			resultString = resultString + car.toString() + "\n";
		}
		return resultString;
	}

	//toStringGreenCars method which return a String representation of the GreenCar objects in the list.
	public String toStringGreenCars(){
		String resultString = "";
		for (Car car: this.carList){
			if (car instanceof GreenCar){
				resultString = resultString + "Model: " + car.getModel() + " Fuel Type: " + ((GreenCar)car).getFuelType() + "\n";
			}
		}
		return resultString;
	}

	//avgMpg method, returns the average MPG across all GasCar objects.
	public double avgMpg(){
		double avgMPG = 0.0;
		int numGasCars = 0;
		for (Car car: this.carList) {
			if (car instanceof GasCar){
				avgMPG = avgMPG + ((GasCar)car).getMpg();
				numGasCars ++;
			}
		}
		avgMPG = avgMPG/numGasCars;
		return avgMPG;			
	}

	//avgMPGByPartialModel emthod that returns the average MPG for all cars with a model containing the partial model query String.
	public double avgMPGByPartialModel(String model){
		double avgMPG = 0.0;
		int numGasCars = 0;
		for (Car car: this.carList){
			if (car instanceof GasCar){
				if (car.toString().contains(model)){
					avgMPG = avgMPG + ((GasCar)car).getMpg();
					numGasCars ++;
				}
			}
		}
		avgMPG = avgMPG/numGasCars;
		return avgMPG;
	}

	//a findClassesByCylinders method that returns a String[] containing the vehicle classes with models that have the specified number of cylinders.
	public String[] findClassesByCylinders(int numCylinders){
		String[] list = new String[100];
		int counter = 0;
		int index = counter;
		for (Car car: this.carList){
			if (car instanceof GasCar){
				if (((GasCar)car).getNumCylinders() == numCylinders){
					if(counter == 0){
						list[counter] = car.getVehicleClass();
						counter ++;
					}
					int num = 0;	
					for (int i = 0; i < counter; i++){
						if (list[i].equals(car.getVehicleClass())){
							num ++;
						}
					}
					if (num == 0){		
						if(counter >= list.length){
							list = resizeList(list, counter);
						}
						list[counter] = car.getVehicleClass();
						counter ++;
					}
				}
			}
		}
		list = shrinkList(list, counter);
		Arrays.sort(list);
		return list;		
	}

	//findModelsByClassAndMpg that returns a String[] containing the models of all vehicles of the specified class that have at least the specified combined MPG. 
	public String[] findModelsByClassAndMpg(String vehicleClass, int minMPG){
		String[] listModel = new String[100];
		int counterModel = 0;
		for (Car car: this.carList){
			if (car instanceof GasCar){
				if (((GasCar)car).getVehicleClass().equals(vehicleClass)){
					if (((GasCar)car).getMpg() >= minMPG){
						if(counterModel >= listModel.length){
							listModel = resizeList(listModel, counterModel);
						}	
						listModel[counterModel] = car.getModel();
						counterModel ++;
					}	
				}
			}
		}
		listModel = shrinkList(listModel, counterModel);
		return listModel;	
	}
}
