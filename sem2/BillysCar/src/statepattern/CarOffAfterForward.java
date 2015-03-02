package statepattern;

public class CarOffAfterForward extends CarState
{

	@Override
	public void pressButton(Car car)
	{
		car.setState(HEADLIGHTS_AFTER_FORWARD);

	}

	public String getStatus()
	{
		return "Car is off";
	}

}
