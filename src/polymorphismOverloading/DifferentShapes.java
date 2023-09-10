package polymorphismOverloading;

public class DifferentShapes {
	
	public void area() {
		System.out.println("we are going to find out area of different shapes:");
		
	}
	
	public void area (int side) {
		int area = side*side;
		System.out.println("area of Square is = " + area);
	
	}
	public void area (int l, int b) {
		int area = l*b;
		System.out.println("area of Rectangle is = "+ area);
		
	}
	
	public void area (float r){
	 double area = 3.14*r*r;
	 System.out.println("area of Circle is = " + area);
	}
	
	
		
				
	}
