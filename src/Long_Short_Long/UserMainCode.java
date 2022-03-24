package Long_Short_Long;

public class UserMainCode {
	public static String getCombo(String s1,String s2) {
		if(s1.length()>s2.length())
			return s1+s2+s1;
		return s2+s1+s2;
	}

}
