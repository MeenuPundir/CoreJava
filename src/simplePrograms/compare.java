package simplePrograms;

import java.util.Scanner;

public class compare {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your number 1 = ");
	int num1 = sc.nextInt();
	System.out.println("Enter your number 2 = ");
	int num2 = sc.nextInt();
	
	System.out.println(num1 == num2); //boolean true/false
	
	System.out.println("Enter your name 1 = ");
	String name1 = sc.next();
	System.out.println("Enter your name 2 = ");
	String name2= sc.next();
	
	System.out.println(name1.equals(name2));//checking for boolean result true or false
	
	
	
	}
}
