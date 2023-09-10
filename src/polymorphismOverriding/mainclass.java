package polymorphismOverriding;

public class mainclass {

	public static void main(String[] args) {
		Parent pp = new Parent();
		pp.ear();
		pp.eye();
		pp.nose();

		System.out.println("_________________");
		child cc = new child();
		cc.run();
		cc.walk();
		cc.eye();
		cc.ear();
		cc.nose();
		System.out.println("_________________");

	}

}
