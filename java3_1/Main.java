package java3_1;
public class Main{
	
    public static void main(String[] args) {
       
        MyComplex c1 = new MyComplex(3.1, 4.05);
        MyComplex c2 = new MyComplex(1.9, -2.05);

        System.out.println("=== TEST MyComplex CLASS ===");
        System.out.println("c1 = " + c1); // In ra 3.1+4.05i
        System.out.println("c2 = " + c2); // In ra 1.9+-2.05i

        
        System.out.println("\n-- Check Real and Imaginary --");
        System.out.println("c1 is real? " + c1.isReal());
        System.out.println("c2 is imaginary? " + c2.isImaginary());

        
        System.out.println("\n-- Equals --");
        System.out.println("c1 equals c2? " + c1.equals(c2));
        System.out.println("c1 equals (3.1, 4.05)? " + c1.equals(3.1, 4.05));

        
        System.out.println("\n-- Magnitude --");
        System.out.println("Magnitude of c1 = " + c1.magnitude());

        
        System.out.println("\n-- Add Into (modify c1) --");
        c1.addInto(c2);
        System.out.println("After c1.addInto(c2): c1 = " + c1);

        
        System.out.println("\n-- Add New (create new object) --");
        MyComplex c3 = c1.addNew(c2);
        System.out.println("New complex (c3 = c1 + c2): " + c3);

       
        System.out.println("\n-- Set New Value --");
        c1.setValue(5.0, 0.0);
        System.out.println("After setValue(5.0, 0.0): c1 = " + c1);
        System.out.println("c1 is real? " + c1.isReal());
    }
}
