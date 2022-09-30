//:Create a program for calculation.read three values from the user for operation
//first and second values as operands.
//third value as operator.
//if user press1 => print addition of first and second
//if user press2 => print subtraction of first and second
//if user press3 => print multiplication of first and second
//if user press4 => print division of first and second

package CoreJava;
import java.util.Scanner;
public class Calculation {
		public static void main(String[] args) {
	//creating scanner object to take from user
		Scanner sc= new Scanner (System.in);
		Calculation cl =new Calculation(); 
		//Getting input value from user
		System.out.println("enter first number'");
		int num1= sc.nextInt();
	System.out.println("enter second number'");
	int num2= sc.nextInt();
	System.out.println("press 1 for addition/n press 2 for substraion/n press 3 for multification/n press 4 for division ");
	int num3= sc.nextInt();
	switch (num3)
	{
	case 1:
	cl.add(num1,num2);
	break;
	case 2:
	cl.sub( num1,num2);
	break; 
	case 3:
	cl.mul(num1,num2);
	break;
	case 4:
	cl.div(num1,num2);
	break;
	default:
	System.out.println("invalid number");
	break;
	}
		}
		
		public void add(int num1,int num2)
		{
			System.out.println("addition is :"+(num1+num2));
	}
		public void sub(int num1,int num2)
		{
			System.out.println("substraion is :"+(num1-num2));
}
		public void mul(int num1,int num2)
		{
			System.out.println("addition is :"+(num1*num2));
			}
		public void div(int num1,int num2)
		{
			System.out.println("addition is :"+(num1/num2));
			}
}

