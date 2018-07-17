/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sanya_s
 *
 */
public class StreamMapAndFlatMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("mango");
		
	    System.out.println(fruits);
	    List<Integer> fruitLength = fruits.stream().map(s -> s.length()).collect(Collectors.toList());
	    System.out.println(fruitLength);
	    
	//
		
	}

}
