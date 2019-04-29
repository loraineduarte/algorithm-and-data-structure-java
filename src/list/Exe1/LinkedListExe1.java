package list.Exe1;

public class LinkedListExe1 {
	
	private NodeExe1 head;
	private int count;
	
	public LinkedListExe1() {
		head = null;
		count = 0;
	}
	
	public LinkedListExe1(LinkedListExe1 rhs) {   //Copy constructor
		head = rhs.head;
		count = rhs.count;
	}
	
	public void orderedInsert(int item) {   //Inserts the NodeExe1 in the right position - Ascending
		NodeExe1 back = null;
		NodeExe1 newNode = new NodeExe1(item);
		NodeExe1 pointer = head;
		boolean found = false;
		
		while (pointer != null && !found) {
			if (pointer.getData() > item)
				found = true;
			else {
				back = pointer;
				pointer = pointer.getNext();
			}
		}
		newNode.setNext(pointer);
		if (back == null) {
			head = newNode;
			count++;
		} else {
			back.setNext(newNode);
			count++;
		}
	}
	
	public void insert(int item) {   //Inserts at front of list
		NodeExe1 newnode = new NodeExe1(item);
		if (head == null)
			head = newnode;
		else {
			newnode.setNext(head);
			head = newnode;
		}
		count++;
	}
	
	public void orderedRemove(int item) {   //Searches and removes selected NodeExe1
		NodeExe1 back = null;
		boolean found = false;
		NodeExe1 pointer = head;
		
		while (pointer != null && !found) {
			if (pointer.getData() == item)
				found = true;
			else {
				back = pointer;
				pointer = pointer.getNext();
			}
		}
		if (found)
			if (back == null) {
				head = pointer.getNext();
				count--;
			} else {
				back.setNext(pointer.getNext());
				count--;
			}
		else
			System.out.println("Data not found in list.");
	}
	
	public void remove() {   //Removes from front of list
		if (head == null)
			System.out.println("List is currently empty.");
		else {
			NodeExe1 n = head;
			head = head.getNext();
			n.setNext(null);
			count--;
		}
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public void print() {
		NodeExe1 current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public int size() {
		return count;
	}
	
	public NodeExe1 getHead() {
		return head;
	}
	
	public void setHead(NodeExe1 n) {
		head = n;
	}
	
	//pegar valor da posicao
	
	public int get(int position) {
		//pegar o valor da posicao
		NodeExe1 node = head;
		
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
		return node.getData();
	}
	
	public boolean contains(int obj) {
		NodeExe1 pointer = head;
		
		while (pointer != null) {
			if (pointer.getData() == obj)
				return true;
			else {
				pointer = pointer.getNext();
			}
		}
		return false;
	}
	
	
}