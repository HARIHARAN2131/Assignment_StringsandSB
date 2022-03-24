package Occurance_Count;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Line");
		String s = sc.nextLine();
		System.out.println("Enter a Word ");
		String s1 = sc.next();
		int count = UserMainCode.countWords(s, s1);
		System.out.println("No.of words : " + count);
		sc.close();
	}
}
