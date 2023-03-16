package mavenexception;

public class empmav {
	String name;
	int emp_id;
	String mail_id;
	String mob_num;
	String address;
	String location;
	double salary;
	public empmav(int emp_id,String name, String mail_id, String mob_num, String address, String location, double salary) {
		super();
		this.emp_id=emp_id;
		this.name = name;
		this.mail_id = mail_id;
		this.mob_num = mob_num;
		this.address = address;
		this.location = location;
		this.salary = salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
//	@Override
//	public String toString() {
//		return "employee [emp_id=" +name=" + name + ", emp_id=" + mail_id + ", mob_num=" + mob_num + ", address=" + address
//				+ ", location=" + location + ", salary=" + salary + "]";
	//}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getmail_id() {
		return mail_id;
	}
	public void setmail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getMob_num() {
		return mob_num;
	}
	public void setMob_num(String mob_num) {
		this.mob_num = mob_num;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	


}


