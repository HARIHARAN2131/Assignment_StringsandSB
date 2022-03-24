package Reverse_SubString;

import java.util.Scanner;

public class Main {
	// Reverse Sub String Program
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the String :");
		String s1 = sc.nextLine();
		System.out.println("beginning index of Reverse string : ");
		int a = sc.nextInt();
		System.out.println("ending index of reverse string :");
		int b = sc.nextInt();
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse(); // Reverse function

		// reverseSubstring() with arguments
		System.out.println("string : " + UserMainCode.reverseSubstring(sb, a, b));
		sc.close();
	}
}