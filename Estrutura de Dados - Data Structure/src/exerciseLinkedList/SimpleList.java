package exerciseLinkedList;

public class SimpleList {
    Node head = null; // defini��o do in�cio da lista - definition of the head of the list
    int size = 0; // vari�vel de tamanho da lista - list size variable

    public void insertHead(String info) { // inserir no in�cio da lista - insert a node at the head of the list
        Node node = new Node();
        node.info = info; // registra o dado recebido pelo par�metro - registers the data received from parameter
        node.next = head; /* o "pr�ximo" do novo n� aponta para a atual localiza��o do in�cio da lista -
							the "next" of the new node point to current localization of the head of the list */
        head = node; // o início se torna o n� recém criado - the head become the newly created node
        size++; /* aumenta a lista, pois foi adicionado um novo n� - increases the list because a new node
                has just been created */
    }

    public void insertTail(String info) { // inserir no final da lista - insert a node at the tail of the list
        Node node = new Node();
        node.info = info;
        if (head == null) { /* verifica se h� apenas um n� existente para adicionar um ao final dele -
							checks if there is only one node in the list to be able to insert a new one
							at the end of it */
            head = node;
            node.next = null;
        } else { /* verifica quantos n�s existem para adicionar um ao final - checks how many nodes there are
                    to add one to the end */
            Node local = head; /* ponteiro auxiliar de localiza��o (inicialmente aponta para o in�cio da lista) -
                                location helper pointer (initially points to the beginning of the list) */
            while (local.next != null) { /* verifica se o "pr�ximo" do n� est� apontando para null - checks if the
                                        "next" of the node is pointing to null */
                local = local.next; /* caso o n� aponte para o null, o ponteiro "local" finalmente encontra
                                    o �ltimo n� - if the node points to null, the "local" pointer finally finds
                                    the last node */
            }
            local.next = node; /* define que o n� que est� na localiza��o atual do ponteiro "local" agora aponte para
                                o n� rec�m-criado - sets that the node that is at the current location of the "local"
                                pointer will now point to the newly created node */
            node.next = null; /* define que o n� rec�m criado aponte para o null, fazendo-o se tornar o �ltimo da
                                 lista - sets the newly created node to point to null, making it the last one
                                 in the list */
            size++;
        }
    }

    public String removeNode(int position) { /*  remover um n� de uma posi��o desejada � remove a node from a specific
                                                desired position */
        if(position < 0 || position >= size || head == null) {
            return null;
        } else if (position == 0) {
            return removeHead();
        } else if (position == size-1) {
            return removeTail();
        }
        Node local = head;
        for (int i = 0; i < position-1; i++) { /* localiza o n� anterior ao que se deseja remover - finds the node
                                                before the one you want to remove */
            local = local.next; /* salva a posi��o do que o n� exclu�do est� apontando - saves the position of what
                                the deleted node is pointing to */
        }
        String info = local.next.info; // exibe a informa��o apagada - show the information erased
        local.next = local.next.next; /* define que o "pr�ximo" do "pr�ximo" (o elemento ap�s ao que se deseja remover)
                                        ser� o novo "pr�ximo" do n� anterior ao que foi retirado - defines that the
                                        "next" of the "next" (the element after the one to be removed) will be the
                                        new "next" of the node before the one that was removed */
        size--;
        return info;
    }

    private String removeHead() { // remover o primeiro n� da lista
        if (head == null) { // testa se a lista est� vazia - tests if the list is empty
            return null;
        }
        String info = head.info; // salva a informa��o para printar o que foi apagado
        head = head.next; // define o ponteiro para o pr�ximo n�, colocando o segundo em primeiro lugar
        size--;
        return info;
    }

    private String removeTail() { // remover o �ltimo n� da lista
        if (head == null) { // testa se a lista est� vazia - tests if the list is empty
            return null;
        }
        Node local = head; // inicializa um ponteiro no in�cio da lista
        while (local.next != null) { // procura o �ltimo n� atrav�s do ponteiro creiado anteriormente
            Node aux = local; /* inicializa um ponteiro que aponta para o local atual e auxiliar na captura da informa��o
            					do n� atual */
            local = local.next;
            if (local.next == null) { /* verifica se o ponteiro "local" do "pr�ximo" est� apontando para o null 
            							(observando que o �ltimo n� sempre aponta para null) */
                aux.next = null;
                size--;
                return local.info; // retorna a informa��o do que foi exclu�do
            }
        }
        head = null;
        size--;
        return local.info;
    }

    public String listSize() { // exibir o tamanho da lista - show list size
        return "Tamanho da Lista - List Size: " + size;
    }
    
    public boolean findNameList() {
    	Node local = beginning;
    	boolean found = false;
    	for (int i = 0; i < size; i++) {
    		if (local.info == info) {
    			found = true;
    		}
    		local = local.next;
    	}
    	return found;
    }

    public String toString() { /* sobrescri��o para personalizar a classe toString do Java - override to customize
                                Java's toString class */
        String str = "(" + size + ") ";
        Node local = head;
        while (local != null) {
            str += "[" + local.info + "] ";
            local = local.next;
        }
        return str;
    }

}