/**
A program that contain a derived class GasCar. Any car that does not have a Fuel of Hydrogen or Electricity.
	author @ Jennifer J. Cruz Hernandez 
**/

public class GasCar extends Car {
	
	//data members
	protected int numCylinders; 
	protected int mpg; 

	//constructor
	public GasCar(String model, String vehicleClass, int pollutionScore, int numCylinders, int mpg){
		super(model, vehicleClass, pollutionScore);
		this.numCylinders = numCylinders;
		this.mpg = mpg;
	}

	//get methods
	public int getNumCylinders(){
		return this.numCylinders;
	}

	public int getMpg(){
		return this.mpg;
	}

	//toString method which returns the properties of a GasCar 
	public String toString() {
		return super.toString() + " MPG: " + this.mpg + " Cylinders: " + this.numCylinders;
	}
}
