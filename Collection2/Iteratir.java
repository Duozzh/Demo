package Collection2;

import java.util.HashSet;
import java.util.Iterator;

public class Iteratir {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("a");
		set.add("b");
		set.add("c");
		for(Iterator<String> iter = set.iterator();iter.hasNext();) {
			String value = (String)iter.next();
			System.out.println(value);
		}
	}
}
