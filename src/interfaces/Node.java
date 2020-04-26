package interfaces;

public class Node <T> {

	private T object;
	private Node nextNode;
	Node(T object) {
		this.object = object;
		this.nextNode = null;
	}
	
	public void putNext(Node n) {
		this.nextNode = n; 
	}
	
	public Node getNext() {
		return this.nextNode;
	}
	
	public T getObject() {
		return this.object;
	}
}
