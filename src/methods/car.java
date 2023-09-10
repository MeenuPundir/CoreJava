package methods;

public class car {
	
	//Attribute
	int wheels;		//Global Variable(declared in outside the method but inside the class)
	public String color;		//Global Variable
	
	
	
	//Behavior
	//here i am creating non static methods
	public void CarWheels() {
		
		wheels=4;
		System.out.println("Number of wheels in the car is = " + wheels);
		
		
	}
	
	//Behavior
	public void Carcolor() {
		
		color = "Red";
		System.out.println("The color of the car is =" + color);
		
		
	}

}
