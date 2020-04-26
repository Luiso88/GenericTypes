package interfaces;

public class List <T>{
	private Node start;
	public List() {
		start = null;
	}
	
	public List(T object) {
		Node element = new Node(object);
	}
	
	public void add(T object) {
		Node element = new Node(object);
		if (start == null) {
			this.start = element; 
		}
		else {
			Node aux;
			for(aux=start;aux.getNext()!=null;aux=aux.getNext());
			aux.putNext(element); 
		}	
	}
	
	public void print() {
		for(Node aux=start;aux!=null;aux=aux.getNext()) {
			System.out.println(aux.getObject().toString());
		}
	}
	
}
