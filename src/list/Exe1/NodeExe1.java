package list.Exe1;

public class NodeExe1 {
	
	private int data;
	private NodeExe1 next;
	
	public NodeExe1() {
		next = null;
	}
	
	public NodeExe1(int d) {
		next = null;
		data = d;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int newData) {
		data = newData;
	}
	
	public NodeExe1 getNext() {
		return next;
	}
	
	public void setNext(NodeExe1 newNode) {
		next = newNode;
	}
	
}