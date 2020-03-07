package linear;
/**
 * @author vivekmanchikatla
 *
 */
public class CustomLinkedList{
    /*
    This is the custom version of the linked list.
    Methods:
    1. Node add(Node head, int element): Add a element to a linked list.
    2. boolean search(Node head, int element): Search a element in the linked list. Retuns True if the element exists else return False.
    3. Node delete(Node head, int element): delete the element in the linked list.
    4. int length(Node head): Returns the Length of the linked List. if Empty list then returns -1.
    5. void printList(Node head): prints the lists.
    */
    
    public Node add(Node head, int value) {
    	if(head==null) {
    		Node temp = new Node(value);
    		System.out.println("added at head");
    		return temp;
    	}
    		Node temp = head;
    		while(temp.next!=null) {
    			temp = temp.next;
    		}
    		temp.next = new Node(value);
    		System.out.println("Added at tail");
    	
    	return head;
    }
    
    public Node delete(Node head, int element) {
    	if(head==null) {
    		System.out.println("List is Empty, cannot delete");
    		return head;
    	}else {
    		if(head.data == element) {
    			head = head.next;
    			return head;
    		}else {
    			Node temp = head.next;
    			Node prev = head;
    			while(temp!=null){
    				if(temp.data == element){
    					prev.next = temp.next;
    				}
    				temp = temp.next;
    				prev = prev.next;
    			}
    		}
    	}    	
    	return head;
    }
    
    public int length(Node head) {
    	if(head == null) {
    		return -1;
    	}else {
    		int len = 0;
    		Node curr = head;
    		while(curr!=null) {
    			curr = curr.next;
    			len++;
    		}
    		return len;
    	}
    }
    
    public void printList(Node head) {
    	if(head==null) {
    		System.out.println("Empty List");
    	}else {
    		Node curr = head;
        	while(curr!=null) {
        		System.out.print(curr.data+" ");
        		curr = curr.next;
        	}
        	System.out.println();
    	}
    	
    }
    
    public boolean search(Node head, int element) {
    	if(head==null) {
    		return false;
    	}else {
    		Node curr = head;
    		while(curr!=null) {
    			if(curr.data == element) {
    				return true;
    			}
    			curr = curr.next;
    		}
    		return false;
    	}
    }
    

}

