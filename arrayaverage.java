package CoreJava;
import java.util.Scanner;
public class arrayaverage {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int a=sc.nextInt();
		float sum=0;
		float avg=0;
		//declaring array
		int arr[]=new int[a];
		System.out.println("Enter the elements ");
		//traversing the array 
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();}
		{
			
			//int avg;
			//traversing the array to find sum 
			for(int i=0;i<a;i++) {
				 sum=sum+arr[i];
				  avg = sum/a;
			}
			   // float avg = sum/a;
			System.out.println("Sum of all elements of the array is :"+avg);
			//System.out.println("Sum of all elements of the array is :"+avg);
			
		}

}
}