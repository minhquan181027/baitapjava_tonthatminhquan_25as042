package java1_8;



public class Time {
	private int second,minute,hour;

	public Time(int hour,int minute,int second) {
		
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	public String toString() {
		return hour+":"+minute+":"+second;
		
	}
	public Time nextSecond() {
		
		this.second++;
		if(this.second==60) {
			this.second=0;
			this.minute++;
			if(this.minute==60) {
				this.minute=0;
				this.hour++;
				if(this.hour==24) {
					this.hour=0;
				}
			}
		}
		return this;
	}
	public Time previousSecond() {
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
				
			}}
         return this;

		}
	public void setTime(int hour,int minute,int second) {
		this.hour=hour;
		this.second=second;
		this.minute=minute;
	}
}
