package activities;

public class Mybook extends Book {

	public static void main(String[] args) {

		Mybook obj = new Mybook();
		obj.setTitle("Title of Book");
		obj.getTitle();

	}

	@Override
	void setTitle(String s) {
		title = s;

	}

}
