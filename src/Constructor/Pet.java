package Constructor;

public class Pet {
	
	
	//Constructor
	
	// 1. default: java compiler create a default constructor at the time of object creation
	// 2. Non parameterized constructor
	// 3. Parameterized constructor
	
	//Non parameterized constructor
	public Pet() {
		System.out.println("My name is Oreo");
		
	}
	
	//Behaviors
	
	public void type()
	{
		System.out.println("I am a guine pig");
		
	}
	
	public void run() {
		System.out.println("I can run very fast");
	

	}

	//Parameterized constructor
	public Pet(int height)
	{
		System.out.println("My name is Softy");
		
	}


}
