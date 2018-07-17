/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

/**
 * @author Sanya_s
 *
 */
public class ReversingALinkedList {
	
	//  null <-  1         2    ->    3    ->   4  ->  5
	//  prev    current   next
	static class Node{
		Node next;
		int data;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	private static Node head;
	
	 Node reverseLinkedList(Node node){
		Node previous = null;
		Node current = node;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}		
		return previous;
	}
	
	 void printLinkedList(Node node){
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReversingALinkedList linkedList = new ReversingALinkedList();
		linkedList.head = new Node(21);
		linkedList.head.next = new Node(31);
		linkedList.head.next.next = new Node(41);
		linkedList.head.next.next.next = new Node(51);
		linkedList.printLinkedList(linkedList.reverseLinkedList(head));

	}

}
