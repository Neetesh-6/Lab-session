package CoreJava;

import java.util.LinkedList;
import java.util.Scanner;

public class palinklist {
	public static void main(String[] args)
	{  Scanner sc =new Scanner (System.in);
		LinkedList<Integer> ob= new LinkedList<>();
	    ob.add(50);
	    ob.add(9);
	    ob.add(23);
	    ob.add(10);
	    System.out.println("which element you want to search:");
	    int n=sc.nextInt();
	    boolean s= ob.contains(n);
	    if(s)
	    {
	    	System.out.println("yes the element is present");
	    }
	    else
	    {
	    	System.out.println("no the element is not present");
	    }
    }
}

