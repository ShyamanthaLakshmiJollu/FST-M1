package activities;

public class Activity4 {

	public void beforeSort(int[] bsort) {
		System.out.println("Before sort :");
		for (int i=0;i<=bsort.length-1;i++) {
			
			System.out.println(bsort[i]);
		}
	}

	public void afterSort(int[] arr) {
		System.out.println("After sort :");
		for (int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			while ((i > -1) && (arr[i] > key)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = key;
		}
       for (int i=0;i<=arr.length-1;i++) {
			
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		int[] a = { 10, 70, 40, 60, 0, 4, 2 };
		Activity4 obj = new Activity4();
		obj.beforeSort(a);
		obj.afterSort(a);

	}

}
