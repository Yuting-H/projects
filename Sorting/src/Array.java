import java.util.Random;

/**
 * @author Yuting
 * This class contains useful methods for sorting
 */
public class Array {

	/**
	 * Generates a random array with lower bound 1 and upper bound 100
	 * @param size the size of the desired array
	 * @return
	 */
	public static int[] NewRandomArray(int size) {
		
		int[] returnArr = new int[size];
		
		Random rand = new Random();
		
		for (int i = 0; i < returnArr.length; i++) {
			returnArr[i] = (int) (rand.nextDouble()*100);
		}
		
		return returnArr;
	}
	
	@Deprecated
	public static void scramble(int[] arr) {
		
	}
	
	/**
	 * This method prints the element of the array
	 * @param arr the integer array
	 */
	public static void printArray(int[] arr) {
		
		System.out.print("[ ");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ' ');
		}
		
		System.out.print("]");
	}
	
}
