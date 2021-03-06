package statepattern;

public class CarForward extends CarState
{

	@Override
	public void pressButton(Car car)
	{
		car.setState(OFF_AFTER_FORWARD);
	}

	@Override
	public String getStatus()
	{
		return "Moving forwards!";
	}

}
