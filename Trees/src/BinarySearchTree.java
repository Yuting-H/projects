
/**
 * @author Yuting
 * @param 
 *
 */
public class BinarySearchTree extends BinaryTree{

	/**
	 * constructs a tree with root = null
	 */
	public BinarySearchTree() {
		
		super();
		
	}
	
	/**
	 * constructs a tree with root storing data
	 * @param data
	 */
	public BinarySearchTree(int data) {
	
		super(data);
		
	}
	
	/**
	 * driver function for adding to tree
	 * @param data
	 */
	public void add(int data) {
		 
		recursiveAdd(super.root, data);
		
	}

	/**
	 * recursively add to tree
	 * @param root
	 * @param data
	 */
	public void recursiveAdd(BinaryTreeNode root, int data){
		
		if (root == null) {
			root = new BinaryTreeNode(data);
		}

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
