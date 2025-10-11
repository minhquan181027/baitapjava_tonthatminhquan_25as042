package java1_4;

public class Employee {
private int id,salary;
private String firstName,lastName;
public Employee(int id,  String firstName, String lastName,int salary) {
	super();
	this.id = id;
	this.salary = salary;
	this.firstName = firstName;
	this.lastName = lastName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAnnualSalary() {
	return salary*12;
}
public int raiseSalary(int percent) {
	return this.salary*(1+percent/100);
}
public String getName() {
	return this.getFirstName()+" "+this.getLastName();
}

	

public String toString() {
	return "Employee [id=" + id + ", salary=" + salary + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}

}
