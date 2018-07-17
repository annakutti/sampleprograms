/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

/**
 * @author Sanya_s
 *
 */
public class LongestWordInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] words = {"j","apple","ate","mangaoestyyyyyyyyyyyyyyy","I","and", "juices","everydayss"};
		String longestWord = "";
		for(int i=0;i<words.length;i++){
			if(longestWord.length() < words[i].length()){
				longestWord = words[i];
			}
		}
		
		System.out.println(longestWord);

	}

}
