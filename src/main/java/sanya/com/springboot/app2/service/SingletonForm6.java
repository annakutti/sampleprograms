/**
 * 
 */
package sanya.com.springboot.app2.service;

import java.io.Serializable;

/**
 * @author Sanya_s
 *
 */
public class SingletonForm6 implements Serializable {

	private SingletonForm6(){
	}
	
	private static class SingletonHelper{
		private static final SingletonForm6 singletonForm6 = new SingletonForm6();
	}
	
	public static SingletonForm6 getInstance(){
		return SingletonHelper.singletonForm6;
	}
	
	protected Object readResolve(){
		return getInstance();
	}
}
