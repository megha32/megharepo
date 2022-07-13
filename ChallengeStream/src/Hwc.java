
public class Hwc {
	private String Name;	
	private int Base_Pay ;
	private int Hours_Worked;
	public String getName_of_Employee() {
		return Name;
	}
	public void setName_of_Employee(String name_of_Employee) {
		Name = name_of_Employee;
	}
	public int getBase_Pay() {
		return Base_Pay;
	}
	public void setBase_Pay(int base_Pay) {
		Base_Pay = base_Pay;
	}
	public int getHours_Worked() {
		return Hours_Worked;
	}
	public void setHours_Worked(int hours_Worked) {
		Hours_Worked = hours_Worked;
	}
	public Hwc(String name_of_Employee, double Base_Pay, int hours_Worked) {
		super();
		this.Name= name_of_Employee;
		this.Base_Pay = (int) Base_Pay;
		this.Hours_Worked = hours_Worked;
	}
	@Override
	public String toString() {
		return "Hwc [Name_of_Employee=" + Name + ", Base_Pay=" + Base_Pay + ", Hours_Worked=" + Hours_Worked
				+ ", getName_of_Employee()=" + getName_of_Employee() + ", getBase_Pay()=" + getBase_Pay()
				+ ", getHours_Worked()=" + getHours_Worked() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
