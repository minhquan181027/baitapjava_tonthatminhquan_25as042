package java4_2;

public class Person {
protected String name;
protected String address;
public Person(String name,String address) {
	this.address=address;
	this.name=name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getName() {
	return name;
}
public String toString() {
	return "Person[name="+name+",address="+address+"]";
}

}
