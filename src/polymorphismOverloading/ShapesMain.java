package polymorphismOverloading;

public class ShapesMain {

	public static void main(String[] args) {
		
		DifferentShapes df = new DifferentShapes();
		df.area();
		df.area(2.5f);
		df.area(5);
		df.area(6,8);
		
		
	}
}
