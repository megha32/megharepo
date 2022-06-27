package assignment1;
import java.util.*;
public class assignment14 {
	
	public static void main(String[] args) {
		 String[] ip={"Vikas","Lokesh","Ashok"};
		 System.out.println(getTheNamesinGivenFormat(ip));
		}
		public static String getTheNamesinGivenFormat(String[] ip) {
		 StringBuffer sb=new StringBuffer();
		 for(int i=0;i<ip.length;i++)
		  sb.append(ip[i]).append(',');
		 sb.deleteCharAt(sb.length()-1);
		 return sb.toString();
		}
}
