/* Sylvester DelVillar
 * November 6th, 2016
 * Section 2
 */

package Parentheses;

//********************************************************************
//ParenMatch.java
//
//Determines whether or not a string of characters contains
//matching left and right parentheses.
//********************************************************************
import java.util.*;
import java.util.Scanner;
public class ParenMatch
{
public static void main (String[] args)
{
	Stack s = new Stack();
	String line; // the string of characters to be checked
	Scanner scan = new Scanner(System.in);
	System.out.println ("\nParenthesis Matching");
	System.out.print ("Enter a parenthesized expression: ");
	line = scan.nextLine();
	int left = 0;
	int right = 0;
	
	//loop to process the line one character at a time
	
	int x = 0;
	while (x < line.length()){
		if ('(' == line.charAt(x)){
			s.push(line.charAt(x));
			left++;
		}
		else if (')' == line.charAt(x)){
			if (s.empty()){
				right++;
				x++;
				break;
			}
			else{
				s.pop();
				right++;
			}
			
			
		}
		x++;
	}
	
	if (s.isEmpty() && right > left)
		System.out.print("\nThere was an error at " + line.substring(0,x) + ".\nThere were right parentheses left open with no matching left parentheses.");
	if (!s.isEmpty() && right < left)
		System.out.print("\nThere was an error at " + line.substring(0,x) + ".\nThere were left parentheses left open with no matching right parentheses.");
	if (s.isEmpty() && right == left)
		System.out.print("\n" + line.substring(0,x) + " is a valid statement.");

	//print the results
}
}