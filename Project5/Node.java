/**
	A class to represent a LinkedList node containing a Car.
		author @ Jennifer J. Cruz Hernandez
**/
public class Node{

	//data members
	private Car data;
	private Node next;

	//constructor
	public Node(Car data){
		this.data = data;
		this.next = null;
	}

	//set methods
	public void setNext(Node next){
		this.next = next;
	}

	public void setData(Car data){
		this.data = data;
	}

	//get methods
	public Car getData(){
		return this.data;
	}

	public Node getNext(){
		return this.next;
	}

}
