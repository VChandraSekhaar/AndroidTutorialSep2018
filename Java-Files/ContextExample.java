class Car
{
	int maxSpeed;
	int noOfGears;
	public Car(int cMaxSpeed,int cNoOfGears)
	{
		maxSpeed = cMaxSpeed;
		noOfGears = cNoOfGears;

	}
	public Car()
	{

	}
}

public class ContextExample{
	public static void main(String[] args) {

		Car BMWX1 = new Car();

		BMWX1.maxSpeed = 230;
		BMWX1.noOfGears = 6;

		Car VitarraBrezza = new Car(140,5);

		System.out.println("The Max speed of Vitarra Brezza is "+ VitarraBrezza.maxSpeed);
		
	}
}