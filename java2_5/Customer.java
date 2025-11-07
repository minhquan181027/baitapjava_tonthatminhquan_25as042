package java2_5;

public class Customer {
private int id;
private String name;
private char gender;
public Customer( int id,String name,char gender) {
	this.id=id;
	this.name=name;
	this.gender=gender;
}
public int getId() {
	return this.id;
}
public void setId(int id) {
	this.id=id;
}
public  String getName() {
	return this.name;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}
public void setName(String name) {
	this.name = name;
}
public String toSring() {
	return name+"("+id+")";
}
}
