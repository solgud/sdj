package statepattern;

public class CarOffAfterBackward extends CarState
{

	@Override
	public void pressButton(Car car)
	{

		car.setState(HEADLIGHTS_AFTER_BACKWARD);

	}

	public String getStatus()
	{
		return "Car is off";
	}

}
