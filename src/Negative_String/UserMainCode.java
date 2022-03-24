package Negative_String;

public class UserMainCode {
	public static String negativeString(String s) {
		String n = s.replaceAll(" is ", " is not ");
		return n;
	}
}
