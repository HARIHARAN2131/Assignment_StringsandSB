package Fetching_middle_character;

public class UserMainCode {
	public static String getMiddleChars(String s) {
		StringBuffer sb = new StringBuffer();
		String s2 = null;
		if (s.length() % 2 == 0) {
			sb.append(s.substring(s.length() / 2 - 1, s.length() / 2 + 1));//Training 
		}
		s2 = sb.toString();
		return s2;
	}
}
