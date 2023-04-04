
/**
 * @author Yuting This class
 */
public class BubbleSortIntegers{

	/**
	 * Sort the array in ascending order
	 * 
	 * @param arr
	 */
	public static void sort(int[] arr) {
		
		int temp;
		
		while (!isSorted(arr)) {
			for (int i = 0; i < arr.length -1; i++) {
				if (arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
	}

	/**
	 * Determines if the arr is sorted
	 */
	private static boolean isSorted(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}

		return true;

	}
}
