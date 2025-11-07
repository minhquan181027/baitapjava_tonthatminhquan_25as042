package java3_4;

public class MyDate {
private int year ,month ,day;
private String[] Months= {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
private String[] Days= {"Sunday","Monday","TuesDay","Wednesday","Thursday","Friday","Saturday"};
private int [] Days_In_Months= {31,28,31,30,31,30,31,31,30,31,30,31};
public boolean isLeapYear(int year) {
	if((year%4==0 && year%100!=0)||(year%400==0)) {
		return true;
	}
	return false;
}
public boolean isValidDay( int year,int month,int day) {
	if(year>=1 && year<=9999) {
		if(month>=1 &&month<=12) {
			if(day==28||day==29||day==30||day==31) {
				return true;
			}
		}
	}
	return false;
}
public int getDayOfWeek(int year,int month,int day) {
	for(int i=0; i<this.Days.length;i++) {
			 
	}
	
}
}
