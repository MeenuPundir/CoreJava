package simplePrograms;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args)
	{
		//program to print a line
		System.out.println("First java program");
		
		//program to put values at compile time
		int a =10;
		String name1 ="Ram";
		 System.out.println(a);
		 System.out.println(name1);
		 
		 //program to enter values at run time
		   /** use of Scanner class */
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter your number");
		 int num = sc.nextInt();
		 System.out.println(num);
		 
		 System.out.println("enter your name");
		 String name = sc.next();
		 System.out.println(name);
		 
		 
		 //sc.close();
		 
				 
		
		
		
	
	}
	
	

}