package java2_5;

public class Account  {
private int id;
private Customer customer;
private double balance=0;
public Account(int id, Customer customer, double balance) {
	super();
	this.id = id;
	this.customer = customer;
	this.balance = balance;
}
public Account(int id, Customer customer) {
	super();
	this.id = id;
	this.customer = customer;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
	
}
