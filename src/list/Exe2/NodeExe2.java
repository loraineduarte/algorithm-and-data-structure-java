package list.Exe2;

public class NodeExe2 {
	
	private String data;
	private NodeExe2 next;
	
	public NodeExe2() {
		next = null;
	}
	
	public NodeExe2(String d) {
		next = null;
		data = d;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String newData) {
		data = newData;
	}
	
	public NodeExe2 getNext() {
		return next;
	}
	
	public void setNext(NodeExe2 newNode) {
		next = newNode;
	}
	
}