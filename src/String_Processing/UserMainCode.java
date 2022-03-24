package String_Processing;

public class UserMainCode {
	public static String moveX(String s) {
		String s1 = s.replaceAll("[x]", "");
		String s2 = s.replaceAll("[^x]", "");
		s1 += s2;
		return s1 ;
	}

}
