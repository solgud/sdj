package statepattern;

public class Main
{

	public static void main(String[] args)
	{
		Car car = new Car();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Status is: " + car.getStatus());
			car.pressButton();
		}
	}

}
