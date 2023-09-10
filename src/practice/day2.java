package practice;

import java.util.Scanner;

public class day2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name = ");
		String name = sc.next();
		
		for (int i=1; i<=10; i++)
		{
			System.out.println(name);
		}
	}
}