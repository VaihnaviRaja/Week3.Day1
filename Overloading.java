package Week3.Day1;

public class Overloading {
	public void employeeDetails() {
		System.out.println("Employee Details");

	}
	public void employeeDetails(int id)
	{
		System.out.println("ID "+id);
	}
	public void employeeDetails(int id,String name)
	{
		System.out.println("ID "+" "+"Name: "+id+name);
	}
	public void employeeDetails(String name)
	{
		System.out.println("Name:"+name);
	}
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.employeeDetails();
		o.employeeDetails(5);
		o.employeeDetails("Aishu");
		o.employeeDetails(6,"Brindha");
	}
}
