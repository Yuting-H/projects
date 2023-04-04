import java.util.Random;

/**
 * @author Yuting
 *
 */
public class ScrambleArray {

	/**
	 * Generates a random array with lower bound 1 and upper bound 100
	 * @param size
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
	
}
