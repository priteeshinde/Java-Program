
public class SportCar extends Car{
	private String AirBalloonType;
	
	
	public SportCar(int speed, int noofgear, String airBalloonType) {
		super(speed, noofgear);
		AirBalloonType = airBalloonType;
	}

	void derive()
	{
		System.out.println("");
	}
}
