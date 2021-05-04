package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car i10= new Car();
		
		i10.make =2014;
		i10.color="White";
		i10.transmission="Power";
		
		//Using Car methods
		
		i10.displayCharacteristics();
		i10.accelerate();
		i10.brake();
	}

}
