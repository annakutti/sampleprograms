/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Sanya_s
 *
 */
public class ReverseLinkedList {
	
	private static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	private static Node head; 
	
	private Node reverseList(Node node){
		
		//  null   <-   1     <-    2           3   ->          4->5->6;
		//            prev       current          next
		
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	private void printList(Node head){
		while(head!= null){
			System.out.println(head.data);
			head = head.next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(12);
		list.head.next = new Node(14);
		list.head.next.next = new Node(17);
		list.head.next.next.next = new Node(19);
		list.printList(list.reverseList(head));
	}

}
