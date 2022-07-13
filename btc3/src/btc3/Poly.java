package btc3;
import java.util.*;
public class Poly {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int ph=scan.nextInt();
		if(ph<7)
		{
			System.out.println("ph value is low partial water change required");
		}
		else if(ph>=7&&ph<=8)
		{
			System.out.println("ph value is fine");
		}
		else
		{
			System.out.println("pH value is high, partial water change required");
		}
	}

}
