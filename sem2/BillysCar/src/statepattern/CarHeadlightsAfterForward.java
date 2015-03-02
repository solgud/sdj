package statepattern;

public class CarHeadlightsAfterForward extends CarState
{

	@Override
	public void pressButton(Car car)
	{
		car.setState(OFF_AFTER_HEADLIGHTS);
	}

	@Override
	public String getStatus()
	{
		return "Shining headlights!";
	}

}
