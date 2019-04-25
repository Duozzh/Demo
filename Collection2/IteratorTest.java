package Collection2;
import java.util.HashSet;
import java.util.Iterator;
public class IteratorTest {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
 		set.add("d");
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			String value = (String)iter.next();
//			System.out.println(value);
		for(Iterator<String> iter = set.iterator();iter.hasNext();) {
			String value = iter.next();
			System.out.println(value);
		}
//		}
	}
}
  