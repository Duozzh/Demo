package Collection;
import java.util.LinkedList;
public class Queue {
	private LinkedList list = new LinkedList();
	public void put(Object o) {
		list.addLast(o);
	}
	public Object get() {
		return list.removeFirst();
		
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.put("one");
		queue.put("two");
		queue.put("three");
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.get());
		System.out.println(queue.isEmpty());
		
	}
}
