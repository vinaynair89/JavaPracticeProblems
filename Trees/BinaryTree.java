package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class BinaryTree {
	
	Node root;
	
	public static Node lowestCommonAncestor(Node root, Node a, Node b) {
	    if (root == null) {
	        return null;
	    }
	    
	    if (root.equals(a) || root.equals(b)) { 
	        // if at least one matched, no need to continue
	        // this is the LCA for this root
	        return root;
	    }

	    Node l = lowestCommonAncestor(root.left, a, b);
	    Node r = lowestCommonAncestor(root.right, a, b);

	    if (l != null && r != null) {
	    	return root;  // nodes are each on a seaparate branch
	    }

	    // either one node is on one branch, 
	    // or none was found in any of the branches
	    return l != null ? l : r;
	}
	
	public boolean printAncestors(Node node, int target) {
        
        /* base cases */
       if (node == null) {
           return false;
       }

       if (node.data == target) {
           return true;
       }

       /* If target is present in either left or right subtree of this node,
        then print this node */
       //System.out.println(printAncestors(node.left, target)+" "+printAncestors(node.right, target)+" "+node.data);
       if (printAncestors(node.left, target)
               || printAncestors(node.right, target)) {
    	   
           System.out.print(node.data + " ");
           return true;
       }

       /* Else return false */
       return false;
   }
	
	public void addNode(int data){
		Node newNode = new Node(data);
		
		if(root==null){
			root = newNode;
		}
		else
		{
			Node temp=root;
			Node par;
			while(true){
				par=temp;
				if(data<temp.data){
					temp=temp.left;
					if(temp==null){
						par.left=newNode;
						return;
					}
					
				}
				else
				{
					temp=temp.right;
					if(temp==null){
						par.right=newNode;
						return;
					}
				}
			}
		}
	}
	/*
	public void addNode(int key) {

		// Create a new Node and initialize it

		Node newNode = new Node(key);

		// If there is no root this becomes root

		if (root == null) {

			root = newNode;

		} else {

			// Set root as the Node we will start
			// with as we traverse the tree

			Node focusNode = root;

			// Future parent for our new Node

			Node parent;

			while (true) {

				// root is the top parent so we start
				// there

				parent = focusNode;

				// Check if the new node should go on
				// the left side of the parent node

				if (key < focusNode.data) {

					// Switch focus to the left child

					focusNode = focusNode.left;

					// If the left child has no children

					if (focusNode == null) {

						// then place the new node on the left of it

						parent.left = newNode;
						return; // All Done

					}

				} else { // If we get here put the node on the right

					focusNode = focusNode.right;

					// If the right child has no children

					if (focusNode == null) {

						// then place the new node on the right of it

						parent.right = newNode;
						return; // All Done

					}

				}

			}
		}

	}*/
	
	public boolean remove(int key) {

		

		Node focusNode = root;
		Node parent = root;

	

		boolean isItALeftChild = true;

		

		while (focusNode.data != key) {

			parent = focusNode;

			if (key < focusNode.data) {

				isItALeftChild = true;
				focusNode = focusNode.left;

			} else {
				isItALeftChild = false;

				focusNode = focusNode.right;

			}

			if (focusNode == null)
				return false;

		}

		if (focusNode.left == null && focusNode.right == null) {

			if (focusNode == root)
				root = null;

			else if (isItALeftChild)
				parent.left = null;

			else
				parent.right = null;

		}

	

		else if (focusNode.right == null) {

			if (focusNode == root)
				root = focusNode.left;

			else if (isItALeftChild)
				parent.left = focusNode.left;



			else
				parent.right = focusNode.left;

		}



		else if (focusNode.left == null) {

			if (focusNode == root)
				root = focusNode.right;


			else if (isItALeftChild)
				parent.left = focusNode.right;



			else
				parent.right = focusNode.right;

		}


		else {

			Node replacement = getReplacementNode(focusNode);



			if (focusNode == root)
				root = replacement;



			else if (isItALeftChild)
				parent.left = replacement;



			else
				parent.right = replacement;

			replacement.left = focusNode.left;

		}

		return true;

	}

	public Node getReplacementNode(Node replacedNode) {

		Node replacementParent = replacedNode;
		Node replacement = replacedNode;

		Node focusNode = replacedNode.right;



		while (focusNode != null) {

			replacementParent = replacement;

			replacement = focusNode;

			focusNode = focusNode.left;

		}



		if (replacement != replacedNode.right) {

			replacementParent.left = replacement.right;
			replacement.right = replacedNode.right;

		}

		return replacement;

	}

	
	public void Inorder(Node root1){
		
		
		if(root1!=null){
			Inorder(root1.left);
			System.out.println(root1.data);
			Inorder(root1.right);
		}
	}
	
	
	public int height(Node head){
		if(head==null)
			return 0;
		int left=0,right=0;
		
		left=height(head.left);
		right=height(head.right);
		
		
		return (left>right)?left+1:right+1;
	}
	
	
	
	public int heightUsingStack(Node head){
		if(head==null){
			return 0;
		}
		
		Stack<Node> s = new Stack<Node>();
		
		Node prev=null;
		int count=0,maxDepth=0;
		s.push(head);
		
		while(!s.isEmpty()){
			Node curr=s.peek();
			System.out.println("Peeked value: "+curr.data);
			if(prev==null||prev.left==curr||prev.right==curr){
				if(curr.left!=null){
					s.push(curr.left);
					System.out.println(curr.left.data);}
				else if(curr.right!=null){
					s.push(curr.right);
					System.out.println(curr.right.data);}
				
				
			}
			else if(curr.left==prev){
				if(curr.right!=null){
					s.push(curr.right);
					System.out.println(curr.right.data);
				}
			}
			else
			{
				System.out.println("Poped value: "+s.pop().data);
			}
			
			prev=curr;
			
			System.out.println("Previous stored from current: "+ prev.data);
			if(s.size()>maxDepth)
				maxDepth=s.size();
			
			System.out.println();
			System.out.println();
			System.out.println();
			
			
		}
		
		return maxDepth;
		
	}
	
	
	public int heightUsingQueue(Node head){
		if(head==null){
			return 0;
		}
		
		Queue<Node> q =new LinkedList<Node>();
		q.offer(head);
		int node_size=0,count=0;
		while(1==1){
			
			node_size=q.size();
			if(node_size==0){
				return count;
			}
			
			while(node_size>0){
				Node temp=q.peek();
				q.remove();
				if(temp.left!=null)
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
				node_size--;
			}
			
			count++;
			
			
		}
	}
	
	
	public int minDepth(Node head){
		if(head==null)
			return 0;
		
		Queue<Node> q=new LinkedList<Node>();
		
		q.offer(head);
		q.offer(null);
		
		int c=1;
		
		while(!q.isEmpty()){
			Node curr=q.peek();
			q.poll();
			//System.out.println(curr.data);
			if(curr!=null){
				if(curr.left==null && curr.right==null){
					return c;
				}
				if(curr.left!=null){
					q.offer(curr.left);
				}
				if(curr.right!=null){
					q.offer(curr.right);
				}
			}
			else
			{
				if(!q.isEmpty()){
					c++;
					q.offer(null);
				}
			}
		}
		
		return c;
	}
	
	public int halfNodes(Node head){
		if(head==null){
			return 0;
		}
		
		Queue<Node> q= new LinkedList<Node>();
		
		q.offer(head);
		int c=0;
		
		while(!q.isEmpty()){
			Node temp = q.poll();
			
			if(temp.left!=null && temp.right==null || temp.left==null && temp.right!=null){
				c++;
			}
			if(temp.left!=null){
				q.offer(temp.left);
			}
			if(temp.right!=null){
				q.offer(temp.right);
			}
		}
		
		return c;
	}
	
	
	public int fullNodes(Node head){
		if(head==null){
			return 0;
		}
		
		Queue<Node> q= new LinkedList<Node>();
		
		q.offer(head);
		int c=0;
		
		if(!q.isEmpty()){
			Node temp=q.poll();
			
			if(temp.right!=null && temp.left!=null){
				c++;
			}
			if(temp.right!=null){
				q.offer(temp.right);
			}
			if(temp.left!=null){
				q.offer(temp.left);
			}
			
		}
		
		return c;
	}
	
	
	
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		bt.addNode(20);
		bt.addNode(25);
		bt.addNode(30);
		bt.addNode(40);
		bt.addNode(35);
		bt.addNode(10);
		bt.addNode(27);
		//bt.remove(35);
		System.out.println(Integer.MIN_VALUE);
		bt.Inorder(bt.root);
		System.out.println(bt.height(bt.root));
		//System.out.println(bt.heightUsingStack(bt.root));
		System.out.println(bt.heightUsingQueue(bt.root));
		System.out.println("Minimum Depth:"+bt.minDepth(bt.root));
		System.out.println("No. of Half Nodes: "+bt.halfNodes(bt.root));
		System.out.println("No. of full nodes: "+bt.fullNodes(bt.root));
		System.out.println(bt.printAncestors(bt.root, 27));
		Node a=lowestCommonAncestor(bt.root, bt.root.right.right.left, bt.root.right.right);
		System.out.println(a.data);
	}

}
