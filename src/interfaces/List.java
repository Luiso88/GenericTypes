package interfaces;

public class List {

	private Node start;
	public List() {
		start = null;
	}
	public void add(T object) {
		Node element = new Node(object);
		if (start != null) {
			this.start = element; 
		}
		else {
			Node aux;
			for(aux=start;aux.getNext() !=null;aux=aux.getNext());
			aux.putNext(element); 
		}
		
	}
	
	public void imprimir() {
		for(Node aux=inicio;aux!=null;aux=aux.getNext()) {
			System.out.println(b);
		}
	}
	
}
