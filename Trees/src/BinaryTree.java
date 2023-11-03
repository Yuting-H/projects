import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Yuting
 * @param 
 *
 */
public class BinaryTree {

	/** The root of the tree */
	private BinaryTreeNode root;

	/**
	 * Creates a new tree with a null root
	 */
	public BinaryTree() {
		this.root = null;
	}

	/**
	 * Creates a new tree with a root
	 */
	public BinaryTree(BinaryTreeNode root) {
		this.root = root;
	}

	/**
	 * Creates a bew tree with data saved in the tree's root
	 * @param data the data saved in the tree's root
	 */
	public BinaryTree(int data) {
		this.root = new BinaryTreeNode(data);
	}

	/**
	 * Wrapper method for adding data to the tree
	 * 
	 * @param data
	 */
	public void add(int data) {
		add(data, this.root);
	}

	/**
	 * adds the data to the tree using preOrder
	 * 
	 * @param data
	 * @param root
	 */
	public void add(int data, BinaryTreeNode root) {

		// add to the root of the tree if the tree's node is null
		if (root == null) {
			root = new BinaryTreeNode(data);
			this.root = root;
		} else { 	//uses level order traversal

			// create a new queue
			Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();

			// add the root to the queue
			q.add(root);

			while (!q.isEmpty()) {

				BinaryTreeNode curr = q.poll();

				if (curr.getLeftChild() == null) {
					curr.setLeftChild(new BinaryTreeNode(data));
					return;
				} else if (curr.getRightChild() == null) {
					curr.setRightChild(new BinaryTreeNode(data));
					return;
				} else {
					if (curr.hasLeftChild()) {
						q.add(curr.getLeftChild());
					}
					if (curr.hasRightChild()) {
						q.add(curr.getRightChild());
					}
				}
			}
		}

	}

	/**
	 * wrapper method to print the tree
	 */
	public void printLevelOrder() {
		printLevelOrder(this.root);
	}
	
	public void printPreOrder() {
		
		System.out.print("[ ");
		printPreOrder(this.root);
		System.out.println("]");
	}

	/**
	 * Prints the tree
	 * 
	 * @param root
	 */
	public void printLevelOrder(BinaryTreeNode root) {

		System.out.print("[ ");

		Queue<BinaryTreeNode> q = new LinkedList<>();

		q.add(root);

		while (!q.isEmpty()) {

			BinaryTreeNode curr = q.poll();

			System.out.printf(" %d",curr.getData());

			if (curr.hasLeftChild()) {
				q.add(curr.getLeftChild());
			}

			if (curr.hasRightChild()) {
				q.add(curr.getRightChild());
			}

		}
		System.out.println("]");
	}
	
	public void printPreOrder(BinaryTreeNode root) {
		
		if (root != null) {
			System.out.printf( " %d", root);
			
			printPreOrder(root.getLeftChild());
			printPreOrder(root.getRightChild());
		}else {
			return;
		}
		
	}

}
