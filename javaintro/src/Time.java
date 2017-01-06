public class Time {

	private long hour;
	private long minute;
	private long second;

	public Time() {
		this(System.currentTimeMillis());
	}

	public Time(long elapseTime) {
		long totalSeconds = elapseTime / 1000;
		second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public long getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(long elapseTime) {
		long totalSeconds = elapseTime / 1000;
		this.second = (int) (totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		this.minute = (int) (totalMinutes % 60);
		int totalHours = (int) (totalMinutes / 60);
		this.hour = (totalHours % 24);
	}
}