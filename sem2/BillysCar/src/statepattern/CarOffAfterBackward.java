package statepattern;

public class CarOffAfterBackward extends CarState {

	@Override
	public void pressButton(Car car) {
		
		car.setState(HEADLIGHTS);

	}

	public String getStatus() {
		return "Off!";
	}

}
