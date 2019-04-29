package list.Exe2;

public class LinkedListExe2 {
	
	private NodeExe2 head;
	private int count;
	
	public LinkedListExe2() {
		head = null;
		count = 0;
	}
	
	public LinkedListExe2(LinkedListExe2 rhs) {   //Copy constructor
		head = rhs.head;
		count = rhs.count;
	}
	
	public void orderedInsert(String item) {   //Inserts the NodeExe1 in the right position - Ascending
		NodeExe2 back = null;
		NodeExe2 newNode = new NodeExe2(item);
		NodeExe2 pointer = head;
		boolean found = false;
		
		while (pointer != null && !found) {
			if (pointer.getData().compareTo(item) > 0)
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
	
	public void insert(String item) {   //Inserts at front of list
		NodeExe2 newnode = new NodeExe2(item);
		if (head == null)
			head = newnode;
		else {
			newnode.setNext(head);
			head = newnode;
		}
		count++;
	}
	
	public void orderedRemove(String item) {   //Searches and removes selected NodeExe1
		NodeExe2 back = null;
		boolean found = false;
		NodeExe2 pointer = head;
		
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
			NodeExe2 n = head;
			head = head.getNext();
			n.setNext(null);
			count--;
		}
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public void print() {
		NodeExe2 current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
	
	public int size() {
		return count;
	}
	
	public NodeExe2 getHead() {
		return head;
	}
	
	public void setHead(NodeExe2 n) {
		head = n;
	}
	
	//pegar valor da posicao
	
	public String get(int position) {
		//pegar o valor da posicao
		NodeExe2 node = head;
		
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
	
	public boolean contains(String obj) {
		NodeExe2 pointer = head;
		
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