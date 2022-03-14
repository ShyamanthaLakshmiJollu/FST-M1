package activities;

public class Activity8 {

	public static void exceptionTest(String str) throws CustomException {
		if (str == null) {
			throw new CustomException("String Value is null");
		} else
			System.out.println(str);

	}

	public static void main(String[] args) {
		try {
	      Activity8.exceptionTest("User provided message");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("User message after raising exception");
			
		} catch (CustomException exe) {
			System.out.println("Inside catch block:" + exe.getMessage());
		}

	}

}
