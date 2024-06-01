package tubes;

public class StrukturStack {
	private Node TOP;
	private int capacity;
	
	public boolean isFull() {
		int i = 0;
		Node curNode = TOP;
		while (curNode != null) {
			curNode = curNode.getNext();
			i++;
		}
		return i == capacity;
	}
	
	public boolean isEmpty() {
		return TOP == null;
	}
	
	public StrukturStack(int capacity) {
		this.capacity = capacity;
	}
	
	public void push(Transaksi data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			TOP = newNode;
		}
		else if (isFull()) {
			System.out.println("Stack Penuh. Tidak ada transaksi yang dapat ditambahkan.");
		}
		else {
			newNode.setNext(TOP);
			TOP = newNode;
		}
	}
	
	public void dispose(Node temp) {
		temp.setNext(null);
		temp = null;
	}
	public void pop() {
		if (TOP == null) {
			System.out.println("Stack Kosong. Tidak ada transaksi yang dapat dihapus.");
		}
		else {
			Node temp = TOP;
			TOP = TOP.getNext();
			dispose(temp);
		}
	}
	
	public int size() {
		int size = 0;
		Node curNode = TOP;
		while (curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}
	public String top() {
		return TOP != null ? TOP.getData().getKode() : null ;
	}
	/*
	public void displayElement() {
		
		System.out.print("size: " + size()
		+ "\nEmpty: " + isEmpty()
		+ "\nFull: " + isFull()
		+ "\nTop: " + top()
		+ "\nIsi Stack: \n");
		
		if (isEmpty()) {
			System.out.println("Tidak ada transaksi yang telah terjadi.\n");
		}
		else {
			Node curNode = TOP;
			while (curNode != null) {
				System.out.print("Kode Transaksi: " + curNode.getData().getKode()
						+ "\nTanggal Transaksi: " + curNode.getData().getTgl()
						+ "\nJam Transaksi: " + curNode.getData().getJam()
						+ "\nDebit: " + curNode.getData().getDebit() + "\n\n");
				curNode = curNode.getNext();
			}
		}
	}
	*/
	public void display() {
		if (isEmpty()) {
			System.out.println("Tidak ada transaksi yang telah terjadi.\n");
		}
		else {
			Node curNode = TOP;
			while (curNode != null) {
				System.out.print("Kode Transaksi: " + curNode.getData().getKode()
						+ ", Tanggal Transaksi: " + curNode.getData().getTgl()
						+ ", Jam Transaksi: " + curNode.getData().getJam()
						+ ", Debit: " + curNode.getData().getDebit() + "\n\n");
				curNode = curNode.getNext();
			}
		}
	}
}
