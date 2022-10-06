//NEETESH KUMAR 
//
package CoreJava;

import java.util.Scanner;

public class password {
	public static void main(String[]args)
	{
		String username;
		int password;
		Scanner ck = new Scanner(System.in);
		System.out.println("enter username");
		username=ck.nextLine();
		System.out.println("enter password");
		password=ck.nextInt();
		System.out.println("password");
		{
			if(password==45678)// check true password
			{//successful login
				System.out.println("login successful:"+username);
			}//  not successful login
			else {
				System.out.println("login dential:"+username);
			}
		}	
	}
	}
