package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		List<String> mylist = new ArrayList<String>();
		mylist.add("First");
		mylist.add("Second");
		mylist.add("Third");
		mylist.add("Fourth");
		mylist.add("Fifth");
		for (String s : mylist)
			System.out.println(s);
		System.out.println("Third Element in the list :" + mylist.get(2));
		if (mylist.contains("Fifth"))
			System.out.println("List contains String");
		else
			System.out.println("List doesn't contain String ");
		System.out.println("Total number of elements in list before remove operation are:" + mylist.size());
		mylist.remove(4);
		System.out.println("Total number of elements in list after remove operation are:" + mylist.size());

	}

}
