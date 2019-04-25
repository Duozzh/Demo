package Collection2;
import java.util.HashMap;
public class HashMapTest {
	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashMap map = new HashMap( );
		String str = new String("zhangsan") ;
		map.put("a", str);
		map.put("b", str);
		System.out.println(map);
	}
}
