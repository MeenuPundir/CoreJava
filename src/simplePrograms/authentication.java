package simplePrograms;

import java.util.*;

public class authentication {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter username = ");
	String username = sc.next();
	
	System.out.println("enter your pin = ");
	int pin = sc.nextInt();
	
	if (username.equals("Ram") && pin == 1234)
	{
		System.out.println("Welcome to Home Page!!!!!");
		
	}
	
	
	else if(username.equals("Shyam") && pin == 5678)
	{
		System.out.println("Welcome to Home Page!!!!!");
		
	}
	
	else if(username.equals("Siya") && pin == 3456)
	{
		System.out.println("Welcome to Home Page!!!!!");
		
	}
	
	
	else
		System.err.println("Incorrect username or pin"); //this err will show result in red color
	
	
}
}