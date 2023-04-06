package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean isMilitary;
	
	public Time(int hour, int minute, boolean isMilitary) {
		this.hour = hour;
		this.minute = minute;
		this.isMilitary = isMilitary;
	}
	
	public String toString() {
		String hr = "";
		if (isMilitary == true) {
			hr = hr + this.hour;}
		else {
			if (this.hour >= 12) 
				hr = hr + (this.hour - 12);
			else 
				hr = hr + this.hour;
		}
		return hr + ":" + this.minute;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time t1 = new Time(15, 20, false);
		Time t2 = new Time(15, 20, true);
		Time t3 = new Time(10, 20, true);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
    	
		boolean dora = t3.equals(t2);
		System.out.println(dora);
    }

}