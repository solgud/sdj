
public class HourlyEmployee extends Employee {
	private double wagePerHour;
	private double hoursWorkedPerWeek;

	public HourlyEmployee(String name, Date birthday, double wagePerHour, double hoursWorkedPerWeek) {
		super(name, birthday);
		this.wagePerHour = wagePerHour;
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}
	
	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}
	
	public double getWagePerHour() {
		return this.wagePerHour;
	}

	public void setHoursWorkedPerWeek(double hoursWorkedPerWeek) {
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
	}
	
	public double getHoursWorkedPerWeek() {
		return this.hoursWorkedPerWeek;
	}
	
	@Override
	public double earningsPerWeek() {
		return this.wagePerHour * this.hoursWorkedPerWeek;
	}

	@Override	
	public String toString() {
		return super.toString() + ", "
				+ "Hourly Wage: " + this.wagePerHour + ", "
				+ "Hours Worked per Week: " + this.hoursWorkedPerWeek;
	}

	@Override	
	public boolean equals(Object obj) {
		if (!(obj instanceof HourlyEmployee)) {
			return false;
		}
		HourlyEmployee other = (HourlyEmployee) obj;
		return super.equals(other)
				&& this.hoursWorkedPerWeek == other.hoursWorkedPerWeek
				&& this.wagePerHour == other.wagePerHour;
	}
}
