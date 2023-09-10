package ExceptionHandling;

import java.util.Scanner;

public class Exception3 {
	// user defined exception = throw

		// throws : 1:- method signature
		// 2:- it populate

		public void vote() throws Exception {
			Scanner sc = new Scanner(System.in);

			System.out.println("Age=:");
			int age = sc.nextInt();

			if (age >= 18) {
				System.out.println("You can vote");
			} else {
				throw new Exception("Under age");
			}

		}


}
