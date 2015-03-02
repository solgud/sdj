package statepattern;

public class CarOffInitial extends CarState
{

	@Override
	public void pressButton(Car car)
	{
		car.setState(FORWARD);
	}
	
	@Override
	public String getStatus()
	{
		return "Car is off";
	}

}
