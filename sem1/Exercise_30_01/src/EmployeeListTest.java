import java.util.ArrayList;


public class EmployeeListTest {

	public static void main(String[] args) {
		// Test the EmployeeList class

		// Make a few employees
		HourlyEmployee alice = new HourlyEmployee("Alice", new Date(1, 1, 1970), 20, 40);
		HourlyEmployee bob = new HourlyEmployee("Bob", new Date(1, 1, 1980), 15, 35);
		SalariedEmployee carol = new SalariedEmployee("Carol", new Date(2, 2, 1970), 750);
		SalariedEmployee david = new SalariedEmployee("David", new Date(5, 5, 1955), 1555);
		SalariedEmployee erik = new SalariedEmployee("Erik", new Date(1, 1, 1992), 400);
		HourlyEmployee fran = new HourlyEmployee("Fran", new Date(1, 1, 1990), 10, 30);

		// Now make a new EmployeeList
		EmployeeList employeeList = new EmployeeList(5);

		// Test each of the methods
		try {
			employeeList.addEmployee(alice);
			employeeList.addEmployee(bob);
			employeeList.addEmployee(carol);
			employeeList.addEmployee(david);
		} catch (MaximumEmployeesException e) {
			System.out.println("Exceeded the maximum number of employees");
		}
		
		employeeList.removeEmployee(david);
		
		System.out.println(employeeList.getNumberOfEmployees());
		
		Employee[] employees = employeeList.getAllEmployees();
		
		System.out.println("Total earnings per week: " + employeeList.getTotalEarningsPerWeek());
		
		System.out.println(employeeList.toString());
		
		System.out.println(employeeList.equals(employees));

	}

}
