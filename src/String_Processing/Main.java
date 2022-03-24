package String_Processing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		System.out.println("String : " + UserMainCode.moveX(s));
		sc.close();
	}

}
