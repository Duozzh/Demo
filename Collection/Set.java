package Collection;
import java.util.HashSet;
public class Set {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println(set);
		System.out.println(set.add("f"));
		System.out.println("-------------------");
		String s1 = new String("A");
		String s2 = new String("A");
		set.add(s1);
		set.add(s2);
		System.out.println(set);

		
	}
} 
