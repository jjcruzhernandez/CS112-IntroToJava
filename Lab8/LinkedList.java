/**
	A class to implement a LinkedList data structure
**/
public class LinkedList {

	private Node head;
	private Node tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	/**
		Add a new node at the head (beginning) of the list.
	**/
	public void addAtHead(Integer data) {

		Node newNode = new Node(data);
		newNode.setNext(head);
		head = newNode;

		//if we are adding to an empty list
		if(tail == null) {
			//update tail
			tail = newNode;
		}

	}

	/**
		Add a new node at the tail (end) of the list.
	**/		
	public void addAtTail(Integer data) {
		Node newNode = new Node(data);

		//special case: list is empty
		if(head == null) {
			head = tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}


	}	

	/**
	public int sum() - returns the sum of all Integer data in the list
	**/
	public int sum(){
		Node current = head;
		int sum = 0;
		while (current!= null){
			sum += current.getData();
			current = current.getNext();
		}
		return sum;
	}

	/**
	public void set(Integer data, int index) - 
	takes as input a new data item and an index and sets the data in the Node at index index to be that value. 
	set(3, 0) would change the data in the first Node in the list to be the value 3. 
	Note that you cannot access an element by its index so you will need to find the appropriate Node using a counter variable.
	**/
	public void set(Integer data, int index){
		Node current = head;
		for(int i = 0; (i < index && current.getNext() != null); i++){
			current = current.getNext();
		}
		current.setData(data);
	}

	/**
	public void printElementsBackwards() - prints the list backwards. 
	You are required to make this method recursive. Do not modify the signature of this method, however you may use a helper method.
	**/
	public void printElementsBackwards(){
		printElementsBackwards(head);
	}

	private void printElementsBackwards(Node current){
		if (current == null){
			return;
		}
		printElementsBackwards(current.getNext());
		System.out.println(current.getData());

	}

	/**
		Return a string representation of the list.
	**/
	public String toString() {

		String result = "";

		Node current = head;

		while(current != null) {
			result += current.getData() + " \n";
			current = current.getNext();			
		}
		return result;
	}
}
