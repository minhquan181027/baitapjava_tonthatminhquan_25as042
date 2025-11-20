package java2_2;



public class Main {
	public static void main(String[] args) {
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1]= new Author("minhquan","minhquan181027@gmail.com",'m');

		// Declare and allocate a Book instance
		Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);  // toString(
System.out.println(javaDummy.getAuthorNames());
	}
}
