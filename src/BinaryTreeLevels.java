import java.util.LinkedList;
import java.util.Queue;

//resource: https://www.geeksforgeeks.org/print-levels-nodes-binary-tree/
//approach: each node level is determined by the amount of ancestors it has.

public class BinaryTreeLevels {

	static class Node { 
        int data;
        Node left;
        Node right;
 
        Node(int data) { this.data = data;
        left = null;
        right = null;
        }
	}
	
	static class NodeLevel { //creating a new object to hold both a Node, and it's level.
		
		Node n;
		int i;
		NodeLevel(Node n, int i){
			this.n = n;
			this.i = i;
		}
		
	}
	
	static void printLevel(Node root) {
		if(root == null)
			return; //no tree nodes case
		
		Queue<NodeLevel> q = new LinkedList<NodeLevel>();
		
		q.add(new NodeLevel(root,1));
		
		NodeLevel nl;
		
		while(!q.isEmpty()) {
			nl = q.peek();
			q.remove();
			
			System.out.println("Level of " + nl.n.data + " is " + nl.i);
			if(nl.n.left != null) {
				q.add(new NodeLevel(nl.n.left, nl.i + 1));
			}
			if(nl.n.right != null) {
				q.add(new NodeLevel(nl.n.right, nl.i + 1));
			}
				
		}
			
			
		}
	
	public static void main(String args[])
    {
        Node root = null;
      
        /* Constructing tree given in the
              above figure */
        root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
      
        printLevel(root);
    }
}
	
	
	
	
	
	

