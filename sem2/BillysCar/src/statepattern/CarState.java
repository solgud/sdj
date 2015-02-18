package statepattern;

public abstract class CarState implements CarConstants {

	public void pressButton(Car car) {
		
	}

	public String getStatus() {
		return this.getClass().getSimpleName();
	}

}
