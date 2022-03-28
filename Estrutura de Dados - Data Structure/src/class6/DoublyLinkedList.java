package class6;

public class DoublyLinkedList {
	Node head; // n� do in�cio - head node
	Node tail; // n� do final - tail node
	int size; // tamanho da lista - list size

	public void insertHead(String info) {
		Node node = new Node();
		node.info = info;
		node.previous = null;
		node.next = head;
		if (size == 0) { // verifica se h� n�s na lista - checks if there is nodes at the list
			tail = head; // define que ambos sejam nulos - defines both to null
		}
		if (head != null) {
			head.previous = node; /* define que o "anterior" do n� inicial aponte para o novo n� (que foi colocado
									na frente dele) - defines that "previous" of the node points to the new node 
									(that was added in front of it) */
		}
		head = node; // o novo n� se torna o in�cio da lista -  the new node becomes the head of the list
		size++;

	}

	public String toString() { /* sobrescri��o para personalizar a classe toString do Java - override to customize Java's 
								toString class */
		String str = "(" + size + ") ";
		Node local = head;
		while (local != null) {
			str += "[" + local.info + "] ";
			local = local.next;
		}
		return str;
	}

}
