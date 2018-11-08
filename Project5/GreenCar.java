/**
A program that contain a derived class GreenCar. A car with Fuel either Hydrogen or Electricity.
	author @ Jennifer J. Cruz Hernandez 
**/

public class GreenCar extends Car {
	
	//data members
	protected String fuelType; 
	
	//consuctor 
	public GreenCar(String model, String vehicleClass, int pollutionScore, String fuelType){
		super(model, vehicleClass, pollutionScore);
		this.fuelType = fuelType;
	}

	//get method
	public String getFuelType(){
		return this.fuelType;
	}

	//toString method which returns the properties of a GreenCar 
	public String toString() {
		return super.toString() + " Fuel Type: " + this.fuelType;
	}

}