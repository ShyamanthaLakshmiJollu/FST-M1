package activities;

public class MountainBike extends Bicycle {

	public int seatHeight;

	public MountainBike(int gears, int currentSpeed, int sHeight) {
		super(gears,currentSpeed);
		seatHeight=sHeight;
	}
	public void setHeight(int newValue) {
        seatHeight = newValue;
    }
	public String bicycleDesc()
	{
		return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	}

	public static void main(String[] args) {
		MountainBike mbike=new MountainBike(2,5,25);
		System.out.println(mbike.bicycleDesc());
		    mbike.speedUp(50);
	        mbike.applyBrake(30);

	}

}
