package activities;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	Car() {
		tyres = 4;
		doors = 4;
	}

	public void displayCharacteristics() {
		System.out.println("A " + color + " color " + transmission+ " transmission car,"
				            + " which is manufactured in " + make + " have " + tyres 
				            + " tyres and " + doors + " doors ");
	}

	public void accelarate() {
		System.out.println("Car is moving forward.");
	}

	public void brake() {
		System.out.println("Car has stopped.");
	}

}
