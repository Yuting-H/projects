
/**
 * @author Yuting
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		BinaryTree tree = new BinaryTree();
		
		tree.add(1, null);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(6);
		
		tree.printPreOrder();
		
		
	}

}
