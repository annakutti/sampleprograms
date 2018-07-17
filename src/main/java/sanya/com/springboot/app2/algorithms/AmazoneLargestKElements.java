/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

import java.util.Arrays;

/**
 * @author Sanya_s
 *
 */
public class AmazoneLargestKElements {

	/**
	 * 
	 * [1, 23, 12, 9, 30, 2, 50]
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] myArray = {1, 23, 12, 9, 30, 2, 50};
		Arrays.sort(myArray); //{1, 2,9,12,23,30,50}
		int k = 2;
		
		for(int i=myArray.length - k;i<myArray.length;i++){
			System.out.println(myArray[i]);
		}
		
	}

}
