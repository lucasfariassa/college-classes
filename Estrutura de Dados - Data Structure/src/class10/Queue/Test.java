package class10.Queue;

public class Test {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue("Lucas");
		System.out.println("N� adicionado - Added node: " + q.rearContent());
		q.enqueue("Jo�o");
		System.out.println("N� adicionado - Added node: " + q.rearContent());
		q.enqueue("Pedro");
		System.out.println("N� adicionado - Added node: " + q.rearContent());
		q.enqueue("Paulo");
		
		System.out.println();
		System.out.println("A fila tem " + q.size + " n�(s) - The queue has " + q.size() + " node(s)");
		System.out.println();
		
		q.find("Pedro");
		System.out.println();
		q.find("Tiago");
		System.out.println();

		
		while(!q.isEmpty()) {
			System.out.println("N� desinfileirado - Dequeued node: " + q.dequeue());
		}
		
		
		System.out.println();
		System.out.println("A fila tem " + q.size + " n�(s) - The queue has " + q.size() + " node(s)");
	}

}
