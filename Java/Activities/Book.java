package activities;

public abstract class Book {

	String title;

	abstract void setTitle(String s);

	public void getTitle() {
		System.out.println(title);
	}

}
