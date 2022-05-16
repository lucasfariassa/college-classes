package class10.Queue;

public class Queue {
	Node rear; // Tamb�m chamado de "in�cio" em portugu�s - also called "tail" in English
	Node front; // Tamb�m chamado de "cabe�a" em portugu�s - also called "head" in English
	int size;

	Queue() {
		front = null;
		rear = null;
		size = 0;
	}

	String frontContent() {
		if (front == null) {
			return "N� n�o encontrado! A fila est� vazia - Node was not found! The queue is empty";
		}
		return front.info;
	}

	String rearContent() {
		if (rear == null) {
			return "N� n�o encontrado! A fila est� vazia - Node was not found! The queue is empty";
		}
		return rear.info;
	}

	int size() {
		return size;
	}

	boolean isEmpty() {
		return rear == null;
	}

	void enqueue(String info) {
		Node node = new Node();
		node.info = info;
		node.next = rear;
		rear = node;
		if (size == 0) {
			front = node;
		}
		size++;
	}

	String dequeue() {
		if (isEmpty()) {
			return "N� n�o encontrado! A fila est� vazia - Node was not found! The queue is empty";
		}
		String info = front.info;
		if (size == 1) {
			rear = null;
			front = null;
		} else {
			Node local = rear;
			while (local.next != front) {
				local = local.next;
			}
			front = local;
			front.next = null;
		}
		size--;
		return info;
	}

	void find(String info) {
		Node local = rear;
		if (isEmpty()) {
			System.out.println("N� n�o encontrado! A fila est� vazia - Node was not found! The queue is empty");
		}
		while (info != local.info) {
			local = local.next;
			if (local.info.equals(info)) {
				System.out.println("N� encontrado - Node was found: " + local.info);
			} else {
				System.out.println("N� " + info + " n�o encontrado! - "  + "Node " + info + " was not found!");
				break;
			}
		}
	}

}
