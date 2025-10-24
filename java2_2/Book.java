package java2_2;

import java.util.Arrays;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty;

	public Book(String name, Author[] authors, double price) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		super();
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public Author[] getAuthors() {
 return this.authors;}
	

	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty
				+ "]";
	}

	public String getAuthorNames() {
		String s="";
		for(int i=0;i<authors.length;i++) {
//			
			if(i==authors.length-1)
				s+=authors[i].getName();
			else
				s+=authors[i].getName()+", ";
		}
		return s;
	}
}
