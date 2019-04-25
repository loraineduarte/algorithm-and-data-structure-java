package list;

public interface List<T> {
	
	void add(T obj);
	
	void set(int position, T obj);
	
	void remove(T obj);
	
	void remove(int position);
	
	T get(int position);
	
	T first();
	
	T last();
	
	boolean isEmpty();
	
	boolean contains(T obj);
	
	String toString();
	
	int size();
}
