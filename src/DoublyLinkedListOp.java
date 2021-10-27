//resources:
//https://www.geeksforgeeks.org/doubly-linked-list/
//https://www.geeksforgeeks.org/delete-a-node-in-a-doubly-linked-list/
public class DoublyLinkedListOp {
	Node head;
	class Node { //implementing Doubly Linked List structure and features.
        int data;
        Node prev;
        Node next;
 
        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) { data = d; }
	}
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		newNode.prev=null;
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}
	
	public void deleteNode(Node temp) {
	//We have 3 cases in this scenario.
		//We're either deleting head node, last node, or an in between node.
		if(head == null || temp ==null) { //Case where there is nothing to be deleted.
			return;
		}
		
		//If the node to be deleted is head, we shall define the next one as head.
		if(head == temp) {
			head = temp.next;
		}
		
		//If we're not in the last Node,
		//we want to connect the deleted node's next neighbor pointer of previous,
		//to his previous Node.
		if(temp.next != null) { //not at last
			temp.next.prev = temp.prev;
		}
		
		//Vice versa. If we're not deleting the first Node,
		//we shall change the pointer of previous's next, to the deleted's Next.
		
		if(temp.prev!= null) { //not at first
			temp.prev.next = temp.next;
		}
		
		
}
}
