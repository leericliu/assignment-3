
public class DoubleList<T> {
	private DoubleNode<T> head;
	private DoubleNode <T> rear;
	private int numDataItems;
	
	public DoubleList() {
		head = null;
		rear = null;
		numDataItems = 0;
				
	}
	public void addData (int index, T newData) throws InvalidPositionException {
		   DoubleNode newNode=new DoubleNode(newData);
	       
		 if(index<0||index>numDataItems)
	           throw new InvalidPositionException(null);
		 
		  if(index == 0)
	       {
	         newNode.setNext(head);
	         newNode.setPrev(null);
	         if (head == null) {
	        	 head.setPrev(newNode);
	         }
	         head = newNode;
	         numDataItems++;
	       }
		  
		 if (index == numDataItems) {
			 rear = head;
			 newNode.setNext(null);
			 if ( head == null) {
				 newNode.setPrev(null);
				 head = newNode;
						 return;
			 }
			 while (rear.getNext() != null) {
				 rear = rear.getNext();
				 
			 }
			 newNode = rear.getNext();
			 rear = newNode.getNext();
			 numDataItems++;
		 }
			 
		 if (index > 0) {
			 
				for (int i = 1; i < index; i++) {
					head.setNext(head);
				newNode.setNext(head);
				head.setNext(newNode);
				newNode.setPrev(head);
				newNode.setNext(newNode);
				newNode.setPrev(newNode);
				numDataItems++;
		 }
		 
	}

}
	public DoubleNode<T> getNode (int index) throws InvalidPositionException{
		if ( index < 0 || index >= numDataItems) 
			throw new InvalidPositionException("Invalid Position");
		
	}
	
	public T getData(int index) throws InvalidPositionException{
		DoubleNode temp = null;
		temp = getNode(index);
		return (T) temp.getData();
	}
	public void setData(int index, T newData) throws InvalidPositionException{
		DoubleNode temp;
		temp = getNode(index);
		temp.setData(newData);
	}
}
