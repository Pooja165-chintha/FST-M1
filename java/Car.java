package activities;

public class Car {
	
	String color,transmission;
	int tyres, doors, make;

	Car()
	{
		tyres=4;
		doors=4;
	}

	public void displayCharacteristics() {
		System.out.println("Color of the Car : "+ color);
		System.out.println("Make of the Car : "+ make);
		System.out.println("No.of doors on Car "+ doors);
		System.out.println("No.of tyres on Car: "+ tyres);
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}
}
