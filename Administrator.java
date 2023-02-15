package lab6;

public class Administrator extends HospitalEmployee {
	
	private String department;
	
	public Administrator (String empName, int empNumber, String empDepartment) {
		super(empName, empNumber);
		department = empDepartment;
	}
	public void setDepartment(String empDepartment) {
		department = empDepartment;
	}
	public String getDepartment() {
		return department;
	}
	public String toString() {
		return super.toString() + "\t" + department;
	}
	public void administrate() {
		System.out.println(name + " is a(n) " + department + " administrator");
	}
}
