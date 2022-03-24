package Playing_with_String;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the NO.Of strings in an Aaray : ");
		int n = Integer.parseInt(in.nextLine());
		String s1[] = new String[n];

		for (int i = 0; i < n; i++) { // Intput Loop
			System.out.println("Enter String " + (i + 1) + " : ");
			s1[i] = in.nextLine();
		}
		int a = Integer.parseInt(in.nextLine());
		System.out.println("String : " + UserMainCode.formString(s1, n, a));// Function Calling
		in.close();
	}

}
