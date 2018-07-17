/**
 * 
 */
package sanya.com.springboot.app2.service;

/**
 * Singleton class - static block initialization
 * 
 * @author Sanya_s
 *
 */
public class SingletonForm2 {

	private static SingletonForm2 SINGLETON_FORM2;
	
	private SingletonForm2(){
		
	}
	
	static{
		try{
			SINGLETON_FORM2 = new SingletonForm2();
		}catch(Exception e){
			
		}
	}
	
	public static SingletonForm2 getInstance(){
		return SINGLETON_FORM2;
	}
}
