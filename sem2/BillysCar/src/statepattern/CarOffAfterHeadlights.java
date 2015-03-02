package statepattern;

public class CarOffAfterHeadlights extends CarState
{

	public void pressButton(Car car)
	{
		car.setState(BACKWARD);
	}

	public String getStatus()
	{
		return "Car is off";
	}
}
