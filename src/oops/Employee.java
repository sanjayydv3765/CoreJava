package oops;

public class Employee {
	public String Name;
	public int EmpId;
	public String Dept;
	public Employee() {
		System.out.println("Default cons");
	}
	public Employee(String Name, int EmpId, String Dept) {
		this.Name=Name;
		this.EmpId =EmpId;
		this.Dept=Dept;
		
	}
	public void display() {
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Dept);
	}
}
