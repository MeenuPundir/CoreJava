package methods;
import java.util.Scanner;


public class FindOutArea {
	
	
	//Methods are used for re-usability
	//method One  
	//I am creating static method so during their calling i do not need to create their objets 
	//i will just call them by their class name
	//see in areaMain class
	public static void rectangle() {
	System.out.println("Calculating Area of Rectangle : ");
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Length = ");
	int length = sc.nextInt();
	
	System.out.println("Breath = ");
	int breath = sc.nextInt();
	
	int area = length * breath;
	System.out.println("The areaa of rectangle is = " + area);
	
	System.out.println("________________END_____________________");
	
	}
	
	
	//method Two
	public static void square() {
		System.out.println("Calculating Area of Square :");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Side : ");
		int side = sc.nextInt();
		int area = side * side;
		System.out.println("The area of Square is = " + area);
		System.out.println("________________END___________________");
		
		
	
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
		System.out.println("______________END___________________");

}
}

