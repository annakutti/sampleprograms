/**
 * 
 */
package sanya.com.springboot.app2.service;

/**
 * @author Sanya_s
 *
 */
public class SingletonForm5 {

	private static SingletonForm5 singletonForm5;
	
	private SingletonForm5(){
		
	}
	
	public static SingletonForm5 getInstance(){
		if(singletonForm5 == null){
			synchronized(SingletonForm5.class){
				if(singletonForm5 == null){
					return singletonForm5;
				}
			}
		}
		return singletonForm5;
	}
}
