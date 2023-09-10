package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDay1 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter num=:");
			int num = sc.nextInt();

			System.out.println("Enter num1=:");
			int num1 = sc.nextInt();
			try {

				int div = num / num1;

				System.out.println("The division=:" + div);
			} catch (Exception e) {
				e.printStackTrace();
			}

			finally {
				sc.close();
			}
			System.out.println("The Compilation Continue");
		}

	}

