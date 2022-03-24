package Playing_with_String;

public class UserMainCode {
	// String Program

	public static String formString(String s1[], int n, int a) { // Function definition
		StringBuffer sb = new StringBuffer();// declaration of String Buffer
		for (int i = 0; i < n; i++) {
			if (s1[i].length() >= a) // Getting N'th Character
				sb.append(s1[i].substring(a - 1, a));
			else
				sb.append("$");
		}
		return sb.toString();
	}
}
