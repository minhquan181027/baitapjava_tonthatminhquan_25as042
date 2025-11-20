package java3_1;

public class MyComplex {
private double real;
private double imag;
public MyComplex(double real, double imag) {
	super();
	this.real = real;
	this.imag = imag;
}
public double getReal() {
	return real;
}
public void setReal(double real) {
	this.real = real;
}
public double getImag() {
	return imag;
}
public void setImag(double imag) {
	this.imag = imag;
}
public void setValue(double real,double imag) {
	this.imag=imag;
	this.real=real;
}
public String toString() {
	  return real + "+" + imag + "i";
}
public boolean isReal() {
	return imag==0;
}
public boolean isImaginary() {
	return real==0;
}
public boolean equals( MyComplex another) {
	return this.imag==another.imag && this.real==another.real;
}
public boolean equals(double real,double imag) {
	return this.imag==imag && this.real==real;
}
public double magnitude() {
	return Math.sqrt(imag*imag +real*real);
}
public MyComplex addInto(MyComplex right) {
	this.imag+=right.imag;
	this.real=right.real;
	return this;
	
}
public MyComplex addNew (MyComplex right) {
	return new MyComplex(this.imag+=right.imag,this.real+=right.real);
}
}
