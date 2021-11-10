import java.util.*;
public class Collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lis=new LinkedList<String>();
		lis.add("23-10-2000");
	
	}

}



CONTACT.JAVA



public class Contact {
	
	private String name;
	private String Email;
	private String Gender;
	public Contact(String name, String email, String gender) {
		super();
		this.name = name;
		Email = email;
		Gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return Email;
	}
	public String getGender() {
		return Gender;
	}
	public String toString() {
		return ""+this.name+" "+this.Email+" "+this.Gender;
	}
}

COLLECTION.JAVA



import java.util.*;
class animal{
	void anmm()
	{
		System.out.println("This is Animal");
	}
}
class dogs extends animal{
	void bark() {
		System.out.println("Baauu Baauu");
	}
}
class ang extends dogs{
	void barks() {
		System.out.println("Abc");
	}
}
public class collectionPrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dogs o=new dogs();
		o.anmm();
		o.bark();
		
	}
	

}



EMPLOYEE.JAVA


import java.util.*;
public class employee {
	private int id;
	private String name;
	private String department;
	private int salary;

	public employee(int id,String name,String department,int salary) {
		super();
		this.id=id;
		this.name = name;
		this.department=department;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "ID : "+id+" --------Name : "+name+" -------Department : "+department+" ---------Salary : "+salary;
	}
}
class MyNameComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
class MyIdComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class MyDepComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
	
}
class MySalaryComp implements Comparator<employee>{

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub

		if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
		
