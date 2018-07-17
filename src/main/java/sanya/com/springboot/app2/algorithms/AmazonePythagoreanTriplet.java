/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

import java.util.Arrays;

/**
 * @author Sanya_s
 *
 */
public class AmazonePythagoreanTriplet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] myArray =  {3, 1, 4, 5,9,10,8,6};
		Arrays.sort(myArray);
		for(int i= 0; i<myArray.length;i++){
			myArray[i] = myArray[i]*myArray[i];
		}
		// 1 , 9, 16, 25, 36
		
		for(int i=0; i<myArray.length-2; i++){
			if(myArray[i] + myArray[i+1] == myArray[i+2]){
				System.out.println("foundn:"+myArray[i]+"+"+myArray[i+1]+"="+myArray[i+2]);
			}else{
				System.out.println("not found:"+myArray[i]+"+"+myArray[i+1]+"="+myArray[i+2]);
			}
		}
	}

}
