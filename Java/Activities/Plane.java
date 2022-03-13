package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;

	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList();

	}

	public void onBoard() {
		System.out.println("Adding Passengers list");
		passengers.add("Passenger1");
		passengers.add("Passenger2");
		passengers.add("Passenger3");
		passengers.add("Passenger4");

	}

	public Date takeOff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
	}

	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();

	}

	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}

	public List<String> getPassengers() {

		return passengers;

	}

}
