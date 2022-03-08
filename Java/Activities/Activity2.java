package activities;

public class Activity2 {

	public static void main(String[] args) {
		int arr[] = { 10, 77, 10, 54, -11, 10 };
		int searchNum = 10;
		int expectedSum = 30;
		System.out.println("Result is:" + logicToImplement(arr, searchNum, expectedSum));

	}

	private static boolean logicToImplement(int[] arr, int searchNum, int expectedSum) {

		int temp = 0;
		for (int x : arr) {
			if (x == searchNum) {
				temp = temp + x;
			}
			if (temp > expectedSum)
				break;

		}
		return temp == expectedSum;
	}
}
