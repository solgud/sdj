package statepattern;

public class CarHeadlightsAfterBackward extends CarState
{

	@Override
	public void pressButton(Car car)
	{
		car.setState(OFF_INITIAL);
	}

	@Override
	public String getStatus()
	{
		return "Shining headlights!";
	}

}
