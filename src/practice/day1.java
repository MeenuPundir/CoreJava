package practice;

import java.util.Scanner;

public class day1 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your age");
			 int age = sc.nextInt();
			 
			 if(age>=18)
			 {
				 System.out.println("You can vote");
			 }
			 else
			 {
				 System.out.println("You can not vote");
			 
			
}
		}

			
	}

}
