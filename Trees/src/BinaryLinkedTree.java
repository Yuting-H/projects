import java.util.LinkedList;
import java.util.Queue;
/**
 * @author Yuting
 * @param <T>
 *
 */
public class BinaryLinkedTree<T>{
	
	private BinaryTreeNode<T> root;
	
	
	/**
	 * 
	 */
	public BinaryLinkedTree() {
		this.root = null;
	}
	
	/**
	 * 
	 */
	public BinaryLinkedTree(BinaryTreeNode root) {
		this.root = root;
	}
	
	public void add(T data) {
		add(data, this.root);
	}
	
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
	 * wrapper method
	 */
	public void printTree() {
		printTree(this.root);
	}
	
	public void printTree(BinaryTreeNode<T> root) {
		
		Queue<BinaryTreeNode<T>> q = new LinkedList<>();
		
		q.add(root);
		
		while (!q.isEmpty()) {
			
			BinaryTreeNode<T> curr = q.poll();
			
			if (!curr.hasChild()) {
				System.out.println(curr.getData().toString() + ' ');
			}
			
			if (curr.getLeftChild() != null) {
				q.add(curr.getLeftChild());
			}
			
			if (curr.getRightChild() != null) {
				q.add(curr.getRightChild());
			}
			
		}
		
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
