/**
 * 
 */
package sanya.com.springboot.app2.aem;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

import javax.jcr.Node;
import javax.jcr.Session;

/**
 * @author Sanya_s
 *
 */
public class JCRRepositoryCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Session session = (Session) resourceResolver.adaptTo(Session.class);
		Node root = session.getRootNode();
		Node jcrContent = root.getNode("testNode/A/test.txt/jcr:content");

		InputStream is = jcrContent.getProperty("jcr:data").getBinary().getStream();

		BufferedInputStream bis = new BufferedInputStream(is);
		ByteArrayOutputStream buf = new ByteArrayOutputStream();
		int result = bis.read();
		while (result != -1) {
		    byte b = (byte) result;
		    buf.write(b);
		    result = bis.read();
		}

		System.out.println("plain text: " + buf.toString());*/

	}

}
