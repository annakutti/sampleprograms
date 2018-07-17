/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author Sanya_s
 *
 */
public class DuplicateElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count =0;
		Map<String,Integer> m = new HashMap<>();
	    String[] myArray = {"happy","is","he","who", "happy","who","happy"};
	    Arrays.stream(myArray).forEach(new Consumer<String>(){

			@Override
			public void accept(String t) {				
				if(m.get(t)!=null){
					int countV = m.get(t);
					m.put(t, countV+1);
					System.out.println("duplicated : "+t+":"+m.get(t));
				}else{
					m.put(t, count+1);
				}				
			}	    	
	    });
	    
	    m.forEach(new BiConsumer<String, Integer>() {
			@Override
			public void accept(String t, Integer u) {
				System.out.println("p----duplicated : "+t+":"+u);
				
			}
		});
	}

}
