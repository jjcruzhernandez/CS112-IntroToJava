public class LinkedListDriver{

	public static void main (String[] args){

		LinkedList list = new LinkedList();
		list.addAtHead(1);
		list.addAtHead(2);
		list.addAtHead(9);
		System.out.println("Sum: " + list.sum());
		list.set(3,3);
		System.out.println(list.toString());
		list.printElementsBackwards();
	}
}
