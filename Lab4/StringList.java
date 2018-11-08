/**
Implements program using arrays.
author @ Jennifer J. Cruz Hernandez
**/


/**
	A class providing ArrayList-like functionality for a list of String objects.
**/
public class StringList {

	//declare data members to hold an array of strings and an
	//int to keep track of the number of items in the list
	private String[] list; 
	private int count;

	/**
		A constructor that takes no input and instantiates a new
		String[] of size 10.
	**/
	public StringList() {

		list = new String[10];
		count = 0;
	}

	/**
		A constructor that takes a size and instantiates a new
		String[] of size size.
	**/
	public StringList(int size) {

		list = new String[size];
		count = 0;

	}

		/**
		Private method as it will not be invoked anywhere outside of
		the class. 
		Method will create a new array of twice the size and copy over
		all elements of the existing array.
	**/
	private void resize() {

		String[] newArray = new String[list.length*2];

		for(int i = 0; i < list.length; i++) {
			newArray[i] = list[i];
		}
		list = newArray;

	}

	/**
		Adds the new item s to the end of the array 
		and returns true. In case the array is full, 
		it will be resized by creating new array of 
		twice the size and copying all elements to 
		the new array.
	**/
	public boolean add(String s)  {

		if(count >= list.length) {
			resize();
		}

		list[count] = s;
		count ++;

		return true;

	}
	
	/**
		Adds the new item to the array at the location 
		specified by index, in case the array is full, 
		it will be resized by creating new array of 
		twice the size and copying all elements to the
		new array.
		Will throw an IndexOutOfBoundsException if the
		index is out of range.
	**/
	public void add(int index, String s) {

			if (index > count) {
				IndexOutOfBoundsException exp = new IndexOutOfBoundsException("No items in list.");
				throw exp;
			}

			if(count >= list.length) {
			resize();
			}

			for(int i = count; i > index; i--) {
			list[i] = list[i-1];
			}

			list[index] = s;
			count ++;

	}

	/**
		Returns true if the array contains the string s
		and false otherwise.
	**/
	public boolean contains(String s) {

		for(int i = 0; i < count-1; i++){
			if (list[i] == s) {
				return true;
			}
		}
		return false;
	}

	/**
		Returns true if there are no elements in the array
		and false otherwise.
	**/
	public boolean isEmpty() {

		if (count == 0) {
			return true;
		}
		return false;
	}

	/**
		Returns the number of elements in the array. Note this
		is not the total number of spaces in the array, but 
		the total number of valid elements.
	**/
	public int size() {

		return count;
	}

	/**
		Returns the first index of the given String,
		or -1 if not found.
	**/
	public int indexOf(String s) {

		for(int i = 0; i < count-1; i++){
			if (list[i] == s) {
				return i;
			}
		}
			
		return -1;
	}

	/**
		Returns the last index of the given String, 
		or -1 if not found.
	**/
	public int lastIndexOf(String s) {
	
		for(int i = count; i > 0; i--){
			if (list[i] == s) {
				return i;
			}
		}
			
		return -1;
	}

	/**
		Returns the String at the given index, 
		may throw IndexOutOfBounds exception.
	**/
	public String get(int index) {
		
		if (index > count) {
				IndexOutOfBoundsException exp = new IndexOutOfBoundsException("No items in list.");
				throw exp;
		}
		String string = list[index];
		return string;
	}

	/**
		Replaces the element at index with the given string. 
		May throw IndexOutOfBounds exception.
		Returns the item replaced.
	**/	
	public String set(int index, String s) {
		
		String replaceString = list[index];
		if (index > count) {
				IndexOutOfBoundsException exp = new IndexOutOfBoundsException("No items in list.");
				throw exp;
		}
		list[index] = s;
		return replaceString;
	}

	/**
		Removes the item at the given index and returns it.
		May throw IndexOutOfBounds exception.
	**/
	public String remove(int index) {
		String removeString = list[index];
		try{
			for(int i = index; i < count-1; i++) {
				list[i] = list[i+1];
			}				
			count--;
			return removeString;
				
		}catch(ArrayIndexOutOfBoundsException e){
			return "Error";
		}
	}

	/**
		Removes the given item, returns true if successful
		and false otherwise.
	**/
	public boolean remove(String s) {
		
		boolean hasElement = false;
		int count1 = count;
		int stringIndex = 0;
		for(int i = 0; i < count-1; i++){
			if (list[i].equals(s)) {
				stringIndex = i;
				hasElement = true;
			}
		}
		if(count > 0) {
			for(int i = stringIndex; i < count-1; i++) {
				list[i] = list[i+1];
			}
			count--;
		}
		list[count] = null;
	
		if (hasElement == true){
			if (count < count1) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		
		}
	}
	/**
		Returns a string representation of the array.
		Following is an example of the expected format:
		{A, B, C, D, E}
	**/
	public String toString() {
		
		if(isEmpty()) {
			return "{}";
		}
		else{
		String returnValue = "{";

		System.out.println(count);
		for(int i = 0; i < count-1; i++) {
			returnValue += list[i] + ", ";
		}
		returnValue += list[count-1];
		returnValue = returnValue + "}";
		return returnValue;
		}
	}

}
