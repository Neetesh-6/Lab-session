//Create a program to find largest of two numbers
package CoreJava;
import java.util.Scanner;
public class Largestnum 

{

	public static void main(String[] args) {
		// creating Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value :");
		int num1 = sc.nextInt();
		System.out.println("Enter second value :");
		int num2 = sc.nextInt();
		
		// using  opration for largest value
		if(num1>= num2)
		{
		System.out.println("the largest value :"+num1);
		}
		else
		{
			System.out.println("the largest value :"+num2);
		}


	}
}
