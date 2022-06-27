package assignment4;
import java.util.*;
public class assignment4 {
	public static void main(String args[])
	{
		ArrayList list1=new ArrayList();
		 list1.add("apple");
		 list1.add("orange");
		 list1.add("grapes");
		 ArrayList list2=new ArrayList();
		 list2.add("melon");
		 list2.add("apple");
		 list2.add("mango");
		 System.out.println(list1);
		 System.out.println(list2);
		String[] s2=fruitsList(list1,list2);
		for(String s3:s2)
			System.out.println(s3);
		}
		 public static String[] fruitsList(List<String>list1,List<String>list2) {
			 List<String>list3=new ArrayList<String>();
			 for(int i=0;i<list1.size();i++)
			 {
				 String s1=list1.get(i);
				 if(s1.charAt(0)!='a'&& s1.charAt(0)!='A'&&s1.charAt(0)!='g'&&s1.charAt(0)!='G')
					 list3.add(s1);}
				 for(int i=0;i<list2.size();i++){
					  String s1=list2.get(i);
					  if(s1.charAt(s1.length()-1)!='n' && s1.charAt(s1.length()-1)!='N' && s1.charAt(s1.length()-1)!='e' && s1.charAt(s1.length()-1)!='E')
					   list3.add(s1); }
					 Collections.sort(list3);
					 String[] s2=new String[list3.size()];
					 for(int i=0;i<s2.length;i++)
					  s2[i]=list3.get(i);
					 return s2;
			 }
			 
}
