package Collection;
import java.util.LinkedList;
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("B");
		list.add("C");
		list.add("D");
		list.addLast("Z");
		list.addFirst("A");
		list.add(1,"A2");
		System.out.println(list);
		list.remove("B");
		list.remove(2);
		System.out.println(list);
		Object value = list.get(2);
		list.set(2,(String)value+"F");
		System.out.println(list);
	}
}
 