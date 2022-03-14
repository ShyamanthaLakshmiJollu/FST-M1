package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		Map<Integer, String> colours = new HashMap<Integer, String>();
		colours.put(1, "Red");
		colours.put(3, "Yellow");
		colours.put(2, "Green");
		colours.put(4, "Indigo");
		colours.put(5, "Black");
		// Printing Elements exist in Map
		System.out.println("Elements exist in Map are: " + colours);
		// Remove one colour: Black from Map
		System.out.println("Removed Black colour : " + colours.remove(4));
		// Checking Green colour exist in Map or not
		if (colours.containsValue("Green")) {
			System.out.println("Green colour exist in Map");
		} else
			System.out.println("Green colour not found in Map");
		// Printing number of elements exist in Map
		System.out.println("Number of elements exist in map are:" + colours.size());

	}

}
