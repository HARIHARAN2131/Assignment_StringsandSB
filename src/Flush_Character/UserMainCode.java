package Flush_Character;

public class UserMainCode {
	public static String getSpecialChar(String s1) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			char a = s1.charAt(i);
			if (!Character.isAlphabetic(a))
				sb.append(a);
		}
		return sb.toString();
	}
}
