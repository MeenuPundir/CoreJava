package generalPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a=0, b=1, c, n, i;
		System.out.println("Enter the number of terms");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		System.out.print(a+ " " + b);
		//System.out.print(" " + (c= a+b));
		
		for (i=2; i<n; i++) {
			
			System.out.print(" " + (c= a+b));
			a=b;
			b=c;
		}
		
	}

}
