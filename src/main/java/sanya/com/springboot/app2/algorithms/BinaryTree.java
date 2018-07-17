/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

/**
 * @author Sanya_s
 *
 */
public class BinaryTree {
		
	Node treeRoot;
	
	Node ddlHead;
	
	//construct doubly linked list using preorder
	private void createDoublyLinkedList(Node treeRootNode){
		//9 8
		
		if(treeRootNode == null)
			return;
		
			createDoublyLinkedList(treeRootNode.right);
			treeRootNode.right = ddlHead;
			if(ddlHead != null){
				ddlHead.left = treeRootNode;
			}
			ddlHead = treeRootNode;
			createDoublyLinkedList(treeRootNode.left);
		
	}
	
	private void printDoublyLinkedList(Node dlinkedListHead){
		while(dlinkedListHead != null){
			System.out.println(dlinkedListHead.data);
			dlinkedListHead = dlinkedListHead.right;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 						9
		//					8		7
		//				  5   4   3   2
		//
		//

		BinaryTree binaryTree = new BinaryTree();
		binaryTree.treeRoot = new Node(9);
		binaryTree.treeRoot.left = new Node(8);
		binaryTree.treeRoot.right = new Node(7);
		binaryTree.treeRoot.left.left = new Node(5);
		binaryTree.treeRoot.left.right = new Node(4);
		binaryTree.treeRoot.right.left = new Node(3);
		binaryTree.treeRoot.right.right = new Node(2);		
		binaryTree.createDoublyLinkedList(binaryTree.treeRoot);
		binaryTree.printDoublyLinkedList(binaryTree.ddlHead);
	}

}
