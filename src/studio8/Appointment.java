package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	



	@Override
	public String toString() {
		return "[Appointment: date=" + date + ", time=" + time + "]";
	}

	public static void main(String[] args) {
		Date d1 = new Date(4, 3 , 2018, false);
		Date d2 = new Date(4, 3 , 2018, false);
		Date d3 = new Date(5, 3 , 2018, false);
		Time t1 = new Time(12, 30, true);
		Time t2 = new Time(12, 30, false);
		Time t3 = new Time(12, 31, true);
		Appointment a1 = new Appointment(d1, t1);
		Appointment a2 = new Appointment(d1, t2);
		Appointment a3 = new Appointment(d1, t3);
		LinkedList<Appointment> calendar = new LinkedList<>();
		calendar.add(a1);
		calendar.add(a2);
		calendar.add(a3);
		System.out.println(calendar);
		calendar.remove(a3);
		System.out.println(calendar);
	}

}
