/**
	A class to implement a LinkedList data structure and contains methods for the LinkedList.
		author @ Jennifer J. Cruz Hernandez
**/
import java.util.Arrays;

public class LinkedList{

	//data members
	private Node head;
	private Node tail;

	//constructor
	public LinkedList(){
		head = null;
		tail = null;
	}

	//addCar method takes as input a Car and inserts it into the linked list in sorted order.
	public void addSorted(Car car){
		if (head == null){
			Node newNode = new Node(car);
			newNode.setNext(head);
			head = tail = newNode;
		}else if(head.getNext() == null && (car.compareTo(head.getData()) <= 0)){
			Node newNode = new Node(car);
			newNode.setNext(head);
			head = newNode;
			tail = head.getNext();
		}else if (head.getNext() == null && (car.compareTo(head.getData()) > 0)){	
			Node newNode = new Node(car);
			tail.setNext(newNode);
			tail = newNode;
		}else{
			Node prev = head;
			Node next = head.getNext();
			while(next != null && (next.getData().compareTo(car) < 0)){ 
				prev = next;
				next = next.getNext();
			}
			Node newNode = new Node(car);
			if(prev == head && prev.getData().compareTo(car) > 0){
				newNode.setNext(head);
				head = newNode;	
			}else{
				newNode.setNext(next);
				prev.setNext(newNode);	
			}
		}
	}	

	//toString method returns a string representation of the carList.
	public String toString(){
		String result = "";
		Node current = head;
		while(current != null) {
			result += current.getData() + "\n";
			current = current.getNext();
		}
		return result;

	}

	//greenCarListString method returns a string representation of GreenCars in the carList.
	public String greenCarListString(){
		String resultString = "";
		Node current = head;
		while(current != null) {
			if (current.getData() instanceof GreenCar){
				resultString = resultString + "Model: " + current.getData().getModel() + " Fuel Type: " + ((GreenCar)current.getData()).getFuelType() + "\n";
			}
			current = current.getNext();

		}
		return resultString;
	}

	//avgMpgNum method, returns the average MPG across all GasCar objects.
	public double avgMpgNum(){
		double avgMPG = 0.0;
		int numGasCars = 0;
		Node current = head;
		while(current != null) {
			if (current.getData() instanceof GasCar){
				avgMPG = avgMPG + ((GasCar)current.getData()).getMpg();
				numGasCars++;
			}
			current = current.getNext();

		}
		
		avgMPG = avgMPG/numGasCars;
		return avgMPG;	
	}

	//avgMPGByPartialModelNum method that returns the average MPG for all cars with a model containing the partial model query String.
	public double avgMPGByPartialModelNum(String model){
		double avgMPG = 0.0;
		int numGasCars = 0;
		Node current = head;
		while(current != null) {
			if (current.getData() instanceof GasCar){
				if (current.getData().toString().contains(model)){
					avgMPG = avgMPG + ((GasCar)current.getData()).getMpg();
					numGasCars++;
				}	
			}
			current = current.getNext();

		}
		avgMPG = avgMPG/numGasCars;
		return avgMPG;
	}

	//resizeList method that resizes a array of type String
	private String[] resizeList(String[] list, int counter){
		String[] newArray = new String[list.length*2];
		for(int j = 0; j < counter; j++) {
			newArray[j] = list[j];
		}
		return newArray;
	}

	//shrinkList method that shrinks an array to its apporiate size
	private String[] shrinkList(String[] list, int counter){
		String[] finalArray = new String[counter];
		for(int i = 0; i < counter; i++){
			finalArray[i] = list[i];
		}
		return finalArray;
	}

	//a findClassesByCylindersArray method that returns a String[] containing the vehicle classes with models that have the specified number of cylinders.
	public String[] findClassesByCylindersArray(int numCylinders){
		String[] list = new String[100];
		int counter = 0;
		int index = counter;
		Node current = head;
		while(current != null) {
			if (current.getData() instanceof GasCar){
				if (((GasCar)current.getData()).getNumCylinders() == numCylinders){
					if(counter == 0){
						list[counter] = current.getData().getVehicleClass();
						counter ++;
					}
					int num = 0;	
					for (int i = 0; i < counter; i++){
						if (list[i].equals(current.getData().getVehicleClass())){
							num ++;
						}
					}
					if (num == 0){		
						if(counter >= list.length){
							list = resizeList(list, counter);
						}
						list[counter] = current.getData().getVehicleClass();
						counter ++;
					}
				}	
			}
			current = current.getNext();
		}
		list = shrinkList(list, counter);
		Arrays.sort(list);
		return list;		
	}

	//findModelsByClassAndMpgArray that returns a String[] containing the models of all vehicles of the specified class that have at least the specified combined MPG.
	public String[] findModelsByClassAndMpgArray(String vehicleClass, int minMPG){
		String[] listModel = new String[100];
		int counterModel = 0;
		Node current = head;
		while(current != null) {
			if (current.getData() instanceof GasCar){
				if (((GasCar)current.getData()).getVehicleClass().equals(vehicleClass)){
					if (((GasCar)current.getData()).getMpg() >= minMPG){
						if(counterModel >= listModel.length){
							listModel = resizeList(listModel, counterModel);
						}	
						listModel[counterModel] = current.getData().getModel();
						counterModel ++;
					}	
				}
			}
			current = current.getNext();
		}
		listModel = shrinkList(listModel, counterModel);
		return listModel;	
	}

}