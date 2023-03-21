
/**
 * @author Yuting
 *
 */
public class BinaryTreeNode<T> {

	private T data;
	
	private BinaryTreeNode<T> rightChild;
	
	private BinaryTreeNode<T> leftChild;
	
	/**
	 * 
	 */
	public BinaryTreeNode() {
		
		this.data = null;
		
		this.rightChild = null;
		
		this.leftChild = null;
		
	}
	
	public BinaryTreeNode (T data){
		
		this.data = data;
		
		this.rightChild = null;
		
		this.leftChild = null;
		
	}
	
}
