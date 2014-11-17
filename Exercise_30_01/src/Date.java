
public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void set(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public Date copy() {
		return new Date(this.day, this.month, this.year);
	}

	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Date)) {
			return false;
		}
		Date other = (Date) obj;
		return this.day == other.day
				&& this.month == other.month
				&& this.year == other.year;
	}

}
