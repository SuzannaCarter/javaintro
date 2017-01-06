public class TestTime {
	public static void main(String[] args) {
	   Time time1 = new Time();
	   Time time2 = new Time(555550000);
	   
	   System.out.println("Time 1: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond() + " GMT");
	   System.out.println("Time 2: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond() + " GMT");
	}
}