
public class DoubleNode<T> {
	private DoubleNode<T>next;
	private DoubleNode<T>prev;
	private T data;
	
	public DoubleNode() {
		next = null;
		data = null;
		prev = null;
			
	}
	public DoubleNode (T newData) {
		next = null;
		data = data;
		prev = null;
				
	}
	public DoubleNode<T> getNext(){
		return next;
		
	}
	public DoubleNode<T> getPrev(){
		return prev;
		
	}
	public T getData () {
		return data;
		
	}
	public void setNext (DoubleNode<T> nextNode) {
		next = nextNode;
	}
	public void setPrev (DoubleNode<T> prevNode) {
		prev = prevNode;
		
	}
	public void setData (T newData) {
		data = newData;
	}
	
	
}
