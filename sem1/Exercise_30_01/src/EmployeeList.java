import java.util.ArrayList;

public class EmployeeList {
	private int size;
	private ArrayList<Employee> employees;
	
	public EmployeeList(int maxNumberOfEmployees) {
		// Not sure what to do with size and maxNumberOfEmployees,
		// as the relationship between the two is very unclear in the diagram.
		// I don't want to use a fixed-length array in a one-many relationship
		// But fixing max size is a little annoying with an ArrayList...
		// I think I'm going to set size to maxNumberOfEmployees,
		// then use size whenever I need to check or limit the array size,
		// like when I add an employee
		this.size = maxNumberOfEmployees;
		this.employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) throws MaximumEmployeesException {
		// Throw a specialized exception 
		// if adding an employee would exceed the predefined maximum
		if (employees.size() >= this.size) {
			throw new MaximumEmployeesException("Maximum employee number reached");
		}
		this.employees.add(employee);
	}
	
	// Find and remove a specific employee by reference
	// Pretty sure the remove() method in the ArrayList would do as well
	public void removeEmployee(Employee employee) {
		for (int i = 0; i < this.employees.size(); i++) {
			if (this.employees.get(i).equals(employee)) {
				this.employees.remove(i);
			}
		}
	}
	
	public int getNumberOfEmployees() {
		return this.employees.size();
	}
	
	public Employee[] getAllEmployees() {
		// Make a new array that will hold all the employees
		Employee[] allEmployees = new Employee[this.employees.size()];
		// Loop through the ArrayList
		for (int i = 0; i < this.employees.size(); i++) {
			// Assign the current index of the array to the current index of the ArrayList
			allEmployees[i] = this.employees.get(i);
		}
		// Outside the loop, return the array that holds all the employees
		return allEmployees;
	}
	
	// Find and return the total weekly earnings of all employees
	public double getTotalEarningsPerWeek() {
		double totalEarningsPerWeek = 0;
		for (Employee employee : this.employees) {
			totalEarningsPerWeek += employee.earningsPerWeek();
		}
		return totalEarningsPerWeek;
	}
	
	public String toString() {
		String stringToReturn = "Current number of employees: " + this.employees.size() + ", \n"
				+ "Maximum number of employees: " + this.size + ", \n";
		// Loop through the array
		// Add the toString() value from each element
		for (Employee employee : this.employees) {
			stringToReturn += employee.toString() + ", \n";
		}
		return stringToReturn;
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof EmployeeList)) {
			return false;
		}
		EmployeeList other = (EmployeeList) obj;

		// Flag for array equality
		boolean arraysAreEqual = true;
		// Loop through the ArrayLists
		for (int i = 0; i < this.employees.size(); i++) {
			// If the employees in each of the ArrayLists are not equal
			if (!(this.employees.get(i).equals(other.employees.get(i)))) {
				// Set the flag to false
				arraysAreEqual = false;
				break;
			}
		}
		return this.size == other.size && arraysAreEqual;
	}

}
