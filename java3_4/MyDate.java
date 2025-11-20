package java3_4;

public class MyDate {
	private int year, month, day;
	private String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Fec" };
	private String DAYS[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	private int[] Days_in_months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 10 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}

	public boolean isValidDate(int year, int month, int day) {
		if (year >= 1 && year <= 9999) {
			if (month >= 1 && month <= 12) {
				int dayMax = Days_in_months[month - 1];
				if (month == 2 && isLeapYear(year)) {
					dayMax = 29;
				}
				if (day >= 1 && day <= dayMax)
					return true;
			}
		}
		return false;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	

}
