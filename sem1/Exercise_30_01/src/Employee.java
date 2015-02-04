
public abstract class Employee {
	private String name;
	private Date birthday;
	
	public Employee(String name, Date birthday) {
		this.name = name;
		// Get a private copy of the birthday being passed in
		this.birthday = birthday.copy();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getBirthday() {
		// Relationship is composition
		// Return a copy, not the private object
		return this.birthday.copy();
	}
	
	public String toString() {
		return "Name: " + this.name + ", "
				+ "Birthday: " + this.birthday.toString();
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		return this.name.equals(other.name)
				&& this.birthday.equals(other.birthday);
	}
	
	public abstract double earningsPerWeek();

}
