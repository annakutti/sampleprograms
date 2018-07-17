/**
 * 
 */
package sanya.com.springboot.app2.service;

/**
 * 
 * Thread safe - synchronized singleton
 * @author Sanya_s
 *
 */
public class SingletonForm4 {

	private static SingletonForm4 singletonForm4;
	
	private SingletonForm4(){
		
	}
	
	public static synchronized SingletonForm4 getInstance(){
		if(singletonForm4 == null){
			return new SingletonForm4();
		}
		return singletonForm4;
	}
}
