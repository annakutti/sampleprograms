/**
 * 
 */
package sanya.com.springboot.app2.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Sanya_s
 *
 */
public class SingletonForm6Serialise {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{

		SingletonForm6 instance1 = SingletonForm6.getInstance();
		System.out.println(instance1.hashCode());
		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("output.ser"));
		outputStream.writeObject(instance1);
		outputStream.close();
		
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("output.ser"));
		SingletonForm6 intsnace2 = (SingletonForm6)inputStream.readObject();
		System.out.println(intsnace2.hashCode());
		inputStream.close();
		
	}
}
