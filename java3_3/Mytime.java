package java3_3;

public class Mytime {
private int hour,minute,second;

public Mytime(int hour, int minute, int second) {
	super();
	this.hour = hour;
	this.minute = minute;
	this.second = second;
}

public int getHour() {
	return hour;
}

public void setHour(int hour) {
	this.hour = hour;
}

public int getMinute() {
	return minute;
}

public void setMinute(int minute) {
	this.minute = minute;
}

public int getSecond() {
	return second;
}

public void setSecond(int second) {
	this.second = second;
}
public void setTime( int hour,int minute,int second) {
	this.hour=hour;
	this.minute=minute;
	this.second=second;
}
public String toString() {
	return 	String.format("%02d:%02d:%02d",hour,minute,second);
}
public Mytime nextSecond() {
	second++;
	if(second==60) {
		second=0;
		minute++;
		if(minute==60) {
			minute=0;
			hour++;
			if(hour==24) {
				hour=0;
			}
		}
	} return this;
}
public Mytime nextMinute() {
	minute++;
	if(minute==60) {
		minute=0;
		hour++;
		if(hour==24) {
			hour=0;
		}
	}return this;
}
public Mytime nextHour() {
	hour++;
	if(hour==24)
		hour=0;
	return this;
}
public Mytime previousSecond() {
	second--;
	if(second<0) {
		second=59;
		minute--;
		if(minute<0) {
			minute=59;
			hour--;
			if(hour<0) {
				hour=23;
			}
		}
	} return this;
}
public Mytime previousMinute() {
	minute--;
	if(minute<0) {
		minute=59;
		hour--;
		if(hour<0) {
			hour=23;
		}
	}
 return this;
}
public Mytime previousHour() {
	hour--;
	if(hour<0)
		hour=23;
	return this;
}
}
