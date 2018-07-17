/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

/**
 * @author Sanya_s
 *
 */
public class SumOfLinkedList {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node headList1;
	
	Node headList2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Input:
			  First List: 5->6->3  // represents number 365
			  Second List: 8->4->2 //  represents number 248
			Output
			  Resultant list: 3->1->6 */
		
		SumOfLinkedList link = new SumOfLinkedList();
		link.headList1 = new Node(5);
		link.headList1.next = new Node(6);
		link.headList1.next.next = new Node(3);
		
		link.headList2 = new Node(8);
		link.headList2.next = new Node(4);
		link.headList2.next.next = new Node(2);
		

	}

}
