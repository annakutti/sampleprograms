/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

import java.util.Arrays;
import java.util.List;

/**
 * @author Sanya_s
 *
 */
public class MyArrayList {
	
	Object[] myarray;
	
	int noOfElements;
	
	public MyArrayList() {
		myarray = new Object[10];
	}
	
	public MyArrayList(int size){
		myarray = new Object[size];
	}
	
	public void add(int newElement){
		if(myarray.length < noOfElements+1){
			initializeCapacity();
		}
		myarray[noOfElements++] = newElement;
	}
	
	private void initializeCapacity(){
		myarray = Arrays.copyOf(myarray, myarray.length*2);
	}
	
	public void print(){
		List myArrayList = Arrays.asList(myarray); 
		System.out.println(myArrayList);
	}
	
	public Object get(int index){
		if(index > noOfElements){
			throw new ArrayIndexOutOfBoundsException();
		}
		return myarray[index];
	}
	
	public void remove(int index){
		if(index > noOfElements){
			throw new ArrayIndexOutOfBoundsException();
		}
		Object removedElement = myarray[index];
		System.out.println("Removed Element is : "+removedElement);
		while(index < noOfElements){
			myarray[index] = myarray[index+1];
			index++;
		}
		noOfElements--;	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList();
		myArrayList.add(5);
		myArrayList.add(9);
		myArrayList.add(4);
		myArrayList.add(2);
		myArrayList.add(15);
		myArrayList.print();
		System.out.println("Retrieved :"+ myArrayList.get(3));
		myArrayList.remove(1);
		myArrayList.print();

	}

}
