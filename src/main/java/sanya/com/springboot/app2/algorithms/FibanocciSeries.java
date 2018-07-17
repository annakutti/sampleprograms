/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

/**
 * @author Sanya_s
 *
 */
public class FibanocciSeries {
	
	private static int value1 = 0 , value2 = 1, value3 = 0;
	
	private static void recursive(int count){
		if(count > 0){
			value3 = value1 + value2;
			System.out.print(" "+value3);
			value1 = value2;
			value2 = value3;
			recursive(count-1);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FibanocciSeries.recursive(10);
		/*System.out.print("0 1");
		for(int i=0;i<count;i++){
			value3 = value1 + value2;
			System.out.print(" "+value3);
			value1 = value2;
			value2 = value3;
		}*/
	}

}
