import java.util.Stack;

/**
 * @author Yuting
 *
 */
public class InsertionSort {

	/**
	 * Sorts the array in place
	 */
	public static void inPlaceSort(int[] arr) {
		
		if (arr.length < 2) {
			return;
		}

		//for all 
		for (int i = 0; i < arr.length - 2; i++) {
			
			

		}

	}

	/**
	 * Intsertion sort using stacks
	 * @param arr
	 */
	public static void stackSort(int[] arr) {
		
		if (arr.length < 2) {
			return;
		}
		
		Stack<Integer> temp = new Stack<>();
		
		Stack<Integer> sorted = new Stack<>();

			//add the first element to sorted
			sorted.add(arr[0]);
			
			//for all the element in this array
			for (int i = 1; i < arr.length; i++) {
				
				//if the top element of sorted is smaller than the current element
				while (!(sorted.isEmpty()) && sorted.peek() < arr[i]) {
					
					//pops the smaller element and push it into temp
					temp.push(sorted.pop());
				}
				
				sorted.push(arr[i]);
				
				while (!temp.isEmpty()) {
					sorted.push(temp.pop());
				}
				
			}
			
			//saves to array
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sorted.pop();
			}
		
		
	}

}
