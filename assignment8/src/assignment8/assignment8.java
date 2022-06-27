package assignment8;
import java.util.*;
public class assignment8 {
	public static void main(String args[]) {
		ArrayList l1=new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		ArrayList l2=new ArrayList();
		l2.add(6);
		l2.add(7);
		l2.add(8);
		l2.add(9);
		l2.add(10);
		System.out.println(l1);
		System.out.println(l2);
		if(l1.size()==l2.size()) {
			System.out.println(l2.get(0)+"," + l1.get(1)+"," +l2.get(2)+"," +l1.get(3)+"," +l2.get(4));
		}
		
	}
	

}
