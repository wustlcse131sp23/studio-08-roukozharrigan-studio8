package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int day;
	private int month;
	private int year;
	private boolean holiday;
	
	public Date(int day, int month, int year, boolean holiday) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.holiday = holiday;
	}
	
	public String toString() {
		String isHoliday = "";
		if (this.holiday == true)
			isHoliday = "(holiday)";
		else
			isHoliday = "";
		return this.day + "." + this.month + "." + this.year + isHoliday ;
	}
	
	

    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
    	Date d1 = new Date(25, 12, 2004, true);
    	Date d2 = new Date(25, 12, 2004, true);
    	//Date d3 = new Date(11, 9, 2002, false);
    	//Date d4 = new Date(9, 8, 1990, true);
    	//Date d5 = new Date(28, 9, 2004, true);
    	//System.out.println(d1.toString());
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(d1);
    	list.add(d2);
    	list.add(d1);
    	//list.add(d3);
    	//list.add(d4);
    	//list.add(d5);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(d1);
    	set.add(d2);
    	set.add(d1);
    	System.out.println(set);
    }

}
