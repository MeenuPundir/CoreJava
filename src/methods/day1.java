package methods;

import java.util.Scanner;

public class day1 {
	
	
	//Method One
	public static void rectangle() {
		
        System.out.println("Calculating Area of Rectangle:");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Length");
		int length = sc.nextInt();
		
		System.out.println("Breath");
		int breath = sc.nextInt();
		
		int area = length * breath;
		System.out.println("The areaa of rectangle is = " + area);
		System.out.println("_____________________________________");
		
		
		
		}
	
public static void square() {
	System.out.println("Calculating Area of Square:");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("side=");
	int side = sc.nextInt();
	int area = side*side;
	System.out.println("area is = " + area);
	System.out.println("_____________________________________");
	
}

//method Three
	public static void circle()
	{
		System.out.println("Calculating the area of Circle");
		Scanner sc = new Scanner(System.in);
		System.out.println("Radious of Circle");
		float r = sc.nextFloat();
		double area = 3.14*r*r;
		System.out.println("Area of Circle is = " + area);
		

}
	
	
	
public static void main (String [] args)
{
	rectangle();
	square();
	circle();
}
}