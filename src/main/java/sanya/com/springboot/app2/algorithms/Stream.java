/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sanya_s
 *
 */
public class Stream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> myList = new ArrayList<>();
		for(int i=0;i<10;i++)myList.add(i);
			
		myList.stream().forEach(data -> System.out.println(data));
		
		System.out.println("_________________________________________");
		
		myList.parallelStream().forEach(data -> System.out.println(data));
			
	}

}
