import java.util.Random;

/**
 * @author Yuting
 * This is the main class
 * used for testing purposes
 */
public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (rand.nextDouble()*100);
		}
		
		System.out.println(arrToString(arr));
	
	}
	
	public static String arrToString(int[] arr) {
		String reString = "";
		reString += "[";
		for (int i = 0; i < arr.length; i++) {
			reString += arr[i] + " ";
		}
		reString += "]";
		return reString;
	}
	
}
