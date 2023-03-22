
/**
 * @author Yuting
 *
 */
public class LinkedNode<T> {
	
	private T data;
	
	private LinkedNode<T> next;
	
	/**
	 * 
	 */
	public LinkedNode() {
		
		this.data = null;
		
		this.next = null;
		
	}
	
	public LinkedNode(T data) {
		
		this.data = data;
		
		this.next = null;
		
	}
	
	public LinkedNode(T data, LinkedNode<T> next) {
		
		this.data = data;
		
		this.next = next;
		
	}
	
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	
	/**
	 * @return the next
	 */
	public LinkedNode<T> getNext() {
		return next;
	}
	
}
