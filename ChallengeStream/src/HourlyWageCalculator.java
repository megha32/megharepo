/*import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class HourlyWageCalculator 
	{
		List<Hwc> HwcList = new ArrayList<>();
		private char[] findcal;
		public  HourlyWageCalculator()
	{
			Hwc m1 = new Hwc("Jane", 7.50, 35);
			Hwc m2 = new Hwc("Sarah",8.20, 47);
			Hwc m3 = new Hwc("Harry",12.00,73);
			Hwc m4 = new Hwc("Sammy", 15.50,35);
			Hwc m5 = new Hwc("Samsung", 15.50, 47);
			Hwc m6 = new Hwc("Tom", 18.20, 47);
			Hwc m7 = new Hwc("Dave", 12.00, 73);
	 
	
			HwcList.add(m1);
			HwcList.add(m2);
			HwcList.add(m3);
			System.out.println("Enter name of the employee");
	
	}

		public  String findcal(String Name)
	    {
			List<Hwc> brand = HwcList.stream().filter(v->v.getName().equals(Name))
//					.map(v->v.getName_of_Employee())
					.collect(Collectors.toList());
//			System.out.println(Name_of_Employee);
	        return Name;
	    }
		public static void main(String[] args)
		{
			HourlyWageCalculator m5 = new HourlyWageCalculator();
			
			System.out.println(m5.findcal);
		//	System.out.println(m5.findPhoneCostMoreThan500$());
			//System.out.println(m5.findPhonePixelMoreThan12MP());
		}

		public void setName_of_Employee(String nameOfEmployee) {
			// TODO Auto-generated method stub
			
		}

		public void calculatepay(int hours_Worked, double rate) {
			// TODO Auto-generated method stub
			
		}

		public void display() {
			// TODO Auto-generated method stub
			
		}

		public void setName(String name) {
			// TODO Auto-generated method stub
			
		}

}*/
