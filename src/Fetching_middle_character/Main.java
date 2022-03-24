package Fetching_middle_character;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Fetching middle character
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String s = sc.next();
		String str = UserMainCode.getMiddleChars(s);//function call
		System.out.println("A Middle Character : " + str);
		sc.close();
	}
}
