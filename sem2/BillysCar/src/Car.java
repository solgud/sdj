
public class Car {
	private int powerOnCounter;

	public Car() {
		this.powerOnCounter = 0;
	}
	
	public void turnOn() {
		powerOnCounter++;
		System.out.println("<< Turning on >>");
		if(powerOnCounter % 3 == 0 && powerOnCounter % 2 == 1) {
			System.out.println("I'm shining my headlights and going backwards!");
		}
		else if(powerOnCounter % 2 == 0) {
			System.out.println("I'm shining my headlights!");
		}
		else {
			System.out.println("I'm shining my headlights and going forwards!");
		}
	}
	
	public void turnOff() {
		System.out.println("<< Turning off >>");
		System.out.println("I'm shutting off my headlights!");
		System.out.println("I'm stopping!");
	}

}
