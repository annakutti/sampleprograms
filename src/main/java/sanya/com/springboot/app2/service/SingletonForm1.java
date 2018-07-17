/**
 * 
 */
package sanya.com.springboot.app2.service;

/**
 * Singleton class - eager initialization
 * 
 * @author Sanya_s
 *
 */
public class SingletonForm1 {
	
	private static final SingletonForm1 SINGLETON_FORM1 = new SingletonForm1();
	
	private SingletonForm1(){
		
	}
	
	public static SingletonForm1 getInstance(){
		return SINGLETON_FORM1;
	}

}
