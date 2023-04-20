
/**
 * @author Yuting
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		BinaryLinkedTree<Integer> tree = new BinaryLinkedTree<>();
		
		tree.add(1, null);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(6);
		
		tree.printPreOrder();
		
		
	}

}
