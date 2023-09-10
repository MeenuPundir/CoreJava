package InheritanceDemo;

public class ComputerMain {
	
	public static void main(String[] args) {
		
		Computer cc = new Computer();
		cc.Ram();
		cc.Rom();
		System.out.println("__________________________");
		
		
		Desktop dd = new Desktop();
		dd.Ram();
		dd.Rom();
		dd.screen();
		dd.cpu();
		System.out.println("__________________________");
		
		Laptop lp = new Laptop() ;
		lp.Ram();
		lp.Rom();
		lp.graphics();
		lp.keyboard();
		System.out.println("__________________________");
		
		
		MacOS ma = new MacOS();
		ma.Ram();
		ma.Rom();
		ma.graphics();
		ma.keyboard();
		ma.price();
		ma.version();
		System.out.println("__________________________");
		
		
		Windows wn = new Windows();
		wn.Ram();
		wn.Rom();
		wn.graphics();
		wn.keyboard();
		wn.model();
		wn.year();
		
		
		
		
		
		
		
	}

}
