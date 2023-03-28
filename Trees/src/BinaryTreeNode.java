
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
	
	/**
	 * 
	 */
	public boolean hasChild() {
		
		if (this.leftChild != null || this.rightChild != null) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public boolean hasLeftChild() {
		if (this.leftChild != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean hasRightChild() {
		if (this.rightChild != null) {
			return true;
		}else {
			return false;
		}
	}
	
	
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * @return the leftChild
	 */
	public BinaryTreeNode<T> getLeftChild() {
		return leftChild;
	}
	
	/**
	 * @return the rightChild
	 */
	public BinaryTreeNode<T> getRightChild() {
		return rightChild;
	}
	
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(BinaryTreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}
	
	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(BinaryTreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
