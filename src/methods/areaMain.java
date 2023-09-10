package methods;

public class areaMain {
public static void main (String[] args)
{
	/**
	FindOutArea fa = new FindOutArea();
	fa.rectangle();
	fa.square(); 
	*/
	//NOTE: Because rectangle, square,circle these methods are declared as a static method thats why
	//I do not need to make an object for them , i can directly call these methods by their class name i.e FindOutArea
	FindOutArea.rectangle();
	FindOutArea.square();
	FindOutArea.circle();
}
	
	
}
