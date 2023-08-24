import java.util.Stack;

/**
 * @author Yuting
 * This 
 */
public class InsertionSort {

	/**
	 * Sorts the array in place
	 */
	public static void inPlaceSort(int[] arr) {
		
		// return if the array length is less than 2
		if (arr.length < 2) {
			return;
		}

		int temp;

		//for all but the last element in array
		for (int i = 0; i < arr.length - 2; i++) {
			
			//compare each i and i+1 
			for (int j = i; j > 0; j--) {
				if (arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1]
					arr[i+1] = temp;
					
				}
			}
			

		}

	}

	/**
	 * Insertion sort using stacks
	 * @param arr
	 */
	public static void stackSort(int[] arr) {
		
		//return if the array is already sorted
		if (arr.length < 2) {
			return;
		}
		// creates new temp and sorted stack
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
