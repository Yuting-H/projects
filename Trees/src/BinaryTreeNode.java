
/**
 * @author Yuting
 *
 */
public class BinaryTreeNode {

	private int data;
	
	private BinaryTreeNode rightChild;
	
	private BinaryTreeNode leftChild;
	
	/**
	 * 
	 */
	public BinaryTreeNode() {
		
		this.data = 0;
		
		this.rightChild = null;
		
		this.leftChild = null;
		
	}
	
	public BinaryTreeNode (int data){
		
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
	public int getData() {
		return data;
	}
	
	/**
	 * @return the leftChild
	 */
	public BinaryTreeNode getLeftChild() {
		return leftChild;
	}
	
	/**
	 * @return the rightChild
	 */
	public BinaryTreeNode getRightChild() {
		return rightChild;
	}
	
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(BinaryTreeNode leftChild) {
		this.leftChild = leftChild;
	}
	
	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(BinaryTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
