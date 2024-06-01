package tubes;

public class Node {
	private Transaksi data;
	private Node next;
	
	public Node(Transaksi data) {
		this.data = data;
	}

	public Transaksi getData() {
		return data;
	}

	public void setData(Transaksi data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
}
