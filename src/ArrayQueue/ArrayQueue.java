/* Sylvester DelVillar
 * November 6th, 2016
 * Section 2
 */

package ArrayQueue;

public class ArrayQueue implements QueueADT
{
private final int DEFAULT_SIZE = 5;
private Object[] elements;
private int numElements;
private int front, back;
//---------------------------------------------
// Constructor; creates array of default size.
//---------------------------------------------
public ArrayQueue()
{
	elements = new Object[DEFAULT_SIZE];
	back = 0;
}
//---------------------------------------------
// Puts item on end of queue.
//---------------------------------------------
public void enqueue(Object item)
{
	if (this.isFull() == true)
		System.out.print("");
	else{
		elements[back] = item;
		back++;
	}
	
}
//---------------------------------------------
// Removes and returns object from front of queue.
//---------------------------------------------
public Object dequeue()
{
	Object result = elements[0];
	
	back--;
	
	for (int scan=0; scan < back; scan++)
        elements[scan] = elements[scan+1];

     elements[back] = null;

     return result;
}
//---------------------------------------------
// Returns true if queue is empty.
//---------------------------------------------
public boolean isEmpty()
{
	return (back ==0);
}
//-----------------------------------------
// Returns true if queue is full.
//-----------------------------------------
public boolean isFull()
{
	return (back == elements.length-1);
}
//--------------------------------------------- 
// Returns the number of elements in the queue.
//---------------------------------------------
public int size()
{
	return back;
}
//---------------------------------------------
// Returns a string containing the elements of the queue
// from first to last
//---------------------------------------------
public String toString()
{
	String result = "\n";
	for (int i = back, count=0; count < elements.length;
	 i=(i+1)%elements.length,count++)
	if (elements[i] != null)
	 result = result + elements[i]+ "\n";
	return result;
}
}