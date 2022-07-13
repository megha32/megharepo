package dataType;

import java.util.Scanner;

class POLU{
	public static void main(String[] args) {
				 
			      int count=0;
			      String words[] = {"hannah","texas","renner","eleele"};
			      for(int i=0; i<words.length;i++)
			      {
			    	  String reverse ="";
			    	  String st=words[i];
			    	  char ch[]=st.toCharArray();
			    	  char cha[]=new char[ch.length];
			    	  for(int j=ch.length-1;j>=0;j--)
			    	  {
			    		  reverse = reverse + ch[j]  ;
			    	  }
			    	  if (words[i].equalsIgnoreCase(reverse)) 
			    	  {
			 	         System.out.println(words[i]+" is a palindrome.");  
			    	  count++;
			      }
			 	      else  
			 	         System.out.println(words[i]+" isn't a palindrome.");  
			 	      }
			       System.out.println(count);
			      
			
	}

}