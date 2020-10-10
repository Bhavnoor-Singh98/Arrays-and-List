
// implementation of linkedlist

public class LinkedList {
	
	// making inner class
	// making private bcoz we donot want anyone to make its object and access it
	// only LinkedList class can access
	private class Node{
		// has two properties
		int data;
		// address of next node
		Node next;
	}
	// private bcoz we donot want to be accessed by other 
	private Node head;
	private Node tail;
	private int size;
  }
  
