import java.util.LinkedList;
import java.util.Queue;
/**
 * @author Yuting
 * @param <T>
 *
 */
public class BinaryLinkedTree<T>{
	
	/** The root of the tree*/
	private BinaryTreeNode<T> root;
	
	
	/**
	 * Creates a new tree with a null root
	 */
	public BinaryLinkedTree() {
		this.root = null;
	}
	
	/**
	 * Creates a new tree with a root
	 */
	public BinaryLinkedTree(BinaryTreeNode<T> root) {
		this.root = root;
	}
	
	public BinaryLinkedTree(T data) {
		this.root = new BinaryTreeNode<>(data);
	}
	
	/**
	 * Wrapper method for adding data to the tree
	 * @param data
	 */
	public void add(T data) {
		add(data, this.root);
	}
	
	/**
	 * adds the data to the tree
	 * @param data
	 * @param root
	 */
	public void add(T data, BinaryTreeNode<T> root) {
		
		if (root == null) {
			root = new BinaryTreeNode<T>(data);
			this.root = root;
		}else {
			
			Queue<BinaryTreeNode<T>> q = new LinkedList<BinaryTreeNode<T>>();
			
			q.add(root);

			while (!q.isEmpty()) {
				
				BinaryTreeNode<T> curr = q.poll();
				
				if (curr.getLeftChild() == null) {
					curr.setLeftChild(new BinaryTreeNode<T>(data));
					return;
				}else if (curr.getRightChild() == null) {
					curr.setRightChild(new BinaryTreeNode<T>(data));
					return;
				}else {
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
	public void printTree() {
		printTree(this.root);
	}
	
	/**
	 * Prints the tree
	 * @param root
	 */
	public void printTree(BinaryTreeNode<T> root) {
		
		System.out.print("[ ");
		
		Queue<BinaryTreeNode<T>> q = new LinkedList<>();
		
		q.add(root);
		
		while (!q.isEmpty()) {
			
			BinaryTreeNode<T> curr = q.poll();
			
			System.out.print(curr.getData().toString() + ' ');
			
			if (curr.hasLeftChild()) {
				q.add(curr.getLeftChild());
			}
			
			if (curr.hasRightChild()) {
				q.add(curr.getRightChild());
			}
			
		}
		
		System.out.println("]");
		
	}
	
	/**
	 * 
	 */
	private void printPreOrder(BinaryTreeNode<T> root) {
		
		if (root == null) {
			return;
		}
		
		
		
	}
	
}
