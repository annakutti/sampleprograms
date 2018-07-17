/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author Sanya_s
 *
 */
public class ReverseOrderWordsInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String[] words = {"I","work","in","seattle","and","prefer"};
		Integer[] words = {3,65,2,3,2,46};

		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<words.length;i++){			
			stack.push(words[i]);
		}
		
		for(int i=0;i<words.length;i++){			
			System.out.println(stack.pop());
		}	
		
	/*	stack.forEach(new Consumer<String>() {			
			@Override
			public void accept(String t) {
				System.out.println(t);				
			}
		});*/
		
		//stack.forEach(s-> System.out.println(stack.pop()));  // concurrent modification exception
		
	}

}
