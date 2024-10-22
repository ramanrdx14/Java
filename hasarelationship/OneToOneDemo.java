package hasarelationship;

class Employee{
	String empname;
	String empid;
	Address addr;
	
	
	Employee(String empname,String empid,Address addr){
		this.empname = empname;
		this.empid   = empid;
		this.addr    = addr;
	}
	void showEmpDetails() {
		System.out.println("===============================");
		System.out.println("Employee Name :"+empname);
		System.out.println("Employee Id   :"+empid);
		System.out.println("Employee State:"+addr.state);
		
		System.out.println("Employee City :"+addr.city);
		System.out.println("Employee Location: "+addr.location);
	}
}
class Address{
	String state;
	String city;
	String location;
	
	Address(String state,String city,String location){
		this.state = state;
		this.city  = city;
		this.location = location;
	}
}

public class OneToOneDemo {
	public static void main(String[] args) {
		Address addr1 = new Address("JK","CHN","XYZ");
		Employee emp1   = new Employee("Raman","123",addr1);
		emp1.showEmpDetails();
		Address addr2 = new Address("JL","JHY","HYD");
		Employee emp2   = new Employee("GhU","198",addr2);
		emp2.showEmpDetails();
		
	}
}
