//NEETESH KUMAR
//WAP to create ReversePyramid
package CoreJava;
import java.util.Scanner;
public class pyramid {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int i,j;
		for( i=n;i>=1;i--)
		{
			for( j=i;j<n;j++)
			{
				//System.out.println(" ");
					}
			for(j = 1; j <= (2 * i - 1); j++)
			{
			System.out.print("*");
			}
			System.out.println("");
			} 
			}
			}