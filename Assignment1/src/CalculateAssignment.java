/**
 * A program to find chapter number and problem number based on student ID
 * @author Michael_Cherry
 *Date: 9/3/2014
 *
 *Algorithm:
 *1. Prompt the user for student ID.
 *2. Create a new scanner, to scan for user input.
 *3. Read and calculate student ID.
 *4. If student id is even, output chapter 2.
 *5. If the chapter number is 2, divide your student id by 11, consider the remainder and increment 
 *it by 1, output the problem number.
 *6. If student is odd, output chapter 1
 *7. If the chapter number is 1, divide your student ID by 10, consider the remainder and increment
 *it by 1, output the problem number.
 */

import java.util.Scanner;

public class CalculateAssignment 
{
	public static void main(String[] args) {
		
		//1. Prompt the user for student ID.		
		System.out.println("Enter student ID");
		//2. Create a new scanner, to scan for user input.
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		//3. Read and calculate student ID.
		int remainder = id % 2;
		//4. If student id is even, output chapter 2.
		if (remainder==0) 
		{	
			//5. If the chapter number is 2, divide your student id by 11, consider the remainder and 
			//increment it by 1, output the problem number.
			int evennumber = id % 11;
			int assignmenteven = evennumber + 1;
			System.out.println("Your assignment is Chapter 2 problem number " + assignmenteven);
		}
		//6. If student is odd, output chapter 1
		else
		{
			//7. If the chapter number is 1, divide your student ID by 10, consider the remainder and 
			//increment it by 1, output the problem number.
			int oddnumber = id % 10;
			int assignmentodd = oddnumber + 1;
			System.out.println("Your assignment is Chapter 1 problem number " + assignmentodd);	
		}
			
	}
	
}
