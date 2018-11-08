/** 
A program that implements an abstract base class Car with the following properties: model, vehicleClass and pollutionScore. 
Also, contains a Comparable interface. 
	author @ Jennifer J. Cruz Hernandez 
**/

public abstract class Car implements Comparable<Car>{ 

	//data members
	protected String model; //coulmn Model
	protected String vehicleClass; //column Veh Class
	protected int pollutionScore; //column Air Polluction Score 

	//consuctor 
	public Car(String model, String vehicleClass, int pollutionScore){
		this.model = model;
		this.vehicleClass = vehicleClass;
		this.pollutionScore = pollutionScore;
	}

	//get methods
	public String getModel(){
		return this.model;
	}

	public String getVehicleClass(){
		return this.vehicleClass;
	}

	public int getPollutionScore(){
		return this.pollutionScore;
	}

	//parent toString
	public String toString(){
		return "Model: " + this.model + " Class: " + this.vehicleClass + " Pollution Score: " + this.pollutionScore;
	}

	//compareTo method, Car objects are sorted first by pollution score. If two Car objects have the same pollution score then they will be sorted by model.
	public int compareTo(Car other){
		if(this.pollutionScore == other.getPollutionScore()){ 
			return this.model.compareTo(other.getModel());
		}	
		return Integer.compare(this.pollutionScore,other.getPollutionScore());
	}
}