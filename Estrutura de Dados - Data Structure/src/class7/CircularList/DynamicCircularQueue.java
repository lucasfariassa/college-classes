package class7.CircularList;

public class DynamicCircularQueue {
	NodeCircularQueue head = null;
	NodeCircularQueue tail = null;

	public boolean empty() { // Testador para verificar se a fila est� vazia - Tester to check if the queue is empty
		return head == null && tail == null;
	}
	
	public void addToQueue(int data) { // Adiciona um novo n� � fila - Adds a new node to queue
		NodeCircularQueue newNode = new NodeCircularQueue(data);
		
		if(empty()) {
			head = newNode;
			tail = newNode;
			tail.next = head;
		} else {
			newNode.next = head;
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public int removeFromQueue() { // N�o est� funcionando corretamente - Not working correctly
		int removed;
		
		if (empty()) {
			removed = -1;
		} else if(head == tail) {
			removed = head.data;
			head = null;
			tail = null;
		} else {
			removed = head.data;
			tail = head;
			head = head.next;
			tail.next = head;
		}
		return removed;
	}
	
	@Override
	public String toString() { // Imprime a fila de n�s - Print the node queue
		String listed = "N�meros - Numbers:" + "\n";
		int number = 1;
		
		if(empty()) {
			return listed = "N�o foi poss�vel encontrar valores cadastrados - Unable to find recorded values";
		} else if(head == tail) {
			listed = listed + number + ". " + head.data;
		} else {
			NodeCircularQueue aux = head;
			if(aux == tail.next) {
				listed = listed + number + ". " + aux.data + "\n";
				aux = aux.next;
				number++;
			}
			while(aux != tail.next) {
				listed = listed + number + ". " + aux.data + "\n";
				aux = aux.next;
				number++;
			}
		}
		return listed;
	}
}
