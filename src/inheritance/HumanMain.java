package inheritance;

public class HumanMain {
	public static void main(String[] args) {
		parent pp = new parent();
		pp.eyes();
		pp.hands();
		System.out.println("____");
		
		child cc = new child();
		cc.eyes();
		cc.hands();
		cc.walk();
		cc.run();
		System.out.println("___");
		
		
		grandchild gg = new grandchild();
		gg.eyes();
		gg.hands();
		gg.eat();
		gg.walk();
		gg.run();
		gg.eat();
		gg.sleep();
		System.out.println("__");
		}
	}
