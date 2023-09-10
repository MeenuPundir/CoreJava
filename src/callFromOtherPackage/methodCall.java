package callFromOtherPackage;
import methods.FindOutArea;
import polymorphismOverloading.DifferentShapes;

public class methodCall {
	public static void main(String[] args) {
		
		System.out.println("These two classes are from methods Package");
		FindOutArea.square();
		FindOutArea.circle();
				
		
		
		System.out.println("This class is from Polymorphism Package");
		DifferentShapes df = new DifferentShapes();
		df.area(10,20);
		
	}
	
	
	

}
