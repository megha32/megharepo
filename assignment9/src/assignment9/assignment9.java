package assignment9;
import java.util.*;
public class assignment9 {
	
	 public static void main(String args[]) {
		 Scanner scan=new Scanner(System.in);
		 String[] s={"red","green","blue","ivory"};

		 int n=scan.nextInt();

		 System.out.println(retrievingRequiredColor(s,n));
		 System.out.println(s);
		 }

		 public static String retrievingRequiredColor(String[] s, int n) {

		 String s1=new String();

		 ArrayList<String> I=new ArrayList <String>();
				 for(int i=0;i<s.length;i++)
                   I.add(s[i]);
		 

		 Collections.sort(I,Collections.reverseOrder()); 
		 for(int i=0;i<I.size();i++)

		 if(i==(n-1))

		 s1=I.get(i);

		 return s1;

		 }
	 
}
