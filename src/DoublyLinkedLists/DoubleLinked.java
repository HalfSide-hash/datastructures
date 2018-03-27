/* Sylvester DelVillar
 * November 6th, 2016
 * Section 2
 */

package DoublyLinkedLists;

//***************************************************************
//DoubleLinked.java
//
//A class using a doubly linked list to represent a list of integers.
//
//***************************************************************
public class DoubleLinked
{
	private IntNode list;
	//----------------------------------------------
	//Constructor -- initializes list
	//----------------------------------------------
	public DoubleLinked(){
		list = null;
		}
	//----------------------------------------------
	//Prints the list elements
	//----------------------------------------------
	public void print(){
		for (IntNode temp = list; temp != null; temp = temp.next)
		System.out.println(temp.val);
		}
	//----------------------------------------------
	//Adds new element to front of list
	//----------------------------------------------
	public void addToFront(int val){
		IntNode newNode = new IntNode(val);
		newNode.next = list;
		if (list != null)
		list.prev = newNode;
		list = newNode;
		} 
	
	public void addToBack(int val){
			IntNode newNode = new IntNode(val);
			if (list != null){
				IntNode temp = list;
				while (temp.next != null)
					temp = temp.next;
				temp.next = newNode;
			}
			else
				list = newNode;
		} 
	
	public void removeFirst(){
		if (list != null)
			list.prev = null;
	}
	
	
	public void removeLast(){
		if (list != null){
			IntNode temp = list;
			IntNode prev = list;
			while (temp.next != null){
				prev = temp;
				temp = temp.next;
			}
			prev.next = null;
		}
			
	}
	
	public void remove(int oldVal){
		if (list != null){
			IntNode temp = list;
			while (temp.next != null){
				temp = temp.next;
				if (temp.val == oldVal){
					temp.next = null;
					break;
				}	
			}	
		}
		
	}
	//***************************************************************
	//An inner class that represents a list element.
	//***************************************************************
	private class IntNode{
		public int val;
		public IntNode next;
		public IntNode prev;
		
	public IntNode(int val){
		this.val = val;
		this.next = null;
		this.prev = null;
		}
	}
} 