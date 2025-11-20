package java3_2;

public class MyPolynomial {
private double[] coeffs;
public MyPolynomial( double ... coeffs) {
	this.coeffs=coeffs;
}
public int getDegree(){
	return coeffs.length-1;
	
}
public String toString() {
	String s="";
	for(int i=coeffs.length-1;i>=0;i--) {
		if(coeffs[i]==0)
			continue;
		if(!s.isEmpty())
			s+="+";
		if(i==0)
			s+=coeffs[i];
		else
			s+=coeffs[i]+"x^"+i;
	}
	return s;
}
public 	int evaluate(double x) {
	int result=0;
	for(int i=0;i<coeffs.length-1;i++) {
		result+=coeffs[i]*Math.pow(x, i);
	}
	return result;
}
public MyPolynomial addInto(MyPolynomial right) {
	int maxDegree= Math.max(this.getDegree(), right.getDegree());
	double []newCoeffs= new double[maxDegree+1];
	for( int i=0; i<=maxDegree;i++) {
		double a=(i<=this.getDegree())?this.coeffs[i]:0;
		double b=(i<=right.getDegree())?right.coeffs[i]:0;
		newCoeffs[i]=a+b;
	}
	return new MyPolynomial( newCoeffs);
}
public MyPolynomial multiple( MyPolynomial right) {
	int newDegree= this.getDegree()+right.getDegree();
	double []newCoeffs= new double[newDegree+1];
	for( int i=0; i<=this.getDegree();i++) {
		for(int j=0;j<=right.getDegree();j++) {
			newCoeffs[i+j]+=this.coeffs[i]*right.coeffs[j];
		}
	}
	return new MyPolynomial(newCoeffs);
}
}
