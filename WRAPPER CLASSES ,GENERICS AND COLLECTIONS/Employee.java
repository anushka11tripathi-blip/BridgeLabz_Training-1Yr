
import java.util.*;
class Employee
{
	private String name;
	private int id;
	private String email;
	public  Employee(String name, int id, String email)
	{
		this.name = name;
		this.id = id;
		this.email = email;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getid()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String toString()
	{
	 return "Employee{name='" + name + "', id=" + id + ", email='" + email + "'}";
	
	}	
}
public class EmployeeManagement
{
	public static void main(String args[])
	{
	Employee e1  = new Employee ("anushka" , 1111 , "anu@gmail.com");
		Employee e2  = new Employee ("ishika" , 1001 , "ishi@gmail.com");
		Employee e3  = new Employee ("vanshika" , 1011 , "vanshi@gmail.com");
		Employee e4  = new Employee ("harshit" , 1010 , "harsh@gmail.com");
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		System.out.println(al);
		for (Employee e : al)
		{
		System.out.println(e);	
		}
		Employee updatedEmp  = new Employee ("rishi" , 1100 , "rishi@gmail.com");
		al.set(2,updatedEmp);
		System.out.println(al);
	}
}
		 