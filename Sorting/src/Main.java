
/**
 * @author Yuting
 * This is the main class
 * used for testing purposes
 */
public class Main {

	public static void main(String[] args) {
		
		int[] arr = Array.NewRandomArray(10);
		
		Array.printArray(arr);
		
		InsertionSort.stackSort(arr);
		
		Array.printArray(arr);
		
	}
	
}
