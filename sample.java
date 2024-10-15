package RegularPractise;

import java.util.Scanner;

public class Subjects {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of subjects");
		System.out.println("maths");
		System.out.println("telugu");
		System.out.println("science");
		System.out.println("enter subject");
		String subject = scanner.next();
		int flag = 0;
		while (flag < 3) {
			if (subject.equalsIgnoreCase("maths")) {
				System.out.println("1.addition");
				System.out.println("2.sub");
				System.out.println("3.multiplction");
				System.out.println("4.div");
			}
			System.out.println("select an option");
			int n = scanner.nextInt();

			int C = 0;
			int A, B;
			switch (n) {
			case 1:
				System.out.println("enter 1st num");
				A = scanner.nextInt();
				System.out.println("enter 2nd num");
				B = scanner.nextInt();
				System.out.println("addition of two numbers");
				C = A + B;
				System.out.println(C);
				flag = flag + 1;
				break;

			case 2:
				System.out.println("enter 1st num");
				A = scanner.nextInt();
				System.out.println("enter 2nd num");
				B = scanner.nextInt();
				System.out.println("substraction of two numbers");
				C = A - B;
				System.out.println(C);
				flag = flag + 1;
				break;
			case 3:
				System.out.println("enter 1st num");
				A = scanner.nextInt();
				System.out.println("enter 2nd num");
				B = scanner.nextInt();
				System.out.println("multliplication of two numbers");
				C = A * B;
				System.out.println(C);

				flag = flag + 1;
				break;
			case 4:
				System.out.println("enter 1st num");
				A = scanner.nextInt();
				System.out.println("enter 2nd num");
				B = scanner.nextInt();
				System.out.println("division of two numbers");
				C = A / B;
				System.out.println(C);
				flag = flag + 1;
				break;
			default:
				System.out.println("please select valid number");

			}

		}
		System.out.println("paalakura");
	}
}
