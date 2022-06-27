package assignment3;
import java.util.*;
import java.util.ArrayList;

public class assignment3 {
	public static int[] equalsEquals(List<Integer> a1,List<Integer> a2) {
		List<Integer>a3=new ArrayList<Integer>();
		List<Integer>a4=new ArrayList<Integer>();
		a3.addAll(a1);
		a4.addAll(a2);
		a1.removeAll(a2);
		a4.removeAll(a3);
		a1.addAll(a4);
		int o[]=new int[a1.size()];
		for(int j=0;j<o.length;j++)
			o[j]=a1.get(j);
		return o;
	}
	public static void main(String args[]) {
		
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		
		ArrayList a2=new ArrayList();
		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(5);
		int o[]=equalsEquals(a1,a2);
		for(int i:o)
		System.out.println(i);
	}
	

		}
