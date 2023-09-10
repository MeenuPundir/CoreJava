package methods;

public class CarMain {

	public static void main(String[] args) {
		
		
		//NOTE: Because CarWheel,CarColor these methods are non static methods thats why
		//I need to make an object for them , i can not call them directly by their class name as i was 
		//able to call static methods 
		car cr = new car();
		cr.CarWheels();
		cr.Carcolor();
	}
}
