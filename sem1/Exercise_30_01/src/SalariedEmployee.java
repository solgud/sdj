
public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee(String name, Date birthday, double weeklySalary) {
		super(name, birthday);
		this.weeklySalary = weeklySalary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public double getWeeklySalary() {
		return this.weeklySalary;
	}

	@Override
	public double earningsPerWeek() {
		return this.weeklySalary;
	}
	
	@Override	
	public String toString() {
		return super.toString() + ", "
				+ "Weekly Salary: " + this.weeklySalary;
	}
	
	@Override	
	public boolean equals(Object obj) {
		if (!(obj instanceof SalariedEmployee)) {
			return false;
		}
		SalariedEmployee other = (SalariedEmployee) obj;
		return super.equals(other) 
				&& this.weeklySalary == other.weeklySalary;
	}

}
