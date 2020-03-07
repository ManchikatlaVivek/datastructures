package test;
import linear.*;

public class Sample {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		CustomLinkedList cl = new CustomLinkedList();
		System.out.println("Linked List Package Test Scripts");
		Node head = null;
		head = cl.add(head, 3);
		head = cl.add(head, 34);
		cl.printList(head);
		head = cl.delete(head, 3);
		cl.printList(head);
		head = cl.delete(head, 34);
		cl.printList(head);
		head = cl.delete(head, 34);
		cl.printList(head);
		
	}

}
