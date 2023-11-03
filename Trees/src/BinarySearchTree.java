
/**
 * @author Yuting
 * @param 
 *
 */
public class BinarySearchTree extends BinaryTree{

	/**
	 * 
	 */
	public BinarySearchTree() {
		
		super();
		
	}
	
	public BinarySearchTree(int data) {
	
		super(data);
		
	}
	
	public void add(int data) {
		
		recursiveAdd(super.root, data);
		
	}

	public void recursiveAdd(BinaryTreeNode root, int data){


		if (data <= root.getData()) {

			if (root.getLeftChild() == null) {
				root.setLeftChild(new BinaryTreeNode(data));
			}else {
				recursiveAdd(root.getLeftChild(), data);
			}
			
		}else if (data > root.getData()) {

			if (root.getRightChild() == null) {
				root.setRightChild(new BinaryTreeNode(data));
			}else {
				recursiveAdd(root.getRightChild(), data);
			}
		}

	}
	
}
