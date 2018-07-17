/**
 * 
 */
package sanya.com.springboot.app2.algorithms;

/**
 * @author Sanya_s
 *
 */
public class Binarysearchtree {
	
	public class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		public Node getLeft(){
			return this.left;
		}
		
		public Node getRight(){
			return this.right;
		}
		
		public void setLeft(Node node){
			this.left = node;
		}
		
		public void setRight(Node node){
			this.right = node;
		}
	}
	
	Node rootNode;
	
	public void buildBinarySerachTree(Node node){
		if(this.rootNode == null){
			this.rootNode = node;
			return;
		}
		buildNodes(this.rootNode,node);
		
	}
	
	private void buildNodes(Node parentNode, Node newNode){
		if(newNode.data > parentNode.data){
			if(parentNode.right == null){
				parentNode.right = newNode;
				return;
			}
			buildNodes(parentNode.right,newNode);
		}
		if(newNode.data < parentNode.data){
			if(parentNode.left == null){
				parentNode.left = newNode;
				return;
			}
			buildNodes(parentNode.left,newNode);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Binarysearchtree sBinarysearchtree = new Binarysearchtree();
		sBinarysearchtree.buildBinarySerachTree(sBinarysearchtree. new Node(50));
		sBinarysearchtree.buildBinarySerachTree(sBinarysearchtree. new Node(60));
		sBinarysearchtree.buildBinarySerachTree(sBinarysearchtree. new Node(40));
		sBinarysearchtree.buildBinarySerachTree(sBinarysearchtree. new Node(30));
		sBinarysearchtree.buildBinarySerachTree(sBinarysearchtree. new Node(35));
		sBinarysearchtree.buildBinarySerachTree(sBinarysearchtree. new Node(20));
		System.out.println("this.rootNode : "+ sBinarysearchtree.rootNode.data);
		System.out.println("this.rootNode left : "+ sBinarysearchtree.rootNode.left.data);
		System.out.println("this.rootNode left left: "+ sBinarysearchtree.rootNode.left.left.data);
		System.out.println("this.rootNode left left right: "+ sBinarysearchtree.rootNode.left.left.right.data);
		System.out.println("this.rootNode left left left: "+ sBinarysearchtree.rootNode.left.left.left.data);
		System.out.println("this.rootNode right : "+ sBinarysearchtree.rootNode.right.data);

	}

}
