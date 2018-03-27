package DoublyLinkedLists;

//***********************************************************
//DoubleLinkedTest.java
//
//Driver to test DoubleLinked methods.
//***********************************************************
import java.util.Scanner;
public class DoubleLinkedTest{
	private static Scanner scan;
	private static DoubleLinked list = new DoubleLinked();
//----------------------------------------------------------------
//Creates a list, then repeatedly prints the menu and does what
//the user asks until they quit.
//----------------------------------------------------------------
public static void main(String[] args){
	scan = new Scanner(System.in);
	printMenu();
	int choice = scan.nextInt();
	while (choice != 0)
	{
	dispatch(choice);
	printMenu();
	choice = scan.nextInt();
}
}
//---------------------------------------
//Does what the menu item calls for.
//---------------------------------------
public static void dispatch(int choice){
	int newVal;
	int oldVal;
	switch(choice)
	{
		case 0:
		System.out.println("Bye!");
		break;
		case 1: //print
		System.out.println("** List elements **");
		list.print();
		break;
		case 2: //add to front
		System.out.println("Enter integer to add to front");
		newVal = scan.nextInt();
		list.addToFront(newVal);
		break;
		case 3: //add to front
		System.out.println("Enter integer to add to the back");
		newVal = scan.nextInt();
		list.addToBack(newVal);
		break;
		case 4: //remove first one
		list.removeFirst();
		case 5: //remove last one
		list.removeLast();
		break;
		case 6: //remove first instance of certain number
		System.out.println("Enter integer to replace");
		oldVal = scan.nextInt();
		list.remove(oldVal);
		break;		
		default:
		System.out.println("Sorry, invalid choice");
	}
}
//-----------------------------------------
//Prints the user's choices
//-----------------------------------------
public static void printMenu(){
		System.out.println("\n Menu ");
		System.out.println(" ====");
		System.out.println("0: Quit");
		System.out.println("1: Print list");
		System.out.println("2: Add an integer to the front of the list");
		System.out.println("3: Add an integer to the back of the list");
		System.out.println("4: Remove the first item from the list");
		System.out.println("5: Remove the last item on the list");
		System.out.println("6: Removes the first of a certain value from the list");
		System.out.print("\nEnter your choice: ");
	}
} 