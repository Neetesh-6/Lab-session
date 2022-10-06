//NEETESH KUMAR
//:WAP to Check for Leap Year.Take the input from the user
package CoreJava;

import java.util.Scanner;

public class leapyears {

	public static void main(String[] args) {
		// creating Scanner class2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value :");
		int year = sc.nextInt();
	
		// using  opration for leapyear.
		if(year%4==0)
		{
		System.out.println("this year is  leapyear");
		}
		else
		{
			System.out.println("this is not leapyear ");
		}

}}
