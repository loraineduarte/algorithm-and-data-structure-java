package list;

public class Cell {
	
	private Cell nextCell;
	
	private Object element;
	
	public Cell(Cell proxima, Object element) {
		this.nextCell = proxima;
		this.element = element;
	}
	
	public Cell(Object element) {
		this.element = element;
	}
	
	public Cell getNextCell() {
		return nextCell;
	}
	
	public void setNextCell(Cell nextCell) {
		this.nextCell = nextCell;
	}
	
	public Object getElement() {
		return element;
	}
	
}
