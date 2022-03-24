package Start_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Line :");
		String s = sc.nextLine();
		System.out.println("Upper Case of Starting letter of a given Line : " + UserMainCode.printCapitalized(s));
		sc.close();
	}

}
