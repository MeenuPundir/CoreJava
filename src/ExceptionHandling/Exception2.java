package ExceptionHandling;

public class Exception2 {

	public static void main(String[] args) {

		String name = null;

		try {
			System.out.println(name.length());
		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Compilation Continue...........");
	}

}
