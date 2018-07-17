/**
 * 
 */
package sanya.com.springboot.app2.service;

/**
 * Lazy initialization
 * 
 * @author Sanya_s
 *
 */
public class SingletonForm3 {

	private static SingletonForm3 singletonForm3;
	
	private SingletonForm3(){
		
	}
	
	public static SingletonForm3 getInstance(){
		if(singletonForm3 == null){
			singletonForm3 = new SingletonForm3();
		}
		return singletonForm3;
	}
}
