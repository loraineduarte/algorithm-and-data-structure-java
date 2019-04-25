package list;

public class LinkedList<T> implements List<T> {
	
	private Node<T> list;
	private int size = 0;
	
	public LinkedList() {
		this.list = null;
	}
	
	//adicionar objeto
	@Override
	public void add(T obj) {
		
		Node<T> node = new Node<>(obj);
		
		if (list == null) {
			list = node;
		} else {
			node.setNext(list);
			list = node;
		}
		size++;
		
	}
	
	//adicionar na posicao
	@Override
	public void set(int position, T obj) {
		
		Node<T> node = list;
		
		int i = 0;
		if (position == 0)
			while (node.getNext() != null) {
				if (i - 1 == position) {
					node.getNext().setValue(obj);
				}
				
				node = node.getNext();
				i++;
			}
		size++;
	}
	
	//remover objeto
	@Override
	public void remove(T obj) {
		//remover
		
		Node<T> node = list;
		
		if (node.getValue().equals(obj)) {
			list = node.getNext();
			node.setNext(null);
		} else {
			
			while (node.getNext() != null) {
				
				if (node.getNext().getValue().equals(obj)) {
					break;
				}
				
				node = node.getNext();
				
			}
			
			Node aux = node.getNext();
			node.setNext(aux.getNext());
			aux.setNext(null);
			
		}
		size--;
		
	}
	
	//remover na posicao
	@Override
	public void remove(int position) {
		//remover na posicao
		
		Node<T> node = list;
		
		int i = 0;
		
		while (node.getNext() != null) {
			
			if (i == position) {
				break;
			}
			node = node.getNext();
			i++;
		}
		
		Node aux = node.getNext();
		node.setNext(aux.getNext());
		aux.setNext(null);
		size--;
	}
	
	//pegar valor da posicao
	@Override
	public T get(int position) {
		//pegar o valor da posicao
		Node<T> node = list;
		
		int i = 1;
		
		while (node.getNext() != null) {
			if (i - 1 == position) {
				break;
			}
			node = node.getNext();
			i++;
		}
		// Aqui você está retornando um nó, não o valor dele.
		// return (T) node.getNext();
		// O correto seria
		return node.getValue();
	}
	
	//pegar primeiro valor da lista
	@Override
	public T first() {
		//pegar o primeiro da lista
		return list.getValue();
	}
	
	//pegar ultimo valor da lista
	@Override
	public T last() {
		Node<T> node = list;
		
		while (node.getNext() != null) {
			node = node.getNext();
		}
		//ultimo elemento da lista
		return node.getValue();
	}
	
	//verificar se a lista esta vazia
	@Override
	public boolean isEmpty() {
		
		return list == null;
	}
	
	//verificar se contem o objeto na lista
	@Override
	public boolean contains(T obj) {
		//verificar se contem
		
		Node<T> node = list;
		//retorno funciona como um break, se ele fizer o retorno o laco eh interrompido
		while (node.getNext() != null) {
			if (node.getNext().getValue().equals(obj)) {
				return true;
			}
			// Essa linha estava ausente
			node = node.getNext();
		}
		return false;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	
}