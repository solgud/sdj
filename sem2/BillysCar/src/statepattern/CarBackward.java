package statepattern;

public class CarBackward extends CarState
{

	@Override
	public void pressButton(Car car)
	{
		car.setState(OFF_AFTER_BACKWARD);
	}

	@Override
	public String getStatus()
	{
		return "Moving backwards!";
	}

}
