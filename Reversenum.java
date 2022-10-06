package CoreJava;

import java.util.Scanner;

public class Reversenum {
	public static void main(String[] args) {
		// creating Scanner class2
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value :");
		int num = sc.nextInt();
		int temp =num;
		int rev =0,digit;
		while(temp > 0)
		{
			digit=temp%10;
			rev=rev*10+digit;
			temp=temp/10;
		}
		System.out.println("revers num is:"+rev);	
}
	}
