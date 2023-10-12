package oopsDemos;
class Employee
{
	public int empID;
	public String empName;
	public Employee()
	{
		empID=111;
		empName="E";
		
	}
	public Employee(int id, String name)
	{
		empID=id;
		empName=name;
	}
	public void display()
	{
		System.out.println("ID is" + empID);
		System.out.println("emp name is" + empName);
	}
}

public class UsingConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.display();
		Employee e2=new Employee(508,"mizba");
		e2.display();
		Employee e3=new Employee();
		e3.empID=2312;
		e3.empName="Azam";
		e3.display();
		
	}
	

}
