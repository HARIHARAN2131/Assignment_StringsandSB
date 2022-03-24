package Replication;

public class UserMainCode {
	public static String repeatString(String s,int n){
	    
	    StringBuffer sb=new StringBuffer();
	    for(int i=0;i<n;i++)
	    {
	      sb.append(s);
	    }
	    
	    return sb.toString();
	}
}
