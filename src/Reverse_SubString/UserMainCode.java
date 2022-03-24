package Reverse_SubString;

public class UserMainCode {
	public static String reverseSubstring(StringBuffer sb, int a, int b) {
		StringBuffer sb1 = new StringBuffer();
		String ss = sb1.append(sb.substring(a, a + b)).toString(); // String Starting and Ending by using Substring()
																	// Raja sth an 2 3 nahtsajaR- hts
		return ss;
	}
}
