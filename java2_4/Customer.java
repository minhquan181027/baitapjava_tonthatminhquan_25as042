package java2_4;



	public class Customer {
	 private int id,discount;
	 private String name;
	 public Customer(int id, String name,int discount) {
		super();
		this.id = id;
		this.discount = discount;
		this.name = name;
	 }
	 public int getDiscount() {
		return discount;
	 }
	 public void setDiscount(int discount) {
		this.discount = discount;
	 }
	 public int getId() {
		return id;
	 }
	 public String getName() {
		return name;
	 }
	 
	 public String toString() {
		 return name+"("+id+")"+"("+discount+"% )";
	 }
	}


