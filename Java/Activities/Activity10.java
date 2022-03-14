package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		// HashSet Implementation
		Set<String> hs = new HashSet<String>();
		// adding objects to Set
		hs.add("setobj1");
		hs.add("setobj2");
		hs.add("setobj3");
		hs.add("setobj4");
		hs.add("setobj5");
		hs.add("setobj6");
		// printing sie of hashset
		System.out.println("Length of Hashset is :" + hs.size());
		// removing an element from set
		System.out.println("Removed setobj3 element:" + hs.remove("setobj3"));
		// removing an element which is not present in set
		System.out.println("Trying to remove setobj7 element:" + hs.remove("setobj7"));
		// Checking whether setobj6 element exist in set or not
		System.out.println("setobj6 element exist in set:" + hs.contains("setobj6"));
		// Printing updated set
		for (String str : hs)
			System.out.println(str);

	}

}
