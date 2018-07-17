/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

/**
 * @author Sanya_s
 *
 */
public class SortOnLengthOfString {
	
	public static void main(String[] args){
		String myArray[] = {"Malayalee","I","love","Kochi","from","am"};		
		
		for(int i=0;i<myArray.length;i++){
			for(int j=i+1;j<myArray.length;j++){
				String temp;
				if(myArray[i].length() > myArray[j].length()){
					temp = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = temp;
				}
			}			
		}
				
		for(int i=0;i<myArray.length;i++){
			System.out.println(myArray[i]);
		}
		
	}	
}
